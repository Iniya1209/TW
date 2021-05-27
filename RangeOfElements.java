import java.util.Arrays;
import java.util.Scanner;
public class RangeOfElements {
    static int rangeFinder(int[] arr,int noOfElements){
        Arrays.sort(arr);
        int range=arr[noOfElements-1]-arr[0];
        return range;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int noOfElements=sc.nextInt();
        int[] arr=new int[noOfElements];
        for(int i=0;i<noOfElements;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The range of the array is "+rangeFinder(arr, noOfElements));
    }
}
