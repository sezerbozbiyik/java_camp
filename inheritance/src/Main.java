public class Main {
    public static void main(String[] args) throws Exception {

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.customerNumber = "12345";
        individualCustomer.firstName = "sezer";
        individualCustomer.lastName = "bozbıyık";
        individualCustomer.nationalIdentity = "10101010101";

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.customerNumber = "7890";
        corporateCustomer.companyName = "hepsiburada";
        corporateCustomer.taxNumber = "1234512345";

        SendikaCustomer sendikaCustomer=new SendikaCustomer();
        sendikaCustomer.customerNumber="9999999";

        Customer[] customers = { individualCustomer, corporateCustomer,sendikaCustomer };
        CustomerManager customerManager = new CustomerManager();
        customerManager.addMultiple(customers);

    }
}
