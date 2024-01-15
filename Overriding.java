
class Base
{
    public void fun()   //1000
    {
        System.out.println("Inside base fun");
    }
    public void gun()   //2000
    {
        System.out.println("Inside base gun");
    }
    public void sun()   //3000
    {
        System.out.println("Inside base sun");
    }
    public void run()   //4000
    {
        System.out.println("Inside base run");
    }
}

class Derived extends Base
{
    public void fun()   //5000
    {
        System.out.println("Inside derived fun");
    }
    public void sun()   //6000
    {
        System.out.println("Inside derived sun");
    }
    public void run(int A)  //7000
    {
        System.out.println("Inside derived run");
    }
    public void mun()   //8000
    {
        System.out.println("Inside derived mun");
    }
}

class Overriding 
{
    public static void main(String arg[])
    {
        Base bobj = new Derived();  //Up casting
        //Base bobj = new Base();   //No casting
        // Derived bobj = new Derived();    //No casting    
        // Derived bobj = new Base();   //Down casting 
        bobj.fun();
        bobj.gun();
        bobj.sun();
        bobj.run();
        // bobj.run(11);
        // bobj.mun();
    }
}
