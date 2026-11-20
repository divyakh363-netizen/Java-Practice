package Array_DSA;

public class Arrays_Student1 {

    Arrays_Student[] s;

    Arrays_Student1(int size) {
        s = new Arrays_Student[size];
    }

    // INSERT
    public void insert(int index, Arrays_Student val) {
        try {
            if (s[index] == null) {
                s[index] = val;
                System.out.println("Value inserted");
            }
            else {
                System.out.println("Position already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    // TRAVERSAL
    public void traversal() {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                System.out.println(s[i]);
            }
        }
    }

    // SEARCH BY ID
    public void search(int id) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null && s[i].id == id) {
                System.out.println("Student found at " + i + " position");
                System.out.println(s[i]);
                return;
            }
        }
        System.out.println("Student not found");
    }

    // SEARCH BY INDEX
    public void searchbyindex(int index) {
        try {
            if (s[index] != null) {
                System.out.println(s[index]);
            }
            else {
                System.out.println("Position is empty");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    // DELETE BY INDEX
    public void deletebyindex(int index) {
        try {
            if (s[index] != null) {
                s[index] = null;
                System.out.println("Student deleted");
            }
            else {
                System.out.println("Position is empty");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    // DELETE BY ID
    public void deletebyid(int id) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null && s[i].id == id) {
                s[i] = null;
                System.out.println("Student deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }

    // DELETE ARRAY
    public void delete() {
        s = null;
        System.out.println("Array deleted");
    }

    // SORT BY ID USING BUBBLE SORT
    public void sortbyid() {

        for (int i = 0; i < s.length - 1; i++) {

            for (int j = 0; j < s.length - 1 - i; j++) {

                if (s[j] != null && s[j + 1] != null) {

                    if (s[j].id > s[j + 1].id) {

                        Arrays_Student temp = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Students sorted by ID");
        traversal();
    }

    // SORT BY NAME USING BUBBLE SORT
    public void sortbyname() {

        for (int i = 0; i < s.length - 1; i++) {

            for (int j = 0; j < s.length - 1 - i; j++) {

                if (s[j] != null && s[j + 1] != null) {

                    if (s[j].name.compareTo(s[j + 1].name) > 0) {

                        Arrays_Student temp = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Students sorted by Name");
        traversal();
    }

    public static void main(String[] args) {

        Arrays_Student1 obj = new Arrays_Student1(5);

        obj.insert(0, new Arrays_Student("Shravani", 101, 'a'));
        obj.insert(1, new Arrays_Student("Rakshitha", 102, 'b'));
        obj.insert(2, new Arrays_Student("Radhika", 103, 'c'));
        obj.insert(3, new Arrays_Student("Shrav", 104, 'd'));

        System.out.println("\n--- TRAVERSAL ---");
        obj.traversal();

        System.out.println("\n--- SEARCH ---");
        obj.search(101);

        System.out.println("\n--- SEARCH BY INDEX ---");
        obj.searchbyindex(2);

        System.out.println("\n--- SORT BY ID ---");
        obj.sortbyid();

        System.out.println("\n--- SORT BY NAME ---");
        obj.sortbyname();

        System.out.println("\n--- DELETE BY ID ---");
        obj.deletebyid(102);

        System.out.println("\n--- DELETE BY INDEX ---");
        obj.deletebyindex(2);

        System.out.println("\n--- FINAL TRAVERSAL ---");
        obj.traversal();

        obj.delete();
    }
}