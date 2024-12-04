import java.util.Scanner;
import static java.lang.Math.sqrt;
class PrimeRange{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter first number");
int num1=s.nextInt();
System.out.println("Enter second number");
int num2=s.nextInt();
System.out.println("Prime numbers between"+" "+num1 +" and" +" " +num2 +" are");
for(int i=num1;i<num2;i++){
if(isPrime(i)){
System.out.println(i);
}
}
}
public static boolean isPrime(int n){
if(n<=1){
return false;
}
for(int i=2;i<=Math.sqrt(n);i++){
if(n%i==0){
return false;
}
}
return true;
}
} 