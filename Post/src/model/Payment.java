package model;

/**
 *
 * @author jenik
 */
public class Payment {

	private Enum type;

	private int total;

	private boolean payed;

    /**
     *
     * @return
     */
    public Enum getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(Enum type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public int getTotal() {
        return total;
    }

    /**
     *
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     *
     * @return
     */
    public boolean isPayed() {
        return payed;
    }

    /**
     *
     * @param payed
     */
    public void setPayed(boolean payed) {
        this.payed = payed;
    }

}
