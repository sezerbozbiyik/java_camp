public class Main{
    public static void main(String[] args) throws Exception {
        
        IndividualCustomer sezer = new IndividualCustomer();
        sezer.customerNumber="12345";

        CorporateCustomer hepsiBurada=new CorporateCustomer();
        hepsiBurada.customerNumber="7890";

        Customer[] customers= {sezer,hepsiBurada};
        CustomerManager customerManager=new CustomerManager();
        customerManager.addMultiple(customers);
        
    }
}
