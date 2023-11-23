package hw1;
public class HW1 {
	public static void main(String[] args) {
//		Q1
		int a = 12;
		int b =  6;
		int c = a+b;
		int d = a*b;
		System.out.println("兩數和為" + c);
		System.out.println("兩數積為" + d);
		
		
//		Q2
		
		int egg = 200;

		System.out.println("雞蛋為" +(egg/12)+"打"+(egg%12)+"顆");

		

		
//		Q3 

		int total  = 256559;
		int second = total %60;
		int minute = total /60%60;
		int hour   = total /(60*60)%24;
		int day    = total /(60*60*24);
		
		System.out.println(day +"天" +hour+"小時"+minute+"分"+
		second+"秒");
	
//		Q4
		Double pi = 3.1415;
		Double  r = 5d;
		Double area = Math.pow(r, 2)*pi;
		Double circumference = 2*r*pi;
		System.out.printf("面積為 %.4f" , area);
		System.out.println();
		System.out.printf("周長為 %.3f" , circumference);
		System.out.println();
		
//		Q5
		
		Double principal = 1500000d;
		
		Double rate = 0.02;
		
		Double compound = 1 + rate; 
		
		Double sum = Math.pow(compound,10)*principal;
		
		System.out.println("本利和為"+sum);
		
//		Q6
		
		
		System.out.println(5+5);
//		單純5+5數字相加 5+5=10

		System.out.println(5+'5');
//		因Unicode為53 ，因此5+53=58

		System.out.println(5+"5"); 
//		字元加數字的特例
	}
	
	


	

}


