package com.raj.casestudy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab8Ex2 {

	public static void main(String[] args) {
		
		Runnable r = () -> {

			while(true) {
				LocalDateTime ldt = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				String formatDateTime = ldt.format(formatter);
				System.out.println(formatDateTime);
					try {
							Thread.sleep(1000);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		};
		
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(r);
		ex.shutdown();
	}

}
