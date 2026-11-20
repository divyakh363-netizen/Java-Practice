package collections;

public class MovingLast {
	

//	    static Object arr[] = {10, 20, 30, 40, 50};
//	    static Object arr2[] = {'a', 'b', 'c'};
//
//	    static void add(Object o) {
//	        Object[] newArr = new Object[arr.length + 1];
//	        System.arraycopy(arr, 0, newArr, 0, arr.length);
//	        newArr[arr.length] = o;
//	        arr = newArr;
//	    }
//
//	    static void printing() {
//	        for (int i = 0; i < arr.length; i++) {
//	            if (arr[i] != null)
//	                System.out.println(arr[i]);
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	        printing();
//
//	        for (int i = 0; i < arr2.length; i++) {
//	            add(arr2[i]);
//	        }
//
//	        System.out.println("****after adding****");
//	        printing();
//	    }
//	}
	

	    static Object arr[] = new Object[10];
	    static int index = 0;

	    static void add(Object ob) {
	        arr[index] = ob;
	        index++;
	    }

	    static void printing() {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != null)
	                System.out.println(arr[i]);
	        }
	    }

	    public static void main(String[] args) {
	        add(10);
	        add(20);
	        add(30);
	        add(40);
	        add(50);

	        printing();

	        Object arr2[] = {'a', 'b', 'c'};

	        for (int i = 0; i < arr2.length; i++) {
	            add(arr2[i]);
	        }

	        System.out.println("****at****");
	        printing();
	    }
}
	
