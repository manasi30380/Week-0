import java.util.Scanner;
class PalindromeDemo
{
public static void main(String[] args){
int x, rev=0, rem, x1 ;
Scanner sc = new Scanner(System.in);
x= sc.nextInt();
x1=x;
while(x!=0)
{
 rem=x%10;
 rev=rev*10+rem;
 x=x/10;
}
if (x1==rev)
System.out.println("It is a palindrome ");
else 
System.out.println("It is not a palindrome ");
}
}






























































