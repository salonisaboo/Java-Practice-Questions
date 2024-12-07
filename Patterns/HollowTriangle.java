import java.util.Scanner;
class HollowTriangle{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
for(int i=1;i<=n;i++){
for(int j=i;j<n;j++){
System.out.print(" ");
}
for(int k=1;k<=(2*i-1);k++){
if(k==1||n==i||k==(2*i-1)){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}
