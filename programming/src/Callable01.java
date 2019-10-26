import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable01 implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println("你是个好人。");
		return "true";
	}

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		FutureTask<String> future = new FutureTask<String>(new Callable01());
		new Thread(future).start();
		System.out.println(future.get());
	}
}
