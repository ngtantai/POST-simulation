package model;

import java.util.ArrayList;
import java.util.Iterator;
import util.ProductReader;

/**
 * ProductCatalog singleton (there id only one product catalog in store)
 *
 * @author jenik
 */
public class ProductCatalog {
    
    private static ProductCatalog productCatalog = new ProductCatalog();

    private ArrayList<ProductSpecs> productSpecses;

    
    private ProductCatalog() {
    }

    /**
     *
     * @return
     */
    public static ProductCatalog getInstance(){
        return productCatalog;
    }
        
    /**
     *
     * @param UPC
     * @return
     */
    public boolean validateUPC(int UPC) {
        Iterator<ProductSpecs> iterator = productSpecses.iterator();
        while (iterator.hasNext()) {
            
            ProductSpecs ps = iterator.next();
            if (ps.getUPC() == UPC)
            {
                return true;
            }
        }
        
        // There is no product with UPC in the catalog
        return false;
    }

    /**
     *
     * @param product
     */
    public void addProduct(ProductSpecs product) {
        // TODO
    }

    /**
     *
     * @param UPC
     * @return
     */
    public ProductSpecs removeProduct(int UPC) {
        
        // TODO
        
        return null;
    }

    /**
     *
     */
    public void loadProducts() {
        
        // Product reader should expect filename with file of products
        ProductReader productReader = new ProductReader();
        
        ProductSpecs productSpecs;
        
        while ((productSpecs = productReader.nextProduct()) != null) {
            
            // Here might be some additional product processing
           
            productSpecses.add(productSpecs);
        }
    }

    /**
     *
     * @param UPC
     * @return
     * @throws java.lang.Exception
     */
    public ProductSpecs getProduct(int UPC) throws Exception {
        
        Iterator<ProductSpecs> iterator = productSpecses.iterator();
        while (iterator.hasNext()) {
            
            ProductSpecs ps = iterator.next();
            if (ps.getUPC() == UPC)
            {
                return ps;
            }
        }
        
        // There is no product with UPC in the catalog
        throw new Exception("There is no product with UPC in the catalog");
    }

}
