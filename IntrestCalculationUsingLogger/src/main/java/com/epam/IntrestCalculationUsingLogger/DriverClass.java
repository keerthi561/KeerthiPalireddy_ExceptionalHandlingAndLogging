package com.epam.IntrestCalculationUsingLogger;

import java.util.logging.Logger;

public class DriverClass {
	static Logger log = Logger.getLogger(DriverClass.class.getName());
    public static void main( String[] args ) {
    	SI_CI.si_ci_calculation();
        Construction.constructionCost();
    }
}
