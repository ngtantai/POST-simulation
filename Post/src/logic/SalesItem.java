package logic;

import model.ProductCatalog;
import model.ProductSpecs;

/**
 *
 * @author jenik
 */
public class SalesItem {

    private int quantity;

    private ProductSpecs productSpecs;

    /**
     *
     * @param UTC
     * @param quantity
     * @throws Exception
     */
    public SalesItem(int UTC, int quantity) throws Exception {
        this.quantity = quantity;
     
        ProductCatalog catalog = ProductCatalog.getInstance();
        
        this.productSpecs = catalog.getProduct(UTC);
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public ProductSpecs getProductSpecs() {
        return productSpecs;
    }

    /**
     *
     * @param productSpecs
     */
    public void setProductSpecs(ProductSpecs productSpecs) {
        this.productSpecs = productSpecs;
    }
}
