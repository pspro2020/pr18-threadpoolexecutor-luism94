package codes;

import java.time.format.DateTimeFormatter;

public class Constants {

	static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("mm:ss.SSS");
	static final String POW_RESULT = "Time %s: %s --- %d ^ %d  = %.0f";
	static final int LAST_POW_BASE_EXP_NUMBER = 10;
	static final String SHUTDOWN_TIMEOUT = "Time %s: Time out exceeded --- Thread Administrator could not finish in time";
	static final String ADMIN_SHUT_DOWN = "Time %s: Thread Administrator started terminating process";
	static final String SHOW_MAX_THREAD_NUMBER = "%d max thread running at the same time";
}
