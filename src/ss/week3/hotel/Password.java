package ss.week3.hotel;

public class Password {
	public static java.lang.String INITIAL = "initialpassword";
	private java.lang.String password;
	
	public Password(){
		this.password = this.INITIAL;
		
	}
	/*@pure;*/
	public boolean acceptable(java.lang.String password1){
		if(password1.length() < 6 || password1.contains(" ")){
			return false;
		}
		else{
		return true;
		}
	}
	
	/*@pure;*/
	public boolean testWord(java.lang.String test){
		if(this.password.equals(test)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean setWord(java.lang.String oldpass, java.lang.String newpass){
		if(this.password.equals(oldpass) && this.acceptable(newpass)){
			this.password = newpass;
			return true;			
		}
		else{
			return false;
		}
		
	}
}