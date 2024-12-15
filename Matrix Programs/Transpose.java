import java.util.*;
class Transpose{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows");
int rows=s.nextInt();
System.out.println("Enter number of cols");
int cols=s.nextInt();
int Mat[][]=new int[rows][cols];
System.out.println("Enter elements of the matrix");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
Mat[i][j]=s.nextInt();
}
}
transpose(Mat,rows,cols);
}
public static void transpose(int Mat[][],int rows,int cols){
int t[][]=new int[cols][rows];
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
t[i][j]=Mat[j][i];
}
}

System.out.println("Transpose of a matrix");
for(int i=0;i<cols;i++){
for(int j=0;j<rows;j++){
System.out.print(t[i][j]+" ");
}
System.out.println();
}
}
}


