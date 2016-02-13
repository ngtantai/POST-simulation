package util;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ProductSpecs;

/**
 *
 * TODO This class needs attention !! Implement it in a similar way to TransactionReader
 * 
 */
public class ProductReader {

    // TODO filename should by independent on reader
    private final String filename = "files/products.txt";
    
    private static BufferedReader bufferedReader;

    /**
     *
     * @return
     */
    public ProductSpecs nextProduct() {
        try { 
            bufferedReader = new BufferedReader(new FileReader(filename));
            String line = null;
            
            while ((line = bufferedReader.readLine()) != null) {
                String[] splited = line.split(" ");
                
                for(int i=0;i<3;i++) {

                }
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception);

        }   catch (IOException ex) {
            Logger.getLogger(ProductReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //TODO this statement is dummy
        return null;
    }

}
