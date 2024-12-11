class Sorting{
public static void main(String[] args){
int arr[] =new int[]{30,7,13,3,20,14,5};
int temp;
System.out.println("Sorting in Ascending order");
for(int i=0;i<arr.length-1;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
System.out.print(" "+arr[i]);
}
System.out.println("\nSorting in Descending order");
for(int i=0;i<arr.length-1;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]<arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
System.out.print(" "+arr[i]);
}
}
