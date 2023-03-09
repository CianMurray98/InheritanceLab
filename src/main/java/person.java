
public class person {
    private String Name;
    private String Address;
    private double TelephoneNumber;

    public person(){
    }

    public person(String Name, String Address, double TelephoneNumber){
        this.Name = Name;
        this.Address = Address;
        this.TelephoneNumber = TelephoneNumber;
    }
    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }

    public String getAddress() { return Address; }
    public void setAddress(String Address) { this.Address = Address; }

    public double getTelephoneNumber() { return TelephoneNumber; }
    public void setTelephoneNumber(double TelephoneNumber) { this.TelephoneNumber = TelephoneNumber; }
}
