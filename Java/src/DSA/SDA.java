package DSA;


public class SDA {
int[] a;                                          //creation
SDA(int size){              //constructor
	a=new int [size];
	for(int i=0;i<a.length;i++) {
		a[i]=Integer.MIN_VALUE;
	}
}
public void insert(int index,int val) {           //insert
	try{
		if(a[index]==Integer.MIN_VALUE) {         
			a[index]=val;
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
	for(int i=0;i<a.length;i++) {
		if(a[i]!=Integer.MIN_VALUE)
		System.out.println(a[i]);
	}
}


public void SearchByval(int val) {          //SearchBVal
	for(int i=0;i<a.length;i++) {
		if(a[i]==val) {
			System.out.println("value found at "+i+" index");
			return;
		}
	}
	System.out.println("the value not found");
}


public void SearchByIndex(int index) {             //SearchByIndex
	try {
		if(a[index]!=Integer.MIN_VALUE) {
			System.out.println(a[index]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}


public void DeleteByVal(int val) {                     //DeleteBVal
	for(int i=0;i<a.length;i++) {
		if(a[i]==val) {
			a[i]=Integer.MIN_VALUE;                  
			System.out.println("value deleted");
			return;
		}
	}
	System.out.println("value not found");
}


public void DeleteByIndex(int index) {                   //DeleteByIndex
	try {
		if(a[index]!=Integer.MIN_VALUE) {
			a[index]=Integer.MIN_VALUE;                   
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
	SDA s=new SDA(5);
	s.insert(0,10);
	s.insert(1,20);
	s.insert(2,30);
	s.insert(3,40);
	s.insert(4,50);
	s.insert(5,60);
	s.traversal();
	s.SearchByval(30);
	s.SearchByIndex(1);
	s.DeleteByIndex(0);
	s.DeleteByVal(20);
	s.traversal();
	s.delete();
}
}
