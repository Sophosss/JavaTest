import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

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
		Long start = System.currentTimeMillis();
		final ArrayList<Integer> list = new ArrayList<>();
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		final Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			executorService.execute(() -> list.add(random.nextInt()));
		}
		executorService.shutdown();
		executorService.awaitTermination(1,TimeUnit.DAYS);
		System.out.println(System.currentTimeMillis() - start);
	}
}
