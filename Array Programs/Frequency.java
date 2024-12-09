import java.util.*;
class Frequency{
    public static void main(String[] args){
        int arr[]={10,5,10,15,10,5};
        int n=arr.length;
        System.out.println("Frequency\t|\tCount");
        countFreq(arr,n);
    }
    
    public static void countFreq(int arr[],int n){
        boolean visited[]=new boolean[n];
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true)
            continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
           
            System.out.println(arr[i]+"\t\t\t"+"|"+"\t\t"+count);
        }
    }
}