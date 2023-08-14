package Collections.OrdinationList;

import Collections.OrdinationList.Entities.OrdinationPerson;
public class App {
    public static void main(String[] args) {
        OrdinationPerson lsPersons = new OrdinationPerson();
        lsPersons.addPerson("teste", 25, 1.90);
        lsPersons.addPerson("test223", 320, 2.40);
        lsPersons.addPerson("joao", 35, 1.56);
        lsPersons.addPerson("roberto", 40, 1.35);
        System.out.println(lsPersons.sortByAge());
        System.out.println(lsPersons.sortByHeight());
    }
}
