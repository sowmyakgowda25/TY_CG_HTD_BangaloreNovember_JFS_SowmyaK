package com.tyss.typecasting.pack1;

public class Primitive {
	//implicit typecasting
	byte b=4;
	short s=b;
	int i=s;
	float f=i;
	double d=f;
	
	void values() {
		System.out.println("byte value is "+b);
		System.out.println("short value is "+s);
		System.out.println("int value is "+i);
		System.out.println("float value is "+f);
		System.out.println("double value is "+d);
	}
	
	//explicit typecasting
	
	double pi=3.142;
	int a=(int)pi;
	void value() {
		System.out.println("---------------------------------");
		System.out.println("double value is "+pi);
		System.out.println("int value is "+a);
	}
}
