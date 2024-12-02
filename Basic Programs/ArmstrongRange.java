import java.util.Scanner;
import java.math.*;
class ArmstrongRange{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter lower limit");
int low=s.nextInt();
System.out.println("Enter upper limit");
int high=s.nextInt();
for(int i=low+1;i<high;i++){
int check=i;
int n=0;
while(check!=0){
check/=10;
++n;
}
int res=0;
 check=i;
while(check!=0){
int rem=check%10;
res+=Math.pow(rem,n);
check/=10;
}
if(res==i){
System.out.println(i);
}
}
}
}

