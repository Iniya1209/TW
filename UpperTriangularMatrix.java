import java.util.Scanner;
public class UpperTriangle {
    static boolean isUpperTriangle(int square[][],int rowSize){
        for(int row=1;row<rowSize;row++){
            for(int col=0;col<row;col++){
                if(square[row][col]!=0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rowSize=sc.nextInt();
        int colSize=sc.nextInt();
        if(rowSize!=colSize || rowSize<=0){
            System.out.println("Invalid Input");
        }
        else{
            int square[][]=new int[rowSize][colSize];
            for(int row=0;row<rowSize;row++){
                for(int col=0;col<colSize;col++){
                    square[row][col]=sc.nextInt();
                }
            }
            sc.close();
            if(isUpperTriangle(square, rowSize))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
