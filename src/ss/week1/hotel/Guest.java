package ss.week1.hotel;

/**
 * 
 * @author maximilian
 *
 */
public class Guest {
	private ss.week1.hotel.Room Room = null;
	private java.lang.String Name;
	
	
	/**Initialize with the name
	 * 
	 * @param n
	 */
	public Guest(java.lang.String n) {
		this.Name = n;
	}
	
	/**Give guest a key to the room and let him enter the room
	 * 
	 * @param newRoom
	 * @return
	 */
	public boolean checkin(ss.week1.hotel.Room newRoom) {
		if (this.Room == null && newRoom.getGuest() == null) {
			this.Room = newRoom;
			this.Room.setGuest(this);
			return true;
		}
		else {
			return false;
		}
	}
	
	/**Let guest leave room and hand in the key
	 * 
	 * @return
	 */
	public boolean checkout() {
		if (this.Room != null) {
			this.Room.setGuest(null);
			this.Room = null;
			return true;
		}
		else {
			return false;
		}
	}
	/**Return the name of the guest
	 * 
	 * @return
	 */
	public java.lang.String getName() {
		return this.Name;
	}
	/**Return the current room of the guest
	 * 
	 * @return
	 */
	public ss.week1.hotel.Room getRoom() {
		return this.Room;
	}
	
	public java.lang.String toString() {
		return "Guest " + this.Name;
	}
	
}
