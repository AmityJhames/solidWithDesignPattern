package solidWithDesignPattern;

public class Student {

    private String name;
    private int studID;

    public Student(String name, int studID) {
        this.name = name;
        this.studID = studID;
    }

    public int getStudID() {
        return studID;
    }

    public String getName() {
        return name;
    }
}