package DSA;

public class Two_Dimentional_Array {
	int[][]a;
	public Two_Dimentional_Array(int row,int col) {
		a=new int[row][col];
		for(int r=0;r<a.length;r++) {
		   for(int c=0; c<a.length;c++) {
			   a[r][c]=Integer.MIN_VALUE;
		   }
		}
	
		System.out.println("arrays created");
		
		
				
	}



	public void insert(int r,int c,int val) {           //insert
		try{
			if(a[r][c]==Integer.MIN_VALUE) {         
				a[r][c]=val;
				System.out.println("the value is inserted");
			}
			else {
				System.out.println("element already exists");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}


	public void traversal() {                //traversal
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
			if(a[r][c]!=Integer.MIN_VALUE)
			System.out.println(a[r][c]);
		}
	}
	}


	public void SearchByval(int val) {          //SearchBVal
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
			if(a[r][c]==val) {
				System.out.println("value found at "+r+","+c);
				return;
			}
		}
		}
		System.out.println("the value not found");
	}


	public void SearchByIndex(int r,int c) {             //SearchByIndex
		try {
			if(a[r][c]!=Integer.MIN_VALUE) {
				System.out.println(a[r][c]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}


	public void DeleteByVal(int val) {                     //DeleteBVal
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
		
			if(a[r][c]==val) {
				a[r][c]=Integer.MIN_VALUE;                  
				System.out.println("value deleted");
				return;
			}
		}
		}
		System.out.println("value not found");
	}


	public void DeleteByIndex(int r,int c) {                   //DeleteByIndex
		try {
			if(a[r][c]!=Integer.MIN_VALUE) {
				a[r][c]=Integer.MIN_VALUE;                   
				System.out.println("value deleted");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}


	public void delete() {                                   //Delete
		a=null;
		System.out.println("Array is deleted");
	}
	public static void main(String[] args) {
		Two_Dimentional_Array t=new Two_Dimentional_Array(3,3);
		t.insert(0,0,10);t.insert(0,1,20);t.insert(0,2,30);
		t.insert(1,0,40);t.insert(1,1,50);t.insert(1,2,60);
		t.insert(2,0,70);t.insert(2,1,80);t.insert(2,2,90);
		t.traversal();
		t.SearchByval(30);
		t.SearchByIndex(1,2);
		t.DeleteByIndex(0,1);
		t.DeleteByVal(20);
		t.traversal();
		t.delete();
	}
	}
