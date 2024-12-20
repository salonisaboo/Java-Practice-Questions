import java.util.*;
class IndividualCharacters{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}