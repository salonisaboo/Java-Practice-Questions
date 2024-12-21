import java.util.*;
class Palindrome{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter a String");
String str=s.nextLine();
String rev="";
for(int i=str.length()-1;i>=0;i--)
rev=rev+str.charAt(i);

if(str.equals(rev))
System.out.println("String is palindrome");

else
System.out.println("String is not palindrome");

}
}




