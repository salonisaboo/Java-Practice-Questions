import java.util.Scanner;
class Diamond{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
for(int i=0;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++){
System.out.print("*");
}
System.out.println();
}
for(int i=n-1;i>=1;i--){
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++){
System.out.print("*");
}
System.out.println();
}
}
}
