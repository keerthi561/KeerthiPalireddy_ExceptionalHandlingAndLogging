package com.epam.IntrestCalculationUsingLogger;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;



public class SI_CI {
	static Logger log = Logger.getLogger(SI_CI.class.getName());
	public static void si_ci_calculation() {
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		try {
			log.info("Enter Principle amount: ");
			double principalAmount = sc.nextDouble();
			log.info("Enter rate of Interest: ");
			double interestRate = sc.nextDouble();
			log.info("Enter Time period: ");
			double time = sc.nextDouble();
			log.info("Simple Interest : " + ((principalAmount * time * interestRate) / 100));
			log.info("Compound Interest : " + ((principalAmount * Math.pow(1 + (interestRate / 100), time)) - principalAmount));
		} catch (Exception e) {
			log.info("Invalid Input");
		}
		sc.close();
	}

}
