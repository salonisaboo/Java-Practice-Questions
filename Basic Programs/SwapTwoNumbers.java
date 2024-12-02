import java.util.Scanner;
class SwapTwoNumbers{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter first number");
int num1=s.nextInt();
System.out.println("Enter second number");
int num2=s.nextInt();
System.out.println("Numbers before swapping"+" " +num1+ " "+num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("Numbers after swapping"+" " +num1+ " "+num2);
num1=num1^num2;
num2=num1^num2;
num1=num1^num2;
System.out.println("Numbers on one more swapping"+" " +num1+ " "+num2);

}
}

