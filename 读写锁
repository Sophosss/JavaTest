import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Resource{
	private volatile Map<String,Object> map = new HashMap<>();
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void put(String key,Object value){
		lock.writeLock().lock();
		try
		{
			System.out.println(Thread.currentThread().getName() + "\t 正在写" + key);
			try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
			map.put(key,value);
			System.out.println(Thread.currentThread().getName() + "\t 写入完成");
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			lock.writeLock().unlock();
		}
	}
	public void get(String key){
		lock.readLock().lock();
		try
		{
			System.out.println(Thread.currentThread().getName() + "\t 正在读取" +key);
			try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
			Object result = map.get(key);
			System.out.println(Thread.currentThread().getName() + "\t 读取" + result);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
		lock.readLock().unlock();
		}
	}
}
public class ReadWriteLockDemo {
	public static void main(String[] args) {
		Resource resource = new Resource();
		for (int i = 0; i <= 5 ; i++) {
			final int temp = i;
			new Thread(()->{
				resource.put(temp+"",temp+"");
			},String.valueOf(i)).start();
		}
		for (int i = 0; i <= 5 ; i++) {
			final int temp = i;
			new Thread(()->{
				resource.get(temp+"");
			},String.valueOf(i)).start();
		}
	}
}
