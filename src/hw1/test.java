package hw1;

public class test {
public static void main(String[] args) {
	int total  = 200;
	int assign = 12;
	
	
		for(int i = total, j=0; i>=0; i -= assign, j++ ) {
			if (i < assign) {
			
			System.out.println("有"+j+"打"+i+"顆");
		}
		
	}
}
}
