import java.util.Scanner;
class K_Pattern{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
for(int i=n;i>=1;i--){
for(int j=0;j<i;j++){
System.out.print("*");
}
System.out.print("\n");
}
for(int i=2;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.print("\n");
}
}
}
