package ie.atu;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel; // 0.05 for 5%, etc.

    public PreferredCustomer(String name, String address, String phoneNumber,int customerNumber, boolean mailingList,  int loyaltyPoints)
    {
        super(name,address,phoneNumber,customerNumber,mailingList);
        this.loyaltyPoints = loyaltyPoints;

    }

    public PreferredCustomer()
    {
        super();
        loyaltyPoints = 0;
        discountLevel = 0;
    }


}

