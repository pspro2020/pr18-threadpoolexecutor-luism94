package codes;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CachedThreadAdmin {
	private final ThreadPoolExecutor threadAdmin = (ThreadPoolExecutor) Executors.newCachedThreadPool();
	
	public void execute(Pow pow) {
		try {
			threadAdmin.execute(pow);
			System.out.println("Num tareas: " + threadAdmin.getPoolSize());
			System.out.println("Num hilos activos: " + threadAdmin.getActiveCount());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void shutdown() throws InterruptedException { 
		threadAdmin.shutdown();
       
        if (threadAdmin.awaitTermination(500, TimeUnit.SECONDS)) {
    		System.out.println(String.format(Constants.ADMIN_SHUT_DOWN, LocalDateTime.now().format(Constants.TIME_FORMATTER)));

            System.out.println(String.format(Constants.SHOW_MAX_THREAD_NUMBER, threadAdmin.getCompletedTaskCount()));
        } else {
        	System.out.println(String.format(Constants.SHUTDOWN_TIMEOUT, LocalDateTime.now().format(Constants.TIME_FORMATTER)));
        }
    }
	
//	public void shutdownNow() throws InterruptedException {
//		System.out.println(String.format(Constants.ADMIN_SHUT_DOWN, LocalDateTime.now().format(Constants.TIME_FORMATTER)));
//        threadAdmin.shutdownNow();
//        System.out.println(String.format(Constants.SHOW_MAX_THREAD_NUMBER, threadAdmin.getLargestPoolSize()));
//        if (!threadAdmin.awaitTermination(500, TimeUnit.MILLISECONDS)) {
//            System.out.println(String.format(Constants.SHUTDOWN_TIMEOUT, LocalDateTime.now().format(Constants.TIME_FORMATTER)));
//        }
//    }


}
