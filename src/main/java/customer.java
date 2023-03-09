
public class customer extends person{
    private String CustomerNumber;
    Boolean MailingList;

    public customer(){
    }

    public customer(String CustomerNumber, Boolean MailingList, String Name, String Address, double TelephoneNumber){
        super(Name, Address, TelephoneNumber);
        this.CustomerNumber = CustomerNumber;
        this.MailingList = MailingList;
    }

    public String getCustomerNumber() { return CustomerNumber; }
    public void setCustomerNumber(String CustomerNumber) { this.CustomerNumber = CustomerNumber; }

    public Boolean getMailingList() { return MailingList; }
    public void setMailingList(Boolean MailingList) { this.MailingList = MailingList; }


}
