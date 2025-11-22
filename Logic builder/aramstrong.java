public class aramstrong {
public static void main(String arg[])    
{
int strat=100;
int end= 1000;
for(int num=strat; num<=end; num++)
{
    int sum=0, temp=num;
    while(temp>0)
    {
        int digit=temp%10;
        sum=sum+(digit*digit*digit);
        temp=temp/10;
    }
    if(sum==num)
    {
        System.out.println(num);
    }
}
} 
}   
