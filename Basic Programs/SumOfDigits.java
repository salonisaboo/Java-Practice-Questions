import java.util.Scanner;
class SumOfDigits
{
   public static void main(String[] args)
   {
     int sum=0,rem;
     Scanner s= new Scanner(System.in);
     System.out.println("Enter a number");
     int num= s.nextInt();
     while(num>0){
      rem=num%10;
      sum=sum+rem;
      num= num/10;
    }
    System.out.println(sum);
}
}
