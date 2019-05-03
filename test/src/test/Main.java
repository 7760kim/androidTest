package test;

import java.util.List;

public class Main{

	class Sd{
		String asd = "1";
	}

	public static void main(String[] args) throws Exception {

		String a = "1";
		String b = a;
		String c= new String("1");


		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}