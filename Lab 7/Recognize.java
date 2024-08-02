import java.util.Stack;
import java.util.Scanner;
public class Lab_39{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String:");
        String str=sc.next();
        Stack<Character> stackObj=new Stack<>();
        int index=0;
        char next=str.charAt(index++);
        // stackObj.push('c');
        String c="c";
        if(!str.contains(c)){
            System.out.println("Invalid String");    
        }
        else{
            while(next!='c'){
                if(next==' '){
                    System.out.println("Invalid String.");
                    break;
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
                    break;
                }
                }
                System.out.println("Valid String.");
        }
    }
}