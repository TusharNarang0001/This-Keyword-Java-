package thisKeword.and.its.uses;
/*
 * this keyword can be used to invoke Current class method
 */

class ThisDemo_02 {

	void display() {
		System.out.println("hello , i'm Display method");
	}

	void show() {
		//display(); // if we don't use this keyword , compiler automatically adds this keyword  while invoking the method
		this.display();
		/*
		 * display and this.display , both are same
		 */
		System.out.println("I'm Show method");
	}
}

public class ThisKeyword_02 {
	public static void main(String[] args) {
		ThisDemo_02 td2= new ThisDemo_02();
		td2.show();
	}
}
