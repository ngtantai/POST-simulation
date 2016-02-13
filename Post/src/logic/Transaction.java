package logic;

import java.util.ArrayList;
import java.util.Iterator;
import model.Customer;
import model.Payment;

/**
 *
 * @author jenik
 */
public class Transaction {

    private ArrayList<SalesItem> salesItems;

    private Payment payment;

    private Customer customer;

    /**
     * Empty transaction, in case of customer interaction
     */
    public Transaction() {
        this.salesItems = new ArrayList<>();
        this.payment = new Payment();
        this.customer = new Customer();
    }

    /**
     * Complete transaction, in case of automation
     * Sales Items has to be added "one by one" due to security
     * 
     * @param customer
     * @param payment
     */
    public Transaction(Customer customer, Payment payment) {
        this.payment = payment;
        this.customer = customer;
    }
        
    /**
     * Builds the invoice
     * 
     * @return
     */
    public String printInvoice() {
        StringBuilder builder = new StringBuilder();
       
        // TODO build the invoice to print to String
        builder.append(customer.getName());
        
        // ...
        
        Iterator<SalesItem> iterator = salesItems.iterator();
        while (iterator.hasNext()) {
            SalesItem item = iterator.next();
            
            builder.append(item.getProductSpecs().getDescription());
            builder.append(item.getQuantity());
            builder.append(item.getProductSpecs().getPrice() * item.getQuantity());
            
            // TODO and so forth
            
        }
       
        return builder.toString();
    }

    /**
     * Approves the payment
     */
    public void pay() {
        
        // TODO payment verification etc.

        this.payment.setPayed(true);
    }

    /**
     *
     * @param UPC
     * @param quantity
     * @throws java.lang.Exception
     */
    public void addSalesItem(int UPC, int quantity) throws Exception {
        salesItems.add(new SalesItem(UPC, quantity));
    }

    /**
     *
     * @param UPC
     * @return
     */
    public SalesItem removeSalesItem(int UPC) {
        
        // TODO is there any valid UPC salesItem?
        
        // return salesItems.remove(...);
        
        return null;
    }

}
