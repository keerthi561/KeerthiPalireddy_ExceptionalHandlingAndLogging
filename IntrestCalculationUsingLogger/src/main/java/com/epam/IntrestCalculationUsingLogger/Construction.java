package com.epam.IntrestCalculationUsingLogger;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

public class Construction {
	static Logger log = Logger.getLogger(SI_CI.class.getName());
	public static void constructionCost() {
		Scanner sc = new Scanner(System.in);
		log.info("Select the material type");
		log.info("1.Standard Material");
		log.info("2.Above Standard Material");
		log.info("3.High Standard Material");
		log.info("4.High Standard Material and Fully Automated home");
		try {
			int type = sc.nextInt();
			double houseArea, totalCost = -1;
			log.info("Enter area of the house..");
			houseArea = sc.nextDouble();
			sc.close();
			switch (type) {
			case 1:
				totalCost = 1200 * houseArea;
				break;
			case 2:
				totalCost = 1500 * houseArea;
				break;				
			case 3:
				totalCost = 1800 * houseArea;
				break;
			case 4:
				totalCost = 2500 * houseArea;
				break;
			default:
				log.info("Select type from 1-4");
			}
			if (totalCost != -1)
				log.info("Cost for costruction of the house in rupees is : " + totalCost);
				
		} catch (Exception e) {
			log.info("Invalid Input");
		}
	}
}
