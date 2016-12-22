package ss.week3.hotel;

/**
 * Hotel room with number and possibly a guest.
 * @author Arend Rensink
 * @version $Revision: 1.2 $
 */
public class Room {
    // ------------------ Instance variables ----------------

    private int number;
    private Guest guest;
    protected Safe safe;

    // ------------------ Constructor ------------------------

    /**
     * Creates a <code>Room</code> with the given number, without a guest.
     * @param no number of the new <code>Room</code>
     */
    public Room(int no) {
        this(no,new Safe("123456"));
    }
    
    public Room(int no, Safe safe)
    {
        this.number = no;
        this.safe = safe;
    }

    // ------------------ Queries --------------------------

    public boolean setSafe(java.lang.String safepassword) {
        if (this.safe.getPassword().testWord("123456"))
            {
            this.safe.setPassword("123456", safepassword);
            if (this.safe != null)
            {
                return true;
            }
        }
        return false;
    }
    
    /*@pure */
    public Safe getSafe() {
        return this.safe;
    }
    
    /**
     * Returns the number of this <code>Room</code>.
     */
    /*@pure */
    public int getNumber() {
    	return number;
    }

    /**
     * Returns the current guest living in this <code>Room</code>.
     * @return the guest of this <code>Room</code>;
     *         <code>null</code> if this <code>Room</code> 
     *         is not currently rented
     */
    /*@pure */
    public Guest getGuest() {
    	return guest;
    }

    
    // ------------------ Commands --------------------------

    /**
     * Assigns a <code>Guest</code> to this <code>Room</code>.
     * @param g the next guest renting this <code>Room</code>;
     *        if <code>null</code> is passed, this <code>Room</code>
     *        is empty afterwards
     */
    public void setGuest(Guest g) {
    	guest = g;
    }
    
    public java.lang.String toString() {
    	return "Room " + java.lang.String.valueOf(this.number);
    }
}
