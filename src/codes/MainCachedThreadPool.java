package codes;

import java.util.concurrent.TimeUnit;

public class MainCachedThreadPool {

	public static void main(String[] args) {
		CachedThreadAdmin threadAdmin = new CachedThreadAdmin();
		
		for (int i = 0; i < Constants.LAST_POW_BASE_EXP_NUMBER; i++) {
			try {
				threadAdmin.execute(new Pow(i));
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				return;
			}
		}
		
		
		try {
			threadAdmin.shutdown();
		} catch (InterruptedException e) {
			return;
		}
	}

}
