
class Arithematic
{
    public int Addition(int A, int B)
    {
        return A+B;
    }
    public int Addition(int A, int B, int C)
    {
        return A+B+C;
    }
    public double Addition(double A, double B)
    {
        return A+B;
    }
    public void Addition(int A, double B)
    {
        System.out.println("inside first");
    }
    public void Addition(double A, int B)
    {
        System.out.println("inside second");
    }
}

class OverloadingX
{
    public static void main(String arg[])
    {
        Arithematic aobj = new Arithematic();

        int iret = 0;
        double dret = 0.0;

        iret = aobj.Addition(10,11);
        System.out.println("Addition is : "+iret);
        iret = aobj.Addition(10,11,21);
        System.out.println("Addition is : "+iret);
        dret = aobj.Addition(10.8,11.7);
        System.out.println("Addition is : "+dret);
        aobj.Addition(11,10.8);
        aobj.Addition(10.8,11);
    }
}
