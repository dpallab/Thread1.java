import java.util.Scanner;
public class Thread1 extends Thread
{
    int a,b;
    Thread1(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    public void run()
    {
        while (true)
        {
            System.out.println("multiply value is:- "+(a*b));
            System.out.println("Thread name: "+Thread.currentThread().getName());

        try
            {
                Thread.sleep(3000);
            }
        catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
class Th
{
    public static void main(String[] args)throws InterruptedException
    {
        Scanner sc= new Scanner(System.in);
        Thread1 subOb= new Thread1(6, 7);
        subOb.setDaemon(true);
        subOb.setName("Pallab");
        subOb.start();
        System.out.println("Enter your name:- ");
        sc.nextLine();
        System.out.println("Input request satisfied in main thread");
    }
}
