import java.util.Scanner;

public class test {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String name = in.nextLine();
        System.out.println("Enter Customer Address: ");
        String address = in.nextLine();
        System.out.println("Enter Customer Telephone: ");
        String telephone = in.nextLine();
        System.out.println("Would you like to receive mail? y/n ");
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

        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Telephone: " + customer.getTelephone());
        System.out.println("Wants to receive mail: " + String.valueOf(customer.getMailingList()));

    }

}
