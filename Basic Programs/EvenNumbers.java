import java.util.Scanner;
class EvenNumbers{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
System.out.println("Even numbers from 1 to"+" "+n+" "+"are:");
for(int i=0;i<=n;i++){
if(i%2==0){
System.out.println(i);
}
}
System.out.println();
}
}

