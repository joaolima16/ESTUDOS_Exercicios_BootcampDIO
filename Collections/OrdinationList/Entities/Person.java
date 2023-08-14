package Collections.OrdinationList.Entities;


public class Person implements Comparable<Person> {
    private String name;
    private int year;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Person(String name, int year, double height) {
        this.name = name;
        this.year = year;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", year=" + year + ", height=" + height + "]";
    }

    public int compareTo(Person person) {
        return Integer.compare(year, person.year);
    }
}
