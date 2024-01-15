import java.io.*;

class WriteFile
{
    public static void main(String arg[]) //throws Exception
    {
        try
        {
            String Data = "Marvellous Infosystems";
            byte Arr[] = Data.getBytes();

            FileOutputStream fobj = new FileOutputStream("PPA.Txt");
            fobj.write(Arr);
            fobj.close();
        }
        catch(Exception obj)
        {}
    }
}
