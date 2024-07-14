import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.err.println("Enter:");
            arr[i]=sc.nextInt();
        }
        int temp;

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
