import java.util.HashMap;

public class ContactManagementSystem {

    private HashMap<String, String[]> contacts = new HashMap<>();

    public void addContact(String name, String email, String phoneNumber, String address){

        String[] details = {email,phoneNumber,address};
        contacts.put(name, details);

        System.out.println("Contact added sucessfully");

    }

    public void removeContact(String name){
        if(contacts.containsKey(name)){
            contacts.remove(name);
            System.out.println("Contact removed sucessfully");
        }else{
            System.out.println("Contact does not exist");
        }
    }

    public void modifyContact(String name, String email, String phoneNumber, String address){
        if(contacts.containsKey(name)){

            String[] details = {email,phoneNumber,address};
            contacts.put(name, details);
            System.out.println("Contact modified sucessfully");
        }else{
            System.out.println("Contact does not exist");
        }

    }

    public void searchContact(String name){
        if(contacts.containsKey(name)){

            String details[] = contacts.get(name);
            System.out.println("email of a contact searched is : " + details[0]);
            System.out.println("phoneNumber of a contact serached is: " +details[1]);
            System.out.println("address of a contact searched is: "+details[2]);

        }
        else{
            System.out.println("Contact does not exist");
        }

    }
    
}
