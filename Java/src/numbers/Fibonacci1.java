package numbers;

public class Fibonacci1 {
		public static void main(String[] args) {
			int fib1=0,fib2=1,fib3=0;
			int range=10;
			int i=2;
			System.out.print(fib1+" "+fib2+" ");
			while(i<=range) {
				fib3=fib1+fib2;
				System.out.print(fib3+" ");
				fib1=fib2;
				fib2=fib3;
				i++;
			}
		}
	}

