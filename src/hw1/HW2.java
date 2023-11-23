package hw1;

public class HW2 {
public static void main(String[] args) {
//	Q1
	int sum = 0;

    for (int i = 2; i <= 1000; i += 2) {
        sum += i;
    }

    System.out.println("1~1000的偶數和為：" + sum);
	
	
//	Q2
    
    int multiple = 1;

    for (int i = 2; i <= 10; i ++) {
    	multiple *= i;
    }

    System.out.println("1~10的連乘積為：" + multiple);
    
//    Q3
    
    int w = 1;
    int i = 1;
    while (i <= 10) {
    	w *= i;
    	i++;
    }

    System.out.println("1~10的連乘積為(用while)：" + w);
    
    
//    Q4
    
    int square = 1;
 
    for (int j = 1; j <= 10; j ++) {
    	square = j*j;
    	System.out.print(" "+ square);
    }
    System.out.println();
//Q5
    
    int count = 0;

    for (int m = 1; m <= 49; m++) {
        if (m % 10 != 4 && m / 10 != 4) {
            System.out.print(m + " ");
            count++;
        }
    }

    System.out.println("\n總共有 " + count + " 個不含4的數字。");
//Q6

    
    for (int k = 10; k >= 1; k--) {
        for (int l = 1; l <= k; l++) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
    
//    Q7
    
    char currentChar = 'A';

    for (int u = 1; u <= 6; u++) {
        for (int v = 1; v <= u; v++) {
            System.out.print(currentChar);
        }
        System.out.println();
        currentChar++;
    }
}
}
