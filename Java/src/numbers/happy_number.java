package numbers;

public class happy_number {
		public static int sumint(int no) {
			int sum=0;
			while(no!=0) {
				int rem=no%10;
				rem=rem*rem;
				sum=sum+rem;
				no=no/10;	
			}
			return(sum);
		}
		public static void main(String[] args) {
			int no=1234;
			while(no>9) {
				no=sumint(no);
			}
			System.out.println(no);
			
		}



	}


