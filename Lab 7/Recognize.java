import java.util.Stack;
import java.util.Scanner;
public class Recognize{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String:");
        String str=sc.next().toLowerCase();
        Stack<Character> stackObj=new Stack<>();
        int index=0;
        char next=str.charAt(index++);
        String c="c";
        String b="b";
        String a="a";
        if(str.contains(c)&& (str.contains(a)|| str.contains(b))){
            while(next!='c'){
                if(next==' '){
                    System.out.println
                    ("Invalid String.");
                    return;
                }
                else{
                    stackObj.push(next);
                    next=str.charAt(index++);
                }
            }
            while(!stackObj.isEmpty()){
                next=str.charAt(index++);
                char x=stackObj.pop();
                if(x!=next){
                    System.out.println("Invalid String.");
                    return;
                }
                }
                System.out.println("Valid String.");
        }
        else{
            System.out.println("Invalid String.");
        }
    }
}