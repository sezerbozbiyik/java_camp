package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisReferences.NQVKPSPublicSoap;

import java.sql.Date;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        NQVKPSPublicSoap client = new NQVKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getDateOfBirth());
    }
}
