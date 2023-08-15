package MapInterface.Entities;

public class Contact {
    private String name;
    private int telephone;
    
    public Contact(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

}
