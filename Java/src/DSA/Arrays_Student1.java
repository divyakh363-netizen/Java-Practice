package DSA;



public class Arrays_Student1 {
	Arrays_Student[]s;
	Arrays_Student1(int size){
		s=new Arrays_Student[size];
	}
	public void insert(int index,Arrays_Student val) {
		try {
			if(s[index]==null) {
				s[index]=val;
				System.out.println("value inserted");
			}
			else {
				System.out.println("position already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}
public void traversal() {
	for(int i=0;i<s.length;i++) {
		if(s[i]!=null) {
			System.out.println(s[i]);
		}
	}
}

public void search(int id) {
	for(int i=0;i<s.length;i++) {
		if(s[i] != null && s[i].id==id) {
			System.out.println("student found at "+ i+"position");
			System.out.println(s[i]);
			return;
			
		}
	}
	System.out.println("student not found");
}

public void  serachbyindex(int index) {
	try {
		if(s[index]!= null) {
			s[index]=null;
			System.out.println("student deleted");
		}else {
			System.out.println("position is empty");
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}

public void deletebyindex(int index) {
	try {
		if(s[index]!=null) {
			s[index]=null;
			System.out.println("student deleted");
		}else {
			System.out.println("position is empty");
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}

public void deletebyI(int id) {
	for(int i=0;i<s.length;i++) {
		if(s[i]!=null && s[i].id==id) {
			s[i]=null;
			System.out.println("student deleted");
		}
	}
	System.out.println("student not found");
}
public void delete() {
	s=null;
	System.out.println("Array deleted");
}
public static void main(String[] args) {
	Arrays_Student1 obj=new Arrays_Student1(5);
	obj.insert(0, new Arrays_Student("Shravani",101,'a'));
	obj.insert(0, new Arrays_Student("Rakshitha",102,'b'));
	obj.insert(0, new Arrays_Student("Radhika",103,'c'));
	obj.insert(0, new Arrays_Student("Shrav",104,'d'));
	obj.traversal();
	obj.search(101);
	obj.serachbyindex(2);
	obj.deletebyI(102);
	obj.deletebyindex(2);
	obj.traversal();

	obj.delete();
}

}