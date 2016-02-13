package CLI;

//import java.util.Scanner;
import logic.Store;

/**
 *
 * @author jenik
 */
public class CLI {

    private Store store;

    /**
     *
     */
    public CLI() {
        store = new Store();
    }

    /**
     *
     */
    public void runStore() {
        // May be ommited
        System.out.println("Initializing store");
        
        store.initPOSTs();
        
        //
        // In case of need of customer interaction
        // code like this should be placed here
        //
        
//        while (!store.quitApp()) {
//            String line = readString();
//            try {
//            	System.out.println(store.processCommand(line));
//            }
//            catch (IllegalArgumentException e) {
//            	System.out.println("Error in command: "+e.getMessage()+"\n");
//            }
//            catch (Exception e) {
//            	System.out.println("Unknown error: "+e.getMessage()+"\n");
//            }
//        }
    }
        
//    /**
//     * Reads command from console
//     * 
//     * This method is there in case of interacting with customer
//     *
//     * @return command as String
//     */
//    private String readString() {
//        @SuppressWarnings("resource")
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("> ");
//        return scanner.nextLine();
//    }

}
