//Đề bài Hãy setup project java sử dụng Apache Log4j và thêm logs phù hợp cho project sau:
//
//Link source: https://github.com/Zoharnguyen/techmaster-java28/tree/main/exceptions-logs
package vn.scrip.buoi36_lab3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Buoi36Lab3Application {

	private static final Logger logger = LogManager.getLogger(Buoi36Lab3Application.class);

	public static void main(String[] args) {
		logger.info("Ứng dụng khởi động...");
		try {
			int result = divide(10, 0);
		} catch (ArithmeticException ex) {
			logger.error("Lỗi chia cho 0", ex);
		}

		SpringApplication.run(Buoi36Lab3Application.class, args);
	}

	public static int divide(int a, int b) {
		logger.debug("Thực hiện phép chia: " + a + " / " + b);
		return a / b;
	}
}

