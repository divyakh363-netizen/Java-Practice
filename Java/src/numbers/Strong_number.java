package numbers;

public class Strong_number {
		static int factorial (int no) {
			int fact=1;
			for (int i =no; i>=1; i--) {
				fact=fact*i;
				
			}
			return fact;
		}
		public static void main(String[] args) {
			int no=145,sum=0,temp=no;
			while(no!=0) {
				int rem=no%10;
				sum=sum+factorial(rem);
				no=no/10;
			}
			if(temp==sum) {
				System.out.println("strong");
			}
			else {
				System.out.println("not strong");
			}
			
		}

	}

