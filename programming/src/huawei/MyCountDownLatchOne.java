package huawei;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class OneTask implements Runnable{
	private CountDownLatch countDownLatch;
	public OneTask(CountDownLatch countDownLatch){
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("A休息好了。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			countDownLatch.countDown();
		}
	}
}

class TwoTask implements Runnable{
	private CountDownLatch countDownLatch;
	public TwoTask(CountDownLatch countDownLatch){
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(7000);
			System.out.println("B休息好了。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			countDownLatch.countDown();
		}
	}
}
public class MyCountDownLatchOne {
	public static void main(String[] args) throws InterruptedException {
		long now = System.currentTimeMillis();
		Executor executor = Executors.newFixedThreadPool(2);
		CountDownLatch countDownLatch = new CountDownLatch(2);
		executor.execute(new OneTask(countDownLatch));
		executor.execute(new TwoTask(countDownLatch));
		countDownLatch.await();
		System.out.println("一切OK，总耗时： " + (System.currentTimeMillis() - now));
	}
}
