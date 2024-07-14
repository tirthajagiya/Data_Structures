import java.util.Scanner;

class StackImpl{
    int top=-1;
    char Stack[];
    int size;

    public StackImpl(int size){
        this.size=size;
        Stack=new char[size];
    }

    public void push(char z){
        if(top>=size){
            System.out.println("Stack Overflow.");
            return;
        }

        top++;
        Stack[top]=z;
    }

    public char pop(){
        if(top<0){
            System.out.println("Stack Underflow.");
            return '0';
        }

        top--;
        return Stack[top+1];
    }
}

public class Lab_39{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String:");
        String str=sc.next().toLowerCase();
        StackImpl stack1=new StackImpl(str.length());
        char next;
        int index=0;
        next=str.charAt(index);
        stack1.push('c');
        while(next!='c'){
            stack1.push(next);
            index++;
            next=str.charAt(index);
        }
        index++;
        char x;
        char topElemant=stack1.pop();
        while(topElemant!='c'){
            next=str.charAt(index);
            if(next!=topElemant){
                System.out.println("Invalid String.");
                break;
            }
            index++;
            topElemant=stack1.pop();
            
        }

        index++;
        next=str.charAt(index);

        if(next==' '){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}	