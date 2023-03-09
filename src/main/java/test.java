import java.util.Scanner;

public class test extends person {
    public static void main( String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = in.nextLine();
        System.out.println("Enter Address: ");
        String address = in.nextLine();
        System.out.println("Enter Telephone: ");
        String telephone = in.nextLine();
        System.out.println("Would you like to be on our mailing list? y/n ");
        Boolean mail;

        if(in.nextLine() == "y") {
            mail = true;
        } else {
            mail = false;
        }

        Customer customer = new Customer("1", mail);
        customer.setName(name);
        customer.setAddress(address);
        customer.setTelephone(telephone);
        customer.setMailingList(mail);

        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Telephone Number: " + customer.getTelephone());
        System.out.println("Wants to receive mail: " + String.valueOf(customer.getMailingList()));

    }

}
