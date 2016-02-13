import CLI.CLI;

/**
 *
 * @author jenik
 */
public abstract class Start {

    /**
     * Private constructor makes this class uninstantiable
     */
    private Start() {
    }
    
    /**
     * Initiates whole project
     *
     * @param args
     */
    public static void main (String [] args) {
        CLI cli = new CLI();
        cli.runStore();
    }

}
