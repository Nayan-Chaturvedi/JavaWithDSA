import java.util.Scanner;
class caller
{
public static void main(String args[])
{
int a,b,ch;
Scanner sc= new Scanner (System.in);
System.out.println("enter the first digit");
a=sc.nextInt();
System.out.println("enter your second digit");
b=sc.nextInt();j
System.out.println("select the choice \n1-add \n2-sub\n3-mul ");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("addition="+(a+b));
break;
case 2:
System.out.println("subtract="+(a-b));
break;
default:
System.out.println("invalid");
}
}
}