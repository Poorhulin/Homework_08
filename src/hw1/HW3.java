package hw1;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		
//		Q1
//	
//		int t1;
//		int t2;
//		int t3;
//		Scanner typein = new Scanner(System.in);
//		
//		
//		for(int y=0; y<=3; y++) {
//		System.out.println("請輸入三個整數");
//		if(typein.hasNextInt()) {
//			t1=typein.nextInt();
//		}
//		if(typein.hasNextInt()) {
//			t2=typein.nextInt();
//		}
//		if(typein.hasNextInt()) {
//			t3=typein.nextInt();
//		}
//		break;
//		}
//		
//		if(t1>0 && t2>0 && t3>0 && t1==t2 && t2==t3 && t1==t3) {
//		System.out.println("正三角形");
////		
//		}
//		
//		else if(t1==t2||t1==t3||t2==t3) {
//		System.out.println("等腰三角形");
//		}
//		
//		else if(t1-t2 < t3 && t1+t2> t3) {
//		System.out.println("其他三角形");
//		}
//		else {
//		System.out.println("不是三角形");
//			}
			
		
		
//		Q2
		
//		int i=0;
//		
//		System.out.println("開始猜數字吧");
//		
//		Scanner sc = new Scanner(System.in);
//		if(sc.hasNextInt()) {
//			i=sc.nextInt();
//		}
//		
//		int bingo = (int)(Math.random()*10);
//		
//	
//
//		
//		BACK:
//		while (bingo != i) {
//			
//			System.out.println("答錯囉");
//			continue BACK;
//			if(bingo == i) {
//
//			System.out.println("答對了! 答案就是"+i);
//			
//			}
//			break;
////			
//		} 
		
			
////		
//		
		
//		Q3
		int lottery[][] = new[6][9]; 
		System.out.println("請輸入不想要的數字");
		Scanner typein3 = new Scanner(System.in);
		int t4 =typein3.nextInt();
		
		for(int i = 0; i<lottery.length; i++) {
			for(int j = 0; j < lottery[i].length; j++)
			if(lottery[i]!=t4 && lottery[j] !=t4) {
				
				System.out.println(lottery[i][j]);
			};
			
			
		};
		
//		int desirenumber= (int)(Math.random()*10)+19;
//		
	
		
//		Q4
		
//		Q5
		
		
	}

}
