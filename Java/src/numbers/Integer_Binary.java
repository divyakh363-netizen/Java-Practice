package numbers;

public class Integer_Binary {
	public static void main(String[] args) {
		int no=9;
		String res="";
		while(no!=0) {
			int rem=no%2;
			res=rem+res;
			no=no/2;
			
		}
		System.out.println(res);
	}
	

}
