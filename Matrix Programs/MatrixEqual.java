import java.util.*;
class MatrixEqual{
public static void main(String[] args){
int flag=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows in Matrix A");
int rowsA=s.nextInt();
System.out.println("Enter number of columns in Matrix A");
int colsA=s.nextInt();
System.out.println("Enter number of rows in Matrix B");
int rowsB=s.nextInt();
System.out.println("Enter number of columns in Matrix B");
int colsB=s.nextInt();
if(rowsA!=rowsB||colsA!=colsB){
System.out.println("Matrices are not equal");
}
int MatA[][]=new int[rowsA][colsA];
System.out.println("Enter elements in matrix A");
for(int i=0;i<rowsA;i++){
for(int j=0;j<colsA;j++){
MatA[i][j]=s.nextInt();
}
}

int MatB[][]=new int[rowsB][colsB];
System.out.println("Enter elements in matrix B");
for(int i=0;i<rowsB;i++){
for(int j=0;j<colsB;j++){
MatB[i][j]=s.nextInt();
}
}
if(rowsA!=rowsB||colsA!=colsB){
for(int i=0;i<rowsA;i++){
for(int j=0;j<colsA;j++){
if(MatA[i][j]!=MatB[i][j]){
flag=0;
break;
}
}
}
if(flag==1){
System.out.println("Matrices are equal");
}
else{
System.out.println("Matrices are not equal");
}
}
}
}







