import java.util.*;
class OddEvenIndex{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<arr.length;i++){
arr[i]=s.nextInt();
}
System.out.println("\nElements with Even index are:");
for(int i=0;i<arr.length;i++){
if(i%2==0)
System.out.print(" "+arr[i]);
}
System.out.println("\n\nElements with Odd index are:");
for(int i=0;i<arr.length;i++){
if(i%2!=0)
System.out.print(" "+arr[i]);
}
System.out.println();
}
}
