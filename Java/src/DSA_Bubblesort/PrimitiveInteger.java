package DSA_Bubblesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimitiveInteger {
	public static void main(String[] args) {
	List<Integer> l1=new ArrayList<Integer>(Arrays.asList(5,2,6,2,7,1,8,4,3));
	for(int i=0;i<l1.size()-1;i++) {
	 for(int j=0;j<l1.size()-1-i;j++) {
		 if(l1.get(j) > (l1.get(j+1))) {
		 Integer temp=l1.get(j);
		 l1.set(j,l1.get(j+1));
		 l1.set(j+1,temp);	 
	 }
	 }	
	}
	System.out.println(l1);
	
}
}