package logic;

import java.util.ArrayList;
import util.TransactionReader;

/**
 *
 * @author jenik
 */
public class POST {

    private String id;

    private String transactionsFilename;

    private ArrayList<Transaction> transactions;

    /**
     * 
     * @param id
     * @param transactionsFilename 
     */
    public POST(String id, String transactionsFilename) {
        this.id = id;
        this.transactionsFilename = transactionsFilename;
        
        transactions = new ArrayList<>();
        
        loadTransactions();
        
        // TODO Here is possible to print all the invoices,
        // I dunno where this should be done, but it doesn't realy matter
    }

    /**
     * Loads all transations from file "transactionsFilename" to POST
     */
    private void loadTransactions() {
        
        TransactionReader transactionReader = new TransactionReader(this.transactionsFilename);
        
        Transaction transaction;
        
        while ((transaction = transactionReader.nextTransaction()) != null) {
            
            // Here might be some additional transaction processing
            
            // Set auto-load transaction payed
            transaction.pay();
            
            addTransaction(transaction);
        }
    }

    /**
     * In case of human interaction
     * 
     * @param transaction
     * @return 
     */
    public Transaction addTransaction(Transaction transaction) {
        transactions.add(transaction);
        
        return transaction;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }    

}
