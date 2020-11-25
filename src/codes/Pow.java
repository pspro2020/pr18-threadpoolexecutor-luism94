package codes;

import java.time.LocalDateTime;

public class Pow implements Runnable {

	private int baseNumber;

	public Pow(int baseNumber) {
		this.baseNumber = baseNumber;
	}

	@Override
	public void run() {
		//En cada hilo muestro la tabla de potencias del entero que ha inicializado en cada uno de los hilos
		//Potencias del 0 al 10
		for (int exponent = 0; exponent < Constants.LAST_POW_BASE_EXP_NUMBER; exponent++) {
			System.out.println(String.format(Constants.POW_RESULT, LocalDateTime.now().format(Constants.TIME_FORMATTER), Thread.currentThread().getName(), baseNumber, exponent, Math.pow(baseNumber, exponent)));
		}
	}
	
	
	
}
