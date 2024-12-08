import java.util.Scanner;
class PascalTriangle{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
for(int i=1;i<=n;i++){
for(int j=0;j<=n-i;j++){
System.out.print(" ");
}
int t=1;
for(int k=1;k<=i;k++){
System.out.print(t +" ");
t=t*(i-k)/k;
}
System.out.println();
}
}
}


