package ProcessingManagers;

/**
 * Time object
 */
public class TimeManager {
	private int h, m, s;

	// TODO => implement the body of the class (set class fields, make ways
	// for other classes to work with a TimeManager object)

	public TimeManager(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

}