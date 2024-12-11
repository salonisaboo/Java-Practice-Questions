import java.util.*;
class SumArray{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int sum=0;
System.out.println("Enter size of array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<arr.length;i++){
arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++){
sum=sum+arr[i];
}
System.out.println("sum is"+" "+sum);
}
}


