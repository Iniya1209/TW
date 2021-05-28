import java.util.Scanner;
public class LowerTrianglularMatrix {
    static boolean isLowerTriangle(int square[][],int rowSize){
        for(int row=0;row<rowSize-1;row++){
            for(int col=row+1;col<rowSize;col++){
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
            if(isLowerTriangle(square, rowSize))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
