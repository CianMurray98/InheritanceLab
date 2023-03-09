
class Customer extends person {
    String customerNumber;
    Boolean mailingList;

    public Customer(String customerNumber, Boolean mailingList) {
        super();
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public Boolean getMailingList() {
        return mailingList;
    }
    public void setMailingList(Boolean mailingList) {
        this.mailingList = mailingList;
    }

}

