package model;

/**
 *
 * @author jenik
 */
public class ProductSpecs {

    private String description;

    private int price;

    private int UPC;
    
    /**
     *
     * @param UPC
     * @param desc
     * @param price
     */
    public ProductSpecs(String UPC, String desc, String price){
        this.UPC = Integer.parseInt(UPC);
        this.description = desc;
        this.price = Integer.parseInt(price);
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public int getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getUPC() {
        return UPC;
    }

    /**
     *
     * @param UPC
     */
    public void setUPC(int UPC) {
        this.UPC = UPC;
    }

}
