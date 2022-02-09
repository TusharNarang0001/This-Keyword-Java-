package thisKeword.and.its.uses;
/*
 * this keyword can be used to invoke Current class Constructor
 */

class ThisDemo_03 {

	public ThisDemo_03() {
		//Step-4 , we will call parameterized constructpr by Default constructor
		this(20);
		System.out.println("Default Constructor");
	}

	public ThisDemo_03(int x) {
		//Step-3 we will call default constructor by Paramaterized Constructor, so we'll use 'this()'
		//this();
		System.out.println("parameterized constructor : " + x );
	}

}

public class ThisKeyword_03 {
	public static void main(String[] args) {
	//	ThisDemo_03 td3= new ThisDemo_03(); // This line will call Default Constructor ,	Step-1
		//ThisDemo_03 td3_1= new ThisDemo_03(10); // This line will call Parameterixed Constructor, Step-2
		ThisDemo_03 td3= new ThisDemo_03(); //Step-5
	}
}
