public class Test 
{
    static int x  = 10;
    int y = 20;
    
    
    public static void main(String args[])
    {
        int x = 888;
        
        int y = 999;
        
        Test t1 = new Test();
        
        System.out.println(t1.x);
        
        Test t2 = new Test();
        
        System.out.println(t2.x);
        System.out.println(t2.y);
    }

 

}