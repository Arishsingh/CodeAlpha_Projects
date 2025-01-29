import java.util.*;
public class word{
    public static void wordcount(){
        Scanner sc = new Scanner(System.in);
        String sentence ;
        int n = 0;
        System.out.print("ENTER SENTENCE ");
        sentence = sc.nextLine();
        if(sentence == null){
            n =0;
        }
        sentence = sentence.trim();// removes white space at the  starting or at the end;
for(int i =0; i<sentence.length();i++){
if(sentence.charAt(i)==' ' && sentence.charAt(i+1)!= ' '){
n++;
}
}
System.out.println("NUMBER OF WORDS IN THE SENTENCE :"+ (n+1));
    }
    public static void main(String args[]){
        wordcount();
    }

}