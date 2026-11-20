package numbers;

public class spy_number {
		public static void main(String[] args) {
			int no=123;int sum=0;int prod=1;
			while(no!=0) {
				int rem=no%10;
				sum=sum+rem;
				prod=prod*rem;
				no=no/10;
			}
			if(sum==prod) {
				System.out.println("spy number");
			}
			else {
				System.out.println("not spy");
			}
		}

	}


