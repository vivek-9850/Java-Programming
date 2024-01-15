class Demo extends Thread
{
    public void run()   //Running state
    {
    }
    synchronized void Display()
    {
        //Logic
    }    
}

class Multi7
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        
        Demo obj1 = new Demo(); //New state
        Demo obj2 = new Demo(); //New state
        

        obj1.setPriority(8);
        obj2.setPriority(10);

        obj1.start();   //Runnable state
        obj2.start();   //Runnable state

        System.out.println("Priority of obj1 is : "+obj1.getPriority());
        System.out.println("Priority of obj2 is : "+obj2.getPriority());
    }    
}

//MIN_PRIORITY
//NORM_PRIORITY
//MAX_PRIORITY
