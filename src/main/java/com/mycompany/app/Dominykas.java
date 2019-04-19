package com.mycompany.app;

public class Dominykas {
	String MyName = "Domas";
	String name = "Robertas";
	public String method(String name, String MyName) {

		this.MyName = MyName;
		name = "Robertas";
		System.out.println("Hello,"+name+", I am"+MyName+",it is nice to meet you");
		return MyName;

	}
}
