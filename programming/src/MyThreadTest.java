import sun.rmi.runtime.Log;

import java.util.LinkedList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

class MyResourse{
	private volatile boolean FLAG = true;
	private AtomicInteger atomicInteger = new AtomicInteger();
	BlockingQueue<String> blockingQueue = null;

	public MyResourse(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
		System.out.println(blockingQueue.getClass().getName());
	}

	public void MyProd() throws Exception{
		String data = null;
		boolean value;
		while (FLAG){
			data = atomicInteger.incrementAndGet()+"";
			value = blockingQueue.offer(data,2,TimeUnit.SECONDS);
			if (value){
				System.out.println(Thread.currentThread().getName() +"\t" +data);
			}else {
				System.out.println(Thread.currentThread().getName() +"\t" +data+ "\t error");
			}
			try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println(Thread.currentThread().getName() + "\t 我靠，我怎么生产不了了！");
	}
	public void MyCosumer() throws Exception{
		String temp = null;
		while (FLAG){
			temp = blockingQueue.poll(2,TimeUnit.SECONDS);
			if (temp == null || temp.equalsIgnoreCase("")){
				FLAG =false;
				System.out.println(Thread.currentThread().getName() + "\t 那我么得了");
				return;
			}
			System.out.println(Thread.currentThread().getName() + "\t 取了" + temp);
		}
	}
	public void stop() throws Exception{
		this.FLAG = false;
	}
}
public class MyThreadTest {
	public static void main(String[] args) throws Exception {
		MyResourse myResourse = new MyResourse(new ArrayBlockingQueue<String>(5));
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		try	{
			executorService.execute(()->{
				System.out.println(Thread.currentThread().getName() + "开始生产");

				try {
					myResourse.MyProd();
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			executorService.execute(()->{
				System.out.println(Thread.currentThread().getName() + "开始消费");
				try {
					myResourse.MyCosumer();
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			executorService.execute(()->{
				try { TimeUnit.SECONDS.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
				System.out.println(Thread.currentThread().getName() + "收工！");
				try {
					myResourse.stop();
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			}catch (Exception e) {
				e.printStackTrace();
			}finally{

			}
	}
}


