package thisKeword.and.its.uses;
/*
 * pass an arguement in the method
 */
class ThisDemo_04 {
	void m1(ThisDemo_04 td) { // we create a refernce of class in method i.e ThisDemo_04 class and td4 is
								// reference
		System.out.println("I'm in m1 method");
	}

	void m2() {
		m1(this); // we are pass this as an " arguement in the method "
		//Method k andar main , this keyword ko as an arguement pass krwa skta hoon.
	}
}

public class ThisKeyword_04 {

	public static void main(String[] args) {
		ThisDemo_04 td4 = new ThisDemo_04();
		td4.m2();
	//	td4.m1(null);
	}

}
