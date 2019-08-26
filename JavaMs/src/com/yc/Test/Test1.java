package com.yc.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test1{
	
	public static void main(String[] args) throws IOException {
		//Student st =new Student();
		//st.login();
		Add a = new Add();
		//a.add();
		//随机数
		System.out.println("请输入你的名字");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String name = br.readLine();
		//System.out.println("姓名:"+name);
		
		Scanner sc=new Scanner(System.in);
		String b = sc.nextLine();
		System.out.println("这是Scanner方法的输入"+b);
	}

	private static String InputStream(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Student{
	public void login(){
		System.out.println("这是登录");
	}
}

class Add{
	public void add(){
		int i =0;
		System.out.println(++i);
	}
	
}