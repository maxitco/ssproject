package ss.week1;

public class DollarsAndCentsCounter {
	private int dollar = 0;
	private int cent = 0;
	
	public void reset() {
		this.dollar = 0;
		this.cent = 0;
	}
	public int dollars() {
		return this.dollar;
	}
	public int cents() {
		return this.cent;
	}
	public void add (int dollars, int cents){
		if (dollars >= 0 && cents >= 0) {
			this.dollar = this.dollar + dollars;
			this.cent = this.cent + cents;
			while (this.cent > 99) {
				this.dollar+=1;
				this.cent-=100;
			}
		}
	}
	
}
