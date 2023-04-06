import java.util.Scanner;
class add
{
int house number;
int name;
static String colony name="y colo";
 add(int x,int y)
{ 


house number=x;
name=y;
}
void display()

{
System.out.println("house number="+x+"name="+y+"colony name="+ycolo);
}
static void chg()
{
colony name="x colo";
}
public static void main(String args[])
{
int=m,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter house number=");
m=sc.nextInt();
System.out.println("enter name");
n=sc.nextInt();
add aa=new add(m,n);

aa.display();

aa.chg();
aa.display();
}
}



