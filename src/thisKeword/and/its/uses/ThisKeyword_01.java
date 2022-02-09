package thisKeword.and.its.uses;

/**
 * 
 * Invoke Current class Instance variable
 *
 */
class ThisDemo {
	int i; // i is Instance variable

	void setValue(int i) {
		this.i = i;
	}

	void showValue() {
		System.out.println("Value of i : " + i);
	}
}

public class ThisKeyword_01 {
	public static void main(String[] args) {
		ThisDemo t= new ThisDemo();
		t.setValue(100);
		t.showValue();
	}
}
