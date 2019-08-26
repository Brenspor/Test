package com.yc.Test;

public class Gouzao{
	public static void main(String[] args) {
		int a =1;
		int b =2;
		int c =3;
		System.out.println((a>b)?a:b);
	}
	public Gouzao(){
		System.out.println("hello");
	}
}
class A extends Gouzao{
	Gouzao gz = new Gouzao();
	public static void main(String[] args) {
		System.out.println("hello");
	}
}