package com.news.app;

public class Application {

	public static void main(String[] args) {
        System.out.println("Welcome to the Neemuch News Portal.....");
       
        int a = 100;
		int b = 20;
		Application cal = new Application();
		System.out.println(" Sum of "+a+" and "+b+" is :"+cal.sum(a,b));
		System.out.println(" Substraction of "+a+" and "+b+" is :"+cal.substract(a,b));
		System.out.println(" Multiplication of "+a+" and "+b+" is :"+cal.multiply(a,b));
		System.out.println(" Division of "+a+" and "+b+" is :"+cal.divide(a,b));
    }
	
	public int sum(int a , int b) {
		return a+b;
	}
	public int substract(int a , int b) {
		return a-b;
	}
	public int multiply(int a , int b) {
		return a*b;
	}
	public int divide(int a , int b) {
		return a/b;
	}
}
