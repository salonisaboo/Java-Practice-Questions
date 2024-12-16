import java.util.*;
class SwapStrings{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.println("Strings before Swapping\n"+str1+",\n"+str2);
        str1 = str1+str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("Strings before Swapping\n"+str1+",\n "+str2);
    }
}