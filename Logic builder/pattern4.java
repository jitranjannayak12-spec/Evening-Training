public class pattern4 
{
    public static void main(String[]arg)
{
int i;
int j;

for(i=1; i<=5; i++)
{
for(j=1; j<i; j++)
{
    System.out.print("");
} 
for(int k=5; k>=i; k-- )
{
    System.out.print("*");
} 
System.out.println();  
}
}
}

    

