import java.util.*;
class DivisionOfStrings{
static void divideString(String str, int n){
int str_len=str.length();
int Nparts;
if(str_len%n!=0){
System.out.println("String is not divisible");
return;
}

Nparts=str_len/n;
for(int i=0;i<str_len;i++){
if(i%Nparts==0)
System.out.println();
System.out.print(str.charAt(i));
}
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter first String");
String str=s.nextLine();
System.out.println("Enter number in which string needs to be divided");
int n=s.nextInt();
divideString(str,n);
}
}
