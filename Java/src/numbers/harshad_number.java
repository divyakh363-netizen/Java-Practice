package numbers;

public class harshad_number {
		public static void main(String[] args) {
			int no=89,sum=0,n=no;
			while(no!=0) {
				int rem=no%10;
				sum=sum+rem;
				no=no/10;
			}
			if(n%sum==0) {
				System.out.println("harshad number");
			}
			else {
				System.out.println("not harshad");
			}

		}

	}


