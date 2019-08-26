package com.yc.Test;

public class Test3 {
	public static void main(String[] args) {
		//求出5的坐标
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 9 } };
		boolean flag=false;
		for(int i =0;i<arr.length&&!flag;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.println("i:"+i+",j:"+j);
				if(arr[i][j]==5){
					flag=true;
					break;
				}
			}
		}
		
	}
}
