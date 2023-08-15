package MapInterface.Entities;

public class App {
    public static void main(String[] args) {
        AgendaContacts agendaContacts = new AgendaContacts();

        agendaContacts.addContact("joao", 956593989);
        agendaContacts.addContact("jose", 955289417);
        agendaContacts.addContact("roberto",41841414 );
        agendaContacts.addContact("zézinho", 313132213);
        agendaContacts.addContact("pedrinho", 321313131);
        agendaContacts.showContacts();
        agendaContacts.removeContactByName("joao");
        agendaContacts.showContacts();
        System.out.println(agendaContacts.searchByName("roberto"));
    }
}
