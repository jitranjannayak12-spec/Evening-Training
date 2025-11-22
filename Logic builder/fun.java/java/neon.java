public class neon 
{
    public static void main(String arg[])
    {
        int n=9;
        int sum=0;
        int square=n*n;
        int temp=square;
        while(temp!=0)
        {
            int r=temp%10;
            sum=sum+r;
            temp=temp/10;

        }
        if(sum==n)
        {
            System.out.println("neon");
        }
    }
}
    

