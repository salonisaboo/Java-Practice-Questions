import java.util.*;
class LowerUpperTriangularMatrix{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows in Matrix");
int rows=s.nextInt();
System.out.println("Enter number of columns in Matrix");
int cols=s.nextInt();
checkSquareMatrix(rows,cols);
int Mat[][]=new int[rows][cols];
int flag=1;
int size=rows*cols;
int count=0;
System.out.println("Enter elements of the matrix");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
Mat[i][j]=s.nextInt();
}
}
System.out.println("Case 1: Print lower triangular Matrix");
System.out.println("Case 2: Print upper triangular Matrix");
System.out.println("Case 3: Check if the given Matrix is Identity Matrix or Not");
System.out.println("Case 4: Print Identity Matrix");
System.out.println("Case 5: Check if the given Matrix is Sparse Matrix or Not");
System.out.println("Enter a choice");
int choice=s.nextInt();
switch(choice){
case 1:
lowerTriangular(Mat,rows,cols);
break;
case 2:
upperTriangular(Mat,rows,cols);
break;
case 3:
identityMatrix(Mat,rows,cols,flag);
break;
case 4:
printIdentityMatrix(Mat,rows,cols);
break;
case 5:
sparseMatrix(Mat,rows,cols,size,count);
break;
default:
System.out.println("Invalid choice");
break;
}
}
public static void checkSquareMatrix(int rows, int cols){
if(rows!=cols){
System.out.println("It should be a square Matrix");
System.exit(0);
}
}
public static void lowerTriangular(int Mat[][],int rows,int cols){
if(rows==cols){
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
if(j>i)
System.out.print("0"+" ");
else
System.out.print(Mat[i][j]+" ");
}
System.out.println();
}
}
}
public static void upperTriangular(int Mat[][],int rows,int cols){
if(rows==cols){
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
if(j<i)
System.out.print("0"+" ");
else
System.out.print(Mat[i][j]+" ");
}
System.out.println();
}
}
}
public static void identityMatrix(int Mat[][],int rows,int cols,int flag){

for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
if(i == j && Mat[i][j] != 1){    
flag = 0;    
break;    
}
if(i != j && Mat[i][j] != 0){    
flag = 0;    
break;    
}
}
}
if(flag==1){
System.out.println("It is a Identity Matrix");
}
else{
System.out.println("Not a Identity Matrix");
}
}
public static void printIdentityMatrix(int Mat[][],int rows,int cols){
if(rows==cols){
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
if(j==i)
System.out.print("1"+" ");
else 
System.out.print("0"+ " ");
}
System.out.println();
}
}
}

public static void sparseMatrix(int Mat[][],int rows,int cols,int size,int count){
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
if(Mat[i][j]==0){
count++;
}
}
}
if(count>(size/2)){
System.out.println("It is a Sparse Matrix");
}
else{
System.out.println("It is not a Sparse Matrix");
}
}
}



