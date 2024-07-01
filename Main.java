import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        ContactManagementSystem system = new ContactManagementSystem();

        while (true) {

            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Modify Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    system.addContact(name, email, phone, address);
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    system.removeContact(name);
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    email = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    phone = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    address = scanner.nextLine();
                    system.modifyContact(name, email, phone, address);
                    break;
                case 4:
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    system.searchContact(name);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }


            
        }

    }
    
}
