import java.util.Scanner;
class CollatzSequence{
    static void printCollatzSequence(int num){
        while(num!=1){
            System.out.println(num);
            num=(num%2==0)?num/2:num*3+1;
        }
        System.out.println(num);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        printCollatzSequence(num);
    }
}