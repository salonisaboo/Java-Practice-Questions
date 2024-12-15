import java.util.*;
class RowColSum{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows in Matrix");
int rows=s.nextInt();
System.out.println("Enter number of columns in Matrix");
int cols=s.nextInt();
int Mat[][]=new int[rows][cols];
System.out.println("Enter elements of the matrix");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
Mat[i][j]=s.nextInt();
}
}
rowSum(Mat,rows,cols);
colSum(Mat,rows,cols);

}
public static void rowSum(int Mat[][],int rows,int cols){
for(int i=0;i<rows;i++){
    int RowSum=0;
for(int j=0;j<cols;j++){
RowSum=RowSum+Mat[i][j];
}
System.out.println("Sum of the "+(i+1)+"Row is:"+" "+RowSum);
}
}
public static void colSum(int Mat[][],int rows,int cols){
for(int i=0;i<cols;i++){
int ColSum=0;
for(int j=0;j<rows;j++){
ColSum=ColSum+Mat[j][i];
}
System.out.println("Sum of the "+(i+1)+"Column is:"+" "+ColSum);
}
}
}