package com.app;

public class SingleToneTest {
	public static void main(String[] args) {
		Printer p = Printer.getPrinterObject();
		System.out.println(p);
		Printer p1 = Printer.getPrinterObject();
		System.out.println(p1);
		Printer p2 = Printer.getPrinterObject();
		System.out.println(p2);
		System.out.println("This is working");
	}
}
