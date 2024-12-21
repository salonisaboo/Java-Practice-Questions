import java.util.*;
class frequency{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=s.nextLine();
        int i,j;
        int freq[] =new int[str.length()];
        char string[]=str.toCharArray();
        for( i=0;i<str.length();i++){
            freq[i]=1;
            for( j=i+1;j<str.length();j++){
                if(string[i]==string[j]){
                freq[i]++;
                string[j]='0';
                }
            }
        }
        System.out.println("Characters with there freruency are:");
        for( i=0;i<freq.length;i++){
            if(string[i] != ' ' && string[i]!='0'){
                System.out.println(string[i]+"\t-\t"+freq[i]);
            }
        }
    }
}