import java.util.*;
public class positive
{
public static void main(String[]arg)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextInt();
if(num>0){
System.out.println("positive number");
}else if(num<0) {
System.out.println("negative number");
}else {
System.out.println("zero");
}
}
}

