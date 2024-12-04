import java.util.Scanner;
class SquareRoot{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter a number");
int n= s.nextInt();
System.out.println("The square root of"+" " +n+ " " +"is"+" "+squareRoot(n));
}
public static double squareRoot(int num){
double t;
double sqRoot=(num/2);
do{
t=sqRoot;
sqRoot=(t+(num/t))/2;
}
while((t-sqRoot)!=0);
return sqRoot;
}
}



