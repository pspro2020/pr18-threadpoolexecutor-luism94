package codes;

public class Main {

	public static void main(String[] args) {
		//Creo 10 hilos secundarios en la clase Pow que se inicializa con un entero distinto cada uno 
//		for (int i = 1; i < 11; i++) {
//			new Pow(i).start();
//		}
		
		CachedThreadAdmin threadAdmin = new CachedThreadAdmin();
		Pow pow;
		
		for (int i = 0; i < Constants.LAST_POW_BASE_EXP_NUMBER; i++) {
			pow = new Pow(i);
			threadAdmin.execute(pow);
		}
	}

}
