import java.util.*;
public class Rotate{
public static void Reverse(int arr[],int start,int end){
while(start<=end){
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}
}
public static void rotateLeft(int arr[],int n,int k){
Reverse(arr,0,k-1);
Reverse(arr,k,n-1);
Reverse(arr,0,n-1);
}
public static void rotateRight(int arr[],int n,int k){
Reverse(arr,0,n-k-1);
Reverse(arr,n-k,n-1);
Reverse(arr,0,n-1);
}
public static void main(String[] args){
int arr[]=new int[] {1,2,3,4,5,6,7};
int n=arr.length;
int k=2;
rotateLeft(arr,n,k);
System.out.println("Array after rotating by k towards left");
for(int i=0;i<n;i++){
System.out.println(arr[i]+" ");
}
rotateRight(arr,n,k);
System.out.println("Array after rotating by k towards right");
for(int i=0;i<n;i++){
System.out.println(arr[i]+" ");
}
}
}


