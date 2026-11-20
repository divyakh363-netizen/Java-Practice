package numbers;

public class Numbersummation1 {
		static void number(int no) {
	    int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}	
			System.out.println(sum);
	}
		public static void main(String[] args) {
			number(1234);
	}
	}

