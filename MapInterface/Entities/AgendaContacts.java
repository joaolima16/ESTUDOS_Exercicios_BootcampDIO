package MapInterface.Entities;

import java.util.HashMap;
import java.util.Map;

public class AgendaContacts {
    private Map<String, Integer> agendaContact;
    public AgendaContacts(){
        this.agendaContact = new HashMap<>();
    }
    public void addContact(String name, int telephone){
        this.agendaContact.put(name, telephone);
    }
    public void removeContactByName(String name){
        if(!agendaContact.isEmpty()){
            this.agendaContact.remove(name);
        }
    }
    public void showContacts(){
        System.out.println(agendaContact);
    }
    public Integer searchByName(String name){
        Integer telephone = null;
        if(!this.agendaContact.isEmpty()){
            telephone = this.agendaContact.get(name);
        }
        return telephone;
    }
}
