package ss.week2;



public class threewaylamp {
	public enum Tsetting {
		OFF, LOW, MEDIUM, HIGH
	}
	
	public Tsetting setting;
	
	public threewaylamp() {
		this.setting = setting.OFF;	
		}
	/*@pure */
	public Tsetting getSetting() {
		return this.setting;
	}
	/*@ ensures \old(getSetting()) == Tsetting.OFF ==> getSetting() == Tsetting.LOW; */
	/*@ ensures \old(getSetting()) == Tsetting.LOW ==> getSetting() == Tsetting.MEDIUM; */
	/*@ ensures \old(getSetting()) == Tsetting.MEDIUM ==> getSetting() == Tsetting.HIGH; */
	/*@ ensures \old(getSetting()) == Tsetting.HIGH ==> getSetting() == Tsetting.OFF; */
	public void switchSetting() {
		switch(this.setting) {
		case OFF: this.setting = setting.LOW; break;
		case LOW: this.setting = setting.MEDIUM; break;
		case MEDIUM: this.setting = setting.HIGH; break;
		case HIGH: this.setting = setting.OFF; break;
		}
	}

}
