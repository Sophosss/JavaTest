public class SingletonDemo {
	private static volatile SingletonDemo instance = null;
	private SingletonDemo(){
		System.out.println(Thread.currentThread().getName() + "  ok!");
	}
	public static SingletonDemo getInstance(){
		if (instance == null){
			synchronized (SingletonDemo.class){
				if (instance == null)
				{
					instance = new SingletonDemo();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 100 ; i++) {
			new Thread(()->{
				SingletonDemo.getInstance();
			},String.valueOf(i)).start();
		}
	}
}
