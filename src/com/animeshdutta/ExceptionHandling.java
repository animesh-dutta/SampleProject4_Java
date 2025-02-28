//Author:Animesh Dutta (Ananya Birla)
package com.animeshdutta;
public class ExceptionHandling {
	public static void main(String[] args) {
	
		try {
			int x=30/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Finally block Text");
		}
	}
}
