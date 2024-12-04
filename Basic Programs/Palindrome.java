import java.util.Scanner;
class Palindrome{
public static void main(String[] args){
int rev=0,temp,rem;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
temp=num;
while(num>0){
rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
System.out.println(rev);
if(temp==rev)
System.out.println("number is a palindrome number");
else
System.out.println("number is not a palindrome number");
}
}


