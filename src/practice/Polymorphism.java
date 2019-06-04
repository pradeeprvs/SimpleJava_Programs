package practice;


class Parent {
	
	void show() {
		System.out.println("I am from Parent Method");
	}
}

class Polymorphism extends Parent{
	
	void show() {
		//System.out.println("I am from Child Method");
	}
	
	void type() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c= new Polymorphism();
		Polymorphism p=new Polymorphism();
		for(int i=0;i<20;i++)
		c.show();
		
	}

}
