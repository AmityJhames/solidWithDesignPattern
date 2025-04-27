package solidWithDesignPattern;

public class ResourceToBorrow implements Borrow {

    @Override
    public void borrowedBy(Student student, ResourceType resource) {
        System.out.println("This " + resource.getResourceType() +
                " titled '" + resource.getTitle() +
                "' is being borrowed by Student Number " +
                student.getStudID() + " named " + student.getName());
    }
}
