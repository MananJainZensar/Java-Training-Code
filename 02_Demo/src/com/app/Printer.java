package com.app;

public class Printer {
	private static Printer printer = null;
	private Printer() {
		
	}
	public static Printer getPrinterObject() {
		if(printer == null) {
			printer = new Printer();
			return printer;
		}
		else {
			return printer;
		}
	}
}
