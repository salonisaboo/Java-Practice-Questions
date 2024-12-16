import java.util.*;
class Reverse{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String str=s.nextLine();
System.out.println("Reversed string is:"+reverse(str));
}
public static String reverse(String str){
String rev="";
for(int i=str.length();i>0;--i){
rev=rev+(str.charAt(i-1));
}
return rev;
}
}