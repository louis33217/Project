
package assignment3sample.Business;

import java.util.ArrayList;

public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }
    public void setCustomerDirectory(ArrayList<Customer>  customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addCustomer(){
        Customer newCustomer = new Customer();
        customerDirectory.add(newCustomer);
        return newCustomer;
    }
    
    public void deleteCustomer(Customer customer){
        customerDirectory.remove(customer);
    }
    
}
