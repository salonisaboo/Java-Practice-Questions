import java.util.Scanner;
class Triangle{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
for(int i=0;i<n;i++){
for(int j=n-i;j>1;j--){
System.out.print(" ");
}
for(int j=0;j<=i;j++){
System.out.print("* ");
}

System.out.print("\n");
}
}
}