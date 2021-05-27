import java.util.Scanner;

public class ArrayTypeFinder {
    static int arrayType(int[] arr,int noOfElements){
        int oddOrEven;
        if(arr[0]%2==0){oddOrEven=2;}
        else{oddOrEven=1;}
        for(int index=1;index<noOfElements;index++){
            if(oddOrEven==1 && arr[index]%2==0){oddOrEven=3;break;}
            else if(oddOrEven==2 && arr[index]%2!=0){oddOrEven=3;break;}
        }
        return oddOrEven;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int noOfElements=sc.nextInt();
        int[] arr=new int[noOfElements];
        String[] output={"","Odd","Even","Mixed"};
        for(int i=0;i<noOfElements;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The Array type is, "+output[arrayType(arr, noOfElements)]);
    }
}
