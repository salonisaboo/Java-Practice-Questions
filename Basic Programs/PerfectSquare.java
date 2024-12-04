import java.util.Scanner;
class PerfectSquare{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
if(perfectSquare(num)){
System.out.println(num+" "+"is perfect square number");
}else{
System.out.println(num+" "+"is not a perfect square number");
}
}
public static boolean perfectSquare(int num){
for(int i=1;i*i<=num;i++){
if(i*i==num){
return true;
}
}
return false;
}
}

