import java.util.*;
public class myinput
{
    int x;
    Scanner sc=new Scanner(System.in);
    void in()
    {
        System.out.println("enter a number");
        x=sc.nextInt();

    }
        // display method
    void dis()
    {
        System.out.println("number is:"+x);
    }

    public static void main(String arg[])
    {
        myinput obj[]=new myinput[5];
        for(int i=0; i<5; i++)
        {
            obj[i]=new myinput();
            obj[i].in();
            obj[i].dis();
        }
    }
    
}

    

