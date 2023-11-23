package hw1;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		
		
//		Q1
		
		
		
//		Q2
		
		
		
		
//		Q3
		
		
		
//		Q4
		
		
		int borrowmoney;
		int total;
		int twoArray[][] =	 {
								{5,2500},
								{32,800},
								{8,500},
								{19,1000},
								{27,1200}
								
		};
		

		
		System.out.println("請輸入欲借金額");
		Scanner typein = new Scanner(System.in); 
//		if(typein.hasNextInt()) {
			borrowmoney=typein.nextInt();
//		};
		
		for(int i =0;i<twoArray.length;i++) {
			for(int j =0;j<twoArray[i].length;j++) {
				
				if(borrowmoney <= twoArray[i][j]) {
//					紀錄累積不足金額的個數
					int count[] = twoArray[i];
				
					System.out.println("有錢可借的員工編號"+twoArray[i][0]+"共"+(5-count.length)+"人");	
					
				}
				
			}
			
		}
		
		
		
		

		
//		Q5
		
		
		
//		Q6
		
	}

}
