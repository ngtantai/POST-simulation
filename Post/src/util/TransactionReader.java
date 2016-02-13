package util;

import java.util.ArrayList;
import logic.SalesItem;
import logic.Transaction;
import model.Customer;
import model.Payment;

/**
 *
 * @author jenik
 */
public class TransactionReader {

    private String filename;
    
    /**
     * Something that knows last read position in a file
     */
    private int position;

    /**
     *
     * @param filename
     */
    public TransactionReader(String filename) {
        this.filename = filename;
    }

    /**
     * 
     * @return Transaction
     */
    public Transaction nextTransaction() {
        
        // TODO this is a dummy, implement loading from file "filename"
        
        Customer customer = new Customer();
        
        Payment payment = new  Payment();
        
        // TODO 1. open file "filename" for reading and set cursor
        
        // TODO 2. parse ONE transaction
        
        // TODO 3. fill the approptiate objects with values like this
        
        //
        // Example
        // ==========
        
//        Transaction returnTransaction = new Transaction(customer, payment);
//        
//        returnTransaction.addSalesItem(UPC, quantity);
//        returnTransaction.addSalesItem(UPC, quantity);
//        returnTransaction.addSalesItem(UPC, quantity);
//        
//        return returnTransaction;
        //
        
        // If there is no more transactions in a file, return null
        return null;
    }

}
