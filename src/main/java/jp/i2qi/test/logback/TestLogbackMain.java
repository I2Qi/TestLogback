package jp.i2qi.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogbackMain {

	static final Logger logger = LoggerFactory.getLogger(TestLogbackMain.class);

	public static void main(String[] args) {

		logger.trace("hogehoge");
		logger.debug("fufgafadfs");
		logger.info("gerogero");
		logger.warn("ccccccc");
		logger.error("ddddddd");
	}

}
