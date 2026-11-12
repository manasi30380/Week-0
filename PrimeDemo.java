//To check the given no. is prime or not 

import java.util.Scanner;
class PrimeDemo
{
public static void main(String[] args){
int n,ctr=0;
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
for(int i=1; i<=n; i++)
{ 
  if (n%i==0)
  ctr=ctr+1;
}
if (ctr==2)
System.out.println("True");
else
System.out.println("False");
}
}