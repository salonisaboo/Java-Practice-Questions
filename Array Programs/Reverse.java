import java.util.*;
class Reverse{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<arr.length;i++){
arr[i]=s.nextInt();
}
System.out.println("Original array");
for(int i=0;i<arr.length;i++){
System.out.print(" "+arr[i]+" ");
}
System.out.println("\n\nReversed array");
for(int i=arr.length-1;i>=0;i--){
System.out.print(" "+arr[i]+" ");
}
}
}


