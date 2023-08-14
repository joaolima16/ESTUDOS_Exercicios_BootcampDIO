package Collections.OrdinationList;

public class Person {
    private String name;
    private int year;
    private int height;
    @Override
    public String toString() {
        return "Person [name=" + name + ", year=" + year + ", height=" + height + "]";
    }
    public Person(String name, int year, int height) {
        this.name = name;
        this.year = year;
        this.height = height;
    }

}
