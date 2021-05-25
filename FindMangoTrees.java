import java.util.Scanner;
class FindMangoTrees{
    static String mangoTreeFinder(int rows,int cols,int treeNum){
        if(treeNum%cols==0 || treeNum%cols==1 || treeNum<=cols)
            return "Yes indeed";
        return "Sorry, not a mango tree!";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();int cols=sc.nextInt();
        int treeNum=sc.nextInt();
        sc.close();
        if(treeNum>rows*cols)
            System.out.println("Not a valid Tree Number");
        else
            System.out.println(mangoTreeFinder(rows,cols,treeNum));
    }
}