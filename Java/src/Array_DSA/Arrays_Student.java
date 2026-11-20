package Array_DSA;

public class Arrays_Student {

    String name;
    int id;
    char sec;

    public Arrays_Student(String name, int id, char sec) {
        this.name = name;
        this.id = id;
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Student [name=" + name +
               ", id=" + id +
               ", sec=" + sec + "]";
    }
}