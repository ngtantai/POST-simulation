package logic;

import java.util.ArrayList;
import model.ProductCatalog;

/**
 *
 * @author jenik
 */
public class Store {

    private ArrayList<POST> posts;

    /**
     *
     */
    public Store() {
        posts = new ArrayList<>();
      
        this.loadProductCatalog();
    }

    /**
     *
     */
    public void initPOSTs() {
        // In our case, there will be only one POST
        // in the store, may be changed
        
        POST post1 = new POST("Post 1", "change.txt");
        
        posts.add(post1);
    }
    
    /**
     * 
     */
    private void loadProductCatalog() {
        ProductCatalog.getInstance().loadProducts();
    }

    /**
     * 
     * @return 
     */
    public ArrayList<POST> getPosts() {
        return posts;
    }
}
