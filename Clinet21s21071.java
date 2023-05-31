import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class  Clinet21s21071 implements Runnable
{
 @Override
 public void run()
 {
    try
        {
            Socket MAN=new Socket("localhost",20033);
            Scanner AN=new Scanner(System.in);
            System.out.println("Enter Number of Cup");
            int cupn=AN.nextInt();
            System.out.println("Enter Beverage code");
            int bevc=AN.hashCode();
            
            //send data
            DataOutputStream MAA=new DataOutputStream(MAN.getOutputStream());
            MAA.writeInt(bevc);
            MAA.writeInt(cupn);
            MAA.flush();
            
                       
            //recive  data
            DataInputStream man=new DataInputStream(MAN.getInputStream());
            double Ss=man.readDouble();
            double Pe=man.readDouble();
            String Bn=man.readUTF();
            System.out.println("The Sales="+Ss);
            System.out.println("The Price="+Pe);
            System.out.println("Beverage Name:"+Bn);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
