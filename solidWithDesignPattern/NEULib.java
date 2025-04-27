package solidWithDesignPattern;

public class NEULib {
    public static void main(String[] args) {
        Student tyke = new Student("Tyke", 1);
        Student meowth = new Student("Meowth", 2);
        Student tom = new Student("Tom", 3);

        ResourceType book1 = new Book("This is a Book", "Yuro");
        ResourceType book2 = new Book("Is this a Book?", "Yuri");
        ResourceType journal1 = new Journal("Journal is Journal?", "Mika");
        ResourceType journal2 = new Journal("Life in a Journal", "Caged");

        Borrow borrowing = new ResourceToBorrow();

        borrowing.borrowedBy(tyke, book1);
        borrowing.borrowedBy(meowth, book2);
        borrowing.borrowedBy(tom, journal1);
        borrowing.borrowedBy(tom, journal2);
    }
}
