import practice.FirstAbstract;


public class ConcreteClass extends FirstAbstract {
public void test() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass c= new ConcreteClass();
		c.develop();
		c.maintain();
		
		FirstAbstract ab=new ConcreteClass();
		ab.print();
	}


	@Override
	public void develop() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void maintain() {
		// TODO Auto-generated method stub
		
	}

}
