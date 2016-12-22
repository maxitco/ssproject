package ss.week3.hotel;

/**
 * 
 * @author maximilian
 *
 */
public class Guest {
	private Room Room = null;
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
	public boolean checkin(Room newRoom) {
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
			System.out.println("yolo");
			return true;
		}
		else {
		    System.out.println("NoYolo");
			return false;
			
		}
	}
	/**Return the name of the guest
	 * 
	 * @return
	 */
	//@pure;
	public java.lang.String getName() {
		return this.Name;
	}
	/**Return the current room of the guest
	 * 
	 * @return
	 */
	public Room getRoom() {
		return this.Room;
	}
	
	public java.lang.String toString() {
		return "Guest " + this.Name;
	}
	
}
