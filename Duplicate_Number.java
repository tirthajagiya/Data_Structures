import java.util.Scanner;
public class Duplicate_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Length Of Array:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter:");
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]==arr[i]){
                    System.out.print(arr[i]+",");
                }
            }
        }

    }
}