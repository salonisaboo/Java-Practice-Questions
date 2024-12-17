import java.util.*;
class Anagram{
public static void areAnagram(String str1, String str2){
int n1=str1.length();
int n2=str2.length();
if(n1!=n2){
System.out.println("Both String are not Anagram");}
else{
char[] string1=str1.toCharArray();
char[] string2=str2.toCharArray();
Arrays.sort(string1);
Arrays.sort(string2);
if(Arrays.equals(string1, string2) == true) {  
System.out.println("Both the strings are anagram");  
}  
else {  
System.out.println("Both the strings are not anagram");  
}  
}
}

public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter first string");
String str1=s.nextLine();
System.out.println("Enter second string");
String str2=s.nextLine();
areAnagram(str1,str2);
}

}