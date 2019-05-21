package practice;


class Parent {
	
	void show() {
		System.out.println("I am from Parent Method");
	}
}

class Polymorphism extends Parent{
	
	void show() {
		System.out.println("I am from Child Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism c= new Polymorphism();
		c.show();
	}

}
