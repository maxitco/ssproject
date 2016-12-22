package ss.week1.student;

public class student {
	private int grade;

	public boolean passed() {
    if (this.grade >= 70) {
			return true;
		}
		else {
			return false;
		}
	}
}
