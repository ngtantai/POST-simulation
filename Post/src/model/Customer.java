package model;

/**
 *
 * @author jenik
 */
public class Customer {

    private String name;
    
    private String creditCardNumber;

    /**
     *
     */
    public Customer() {
    }
    
    /**
     *
     * @param name
     * @param creditCardNumber
     */
    public Customer(String name, String creditCardNumber) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     *
     * @param creditCardNumber
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

}
