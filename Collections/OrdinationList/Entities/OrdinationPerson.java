package Collections.OrdinationList.Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdinationPerson {
    private List<Person> lsPersons;
    public OrdinationPerson(){
        this.lsPersons = new ArrayList<>();
    }   
    public void addPerson(String name, int year, double height){
        this.lsPersons.add(new Person(name, year, height));
    }
    public List<Person> sortByAge(){
        List<Person> listByAge = new ArrayList<>(lsPersons);
        Collections.sort(listByAge);
        return listByAge;
    }
    public List<Person> sortByHeight(){
        List<Person> listByHeight = new ArrayList<>(lsPersons);
        Collections.sort(listByHeight, new ComparatorByAge());
        return listByHeight;
    }
}
