import java.util.Scanner;
import static java.lang.Math.sqrt;
class Armstrong{
public static void main(String[] args){
int temp,res=0,rem;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
temp=num;
while(temp!=0){
rem=temp%10;
res+=Math.pow(rem,3);
temp/=10;
}
if(res==num){
System.out.println("Armstrong number");
}
else{
System.out.println("Not a Armstrong number");
}
}
}