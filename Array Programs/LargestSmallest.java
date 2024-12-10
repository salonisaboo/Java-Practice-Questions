import java.util.*;
class LargestSmallest{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<arr.length;i++){
arr[i]=s.nextInt();
}
int Largest=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]>Largest){
Largest=arr[i];
}
}
System.out.println("Largest element is :"+" "+Largest);
int Smallest=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]<Smallest){
Smallest=arr[i];
}
}
System.out.println("Smallest element is:"+" "+Smallest);

}
}



