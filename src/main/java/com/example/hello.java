package com.example;
import java.util.*;

class hello {
	public static void main(String[]  arg) {
		//System.out.print("Hello World");
		Scanner ln = new Scanner(System.in);
		System.out.println("Введите число " );
		String a, b, znak;
		int a1, b1, znak1;
		a = ln.next();
		znak = ln.next();
		b = ln.next();
		a1 = Integer.valueOf(a);
		b1 = Integer.valueOf(b);
		switch(znak){
			case "+":
				System.out.println(a1 + b1);
				break;
			case "-":
				System.out.println(a1 - b1);
				break;
			case "*":
				System.out.println(a1 * b1);
				break;
			case "/":
				System.out.println(a1 / b1);
				break;
			default:
				System.out.println("ERROR!");
		}
	}
}