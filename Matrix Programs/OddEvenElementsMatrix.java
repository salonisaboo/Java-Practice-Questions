import java.util.*;
class OddEvenElementsMatrix{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows");
int rows=s.nextInt();
System.out.println("Enter number of columns");
int cols=s.nextInt();

int Mat[][]=new int[rows][cols];
System.out.println("Enter elements in the Matrix");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
Mat[i][j]=s.nextInt();
}
}
int countEven=0;
int countOdd=0;
System.out.println("\n\nEven elements are:");
countEvenElements(Mat,rows,cols,countEven);
System.out.println("\n\nOdd elements are:");
countOddElements(Mat,rows,cols,countOdd);
}

public static void countEvenElements(int Mat[][],int rows,int cols,int countEven){
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
if(Mat[i][j]%2==0){
System.out.print(Mat[i][j]+" ");
countEven++;
}
}
}
System.out.print("\nEven elements count:");
System.out.println("\n"+countEven +" ");
}

public static void countOddElements(int Mat[][],int rows,int cols,int countOdd){
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
if(Mat[i][j]%2!=0){
System.out.print(Mat[i][j]+" ");
countOdd++;
}
}
}
System.out.print("\nOdd elements count:");
System.out.println("\n"+countOdd +" ");
}
}





