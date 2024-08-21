package com.revature;

public class MainClass {
public static void main(String[] args) {
	SayName name = new SayName();
	System.out.print(name.sayHello());
	
	Lambda say=()->{return "Hello Lambdas";};
	
	System.out.println(Lambda.sayHello());
}
}
