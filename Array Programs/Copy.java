//program to 1.)copy elements of one array into another array
//2.)print elements of an array

import java.util.*;
class Copy{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter size of first array");
int n=s.nextInt();
System.out.println("Enter elements");
int arr1[]=new int[n];
for(int i=0;i<n;i++){
arr1[i]=s.nextInt();
}
System.out.println("Elements of first array are:");
for(int i=0;i<n;i++){
System.out.println(arr1[i]);
}
int arr2[]=new int[arr1.length];
for(int i=0;i<arr1.length;i++){
arr2[i]=arr1[i];
}
System.out.println("Elements of Second array are:");
for(int i=0;i<arr2.length;i++){
System.out.println(arr2[i]);
}
System.out.println();
}
}




