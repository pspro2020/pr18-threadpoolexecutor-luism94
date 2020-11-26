package codes;


public class MainCachedThreadPool {

	public static void main(String[] args) {
		CachedThreadAdmin threadAdmin = new CachedThreadAdmin();
		
		for (int i = 0; i < Constants.LAST_POW_BASE_EXP_NUMBER; i++) {
			threadAdmin.execute(new Pow(i));

		}
		
		
		try {
			threadAdmin.shutdown();
		} catch (InterruptedException e) {
			return;
		}
	}

}
