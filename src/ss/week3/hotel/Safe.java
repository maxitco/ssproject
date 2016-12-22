package ss.week3.hotel;

public class Safe {
	private Password code;
	private boolean active = false;
	private boolean open = false;
	
	public Safe(java.lang.String password) {
		this.code = new Password();
		this.code.setWord(this.code.INITIAL, password);
	}
	
	public Safe() {
	    this.code = new Password();
	}
	
	public static void main(String[] args) {
        Safe roomsafe = new Safe("jomama");
        roomsafe.setPassword("jomama", "test");
        
    }
	
	/*@pure;*/
	public boolean isActive() {
		return this.active;
	}
	
	/*@pure;*/
	public boolean isOpen() {
		return this.open;
	}
	/*@pure;*/
	public Password getPassword() {
		return this.code;
	}
	//@requires getPassword().acceptable(next) == true;
	public boolean setPassword(java.lang.String old,java.lang.String next) {
	    assert code.acceptable(next);
	    boolean result = code.setWord(old, next);
	    if (result) {
	        return true;
	    }
	    else return false;
	}
	
	/*@ ensures \old(isActive())==false && getPassword().testWord(input) ? isActive() == true : isActive() == false;*/
	public void activate(java.lang.String input) {

		if(!isActive() && code.testWord(input)) {
			this.active = true;
		}
	}
	
	/*@ ensures !isActive() && !isOpen(); */
	public void deactivate() {
		this.active = false;
		this.open = false;
	}
	
	/*@ ensures (getPassword().testWord(password) && \old(isActive())) ? isOpen() : !isOpen(); */
	public void open(java.lang.String password) {
		if (isActive() && this.code.testWord(password)) {
			this.open = true;
		}
	}
	/*@ ensures !isOpen(); */
	public void close() {
		this.open = false;
	}
	
}
