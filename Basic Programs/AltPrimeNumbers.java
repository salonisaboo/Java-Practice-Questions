
import java.util.Scanner;
import static java.lang.Math.*;
class AltPrimeNumbers{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
int count=0;

for(int i=2;i<=n;i++){
boolean isPrime = true;
for(int k=2;k<=Math.sqrt(i);k++){
if(i%k==0){
isPrime=false;
break;
}
}
if(isPrime){
count++;
if(count%2==1){
System.out.println(i);
}
}
}
}
}



