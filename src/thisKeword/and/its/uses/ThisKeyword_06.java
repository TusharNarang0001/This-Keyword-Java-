package thisKeword.and.its.uses;
/*
 * 'this' keyword can be used to return current class INSTANCE
 * this keyword hum as a return type bh use kr sktey hain
 */

class CurrentClassInstance {
	CurrentClassInstance m1() {
		
		return this;
	}
}

public class ThisKeyword_06 {
	public static void main(String[] args) {
		CurrentClassInstance td6= new CurrentClassInstance();
		td6.m1();
	}
}
