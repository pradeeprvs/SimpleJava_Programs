class A
{
  // After compiling the code, Delete A.class file from the bin folder, and try to run the program then you will get NoClassDefinition found Error
	void print() {
	System.out.println("Hello");
	}
}
public class NoClassDefinitionFound_Example
{
    public static void main(String[] args)
    {
        A a = new A();
        a.print();
    }
}