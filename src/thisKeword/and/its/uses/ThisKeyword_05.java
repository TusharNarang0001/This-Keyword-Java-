package thisKeword.and.its.uses;
/*
 *  To pass an arguement in the Constrctor call
 */

class ThisDemo_05 {

	public ThisDemo_05(ThisKeyword_05 td) {
		System.out.println("ThisDemo_05 class Constructor");
	}

}

public class ThisKeyword_05 {
	void m1() {
		ThisDemo_05 tdM1 = new ThisDemo_05(this); //this keywprd can be used to pass as an arguement in the Constructor call 
	}

	public static void main(String[] args) {
		ThisKeyword_05 td5 = new ThisKeyword_05();
		td5.m1();
	}
}
