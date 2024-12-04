import java.util.Scanner;
class GCD{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter first number");
int num1=s.nextInt();
System.out.println("Enter second number");
int num2=s.nextInt();
int i,res=1;

for(i=1;i<=num1&& i<=num2;i++){
if(num1%i==0 && num2%i==0){
res=i;
}

}
System.out.println("GCD of"+ " "+num1+" "+ "&"+" "+num2+ " "+"is"+ " "+res);

}
}
