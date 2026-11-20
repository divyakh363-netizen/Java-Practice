package DSA;


public class SDAString {
String[] a;                     
SDAString(int size){
	a=new String[size];
	System.out.println("array is created");
	}

public void insert(int index,String val) {
	try {
		if(a[index]==null) {
			a[index]=val;
			System.out.println("the value is inserted");
		}
		else {
			System.out.println("the value is already exists");
		}
	}
    catch(ArrayIndexOutOfBoundsException e ) {
    	System.out.println("invalid index");
    }
}
public void traversal() {
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}

public void SearchByval(String val) {          
	for(int i=0;i<a.length;i++) {
		if(a[i].equals(val)) {
			System.out.println("value found at "+i+" index");
			return;
		}
	}
	System.out.println("the value not found");
}


public void SearchByIndex(int index) {             
	try {
		if(a[index]!=null) {
			System.out.println(a[index]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}


public void DeleteByVal(String val) {                     
	for(int i=0;i<a.length;i++) {
		if(a[i]!=null && a[i].equals(val)) {                  
			System.out.println("value deleted");
			return;
		}
	}
	System.out.println("value not found");
}


public void DeleteByIndex(int index) {                   
	try {
		if(a[index]!=null) {
			a[index]=null;                  
			System.out.println("value deleted");
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}


public void delete() {                                   
	a=null;
	System.out.println("Array is deleted");
}
public static void main(String[] args) {
	SDAString s=new SDAString(5);
	s.insert(0,"xyz");
	s.insert(1,"abc");
	s.insert(2,"tyu");
	s.insert(3, "pqr");
	s.insert(4,"nmo");
	s.insert(5, "vvv");
	s.traversal();
	s.SearchByIndex(3);
	s.SearchByval("abc");
	s.DeleteByIndex(2);
	s.DeleteByVal("vvv");
	s.traversal();
	s.delete();
}
}