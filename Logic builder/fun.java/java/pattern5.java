import java.util.*;
class pattern5
{ 
public static void main(String[]arg)
{
    int i;
    int j;
Scanner sc=new Scanner(System.in) ;   
System.out.println("enter a number");
int n=sc.nextInt();
for(i=1; i<=n ;i++)
{
for(j=1; j<=n-i; j++)
{
    System.out.print("");
}
for(int k=1; k<=i; k++){

    System.out.print("*");
}
System.out.println();
}
}

}
    

