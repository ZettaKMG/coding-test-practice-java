package codingBat.Warmup.Lv1;

public class posNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		
		if (!negative && (a * b < 0)) {
			return true;
		} else if (negative && (a < 0 && b < 0)) {
			return true;
		} else {
			return false;
		}
		
	}
}