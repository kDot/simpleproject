package com.example.kdot.simpleproject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Runner {

	static final Logger logger = Logger.getLogger(Runner.class.getName());

	public static void main(String[] args) throws InterruptedException {

		while (true) {
			Thread.sleep(2 * 1000);
			logger.log(Level.INFO, "Hello World!");
		}

	}

}
