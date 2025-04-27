package solidWithDesignPattern;

public class Book implements ResourceType {

    private String title;
    private String author;
    private final String resourceType = "Book";

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceType() {
        return resourceType;
    }

    public String getAuthor() {
        return author;
    }
}