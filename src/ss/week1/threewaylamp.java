package ss.week1;

public class threewaylamp {
	private int setting;
/**	private enum setting {
		ON, OFF, LOW, MEDIUM, HIGH
	}
*/
	
	public threewaylamp() {
		this.setting = 0;	
		}
	
	public int getSetting() {
		return this.setting;
	}
	public void switchSetting() {
			this.setting = (this.setting + 1) % 4;
	}

}
