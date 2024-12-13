import java.util.*;
class Matrix{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows in matrix A");
int rowA=s.nextInt();
System.out.println("Enter number of columns in matrix A");
int colA=s.nextInt();
System.out.println("Enter number of rows in matrix B");
int rowB=s.nextInt();
System.out.println("Enter number of columns in matrix B");
int colB=s.nextInt();

int MatA[][]=new int[rowA][colA];
System.out.println("Enter elements of the matrix A");
for(int i=0;i<rowA;i++){
for(int j=0;j<colA;j++){
MatA[i][j]=s.nextInt();
}
}
int MatB[][]=new int[rowB][colB];
System.out.println("Enter elements of the matrix B");
for(int i=0;i<rowB;i++){
for(int j=0;j<colB;j++){
MatB[i][j]=s.nextInt();
}
}
int MatC[][]=new int[rowA][colB];
System.out.println("Case 1: Add two matrices");
System.out.println("Case 2: Subtract two matrices");
System.out.println("Case 3: Multiply two matrices");
System.out.println("Enter a choice");
int choice=s.nextInt();
int i=0,j=0;
switch(choice){
case 1:
for(i=0;i<rowA;i++){
for(j=0;j<colB;j++){
MatC[i][j]=MatA[i][j] + MatB[i][j];
System.out.print(MatC[i][j] +" ");

}
System.out.println();
}
break;
case 2:
for(i=0;i<rowA;i++){
for(j=0;j<colB;j++){
MatC[i][j]=MatA[i][j] - MatB[i][j];
System.out.print(MatC[i][j] +" ");
}
System.out.println();
}
break;
case 3:
for(i=0;i<rowA;i++){
for(j=0;j<colB;j++){
MatC[i][j]=MatA[i][j] * MatB[i][j];
System.out.print(MatC[i][j] +" ");
}
System.out.println();
}
break;
}
}
}




