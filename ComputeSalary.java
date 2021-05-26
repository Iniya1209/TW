  
import java.util.Scanner;
class ComputeSalary{
    static int salaryCalculator(int totHrsWorked,int[] hoursEachDay){
        int num,salary=0,extraHoursPay;
        if(totHrsWorked>40){
            extraHoursPay=(totHrsWorked-40)*25; //Extra pay beyond 40hrs
            salary=extraHoursPay+totHrsWorked*100;
        }
        else{
            for(int i=0;i<=6;i++){
                num=hoursEachDay[i];
                if(i==0){salary+=num>8?((num-8)*15)+num*150:num*150;} //Sunday
                else if(i==6){salary+=num>8?((num-8)*15)+num*125:num*125;} //Saturday
                else{salary+=num>8?((num-8)*15)+num*100:num*100;} //Weekdays
            }
        }
        return salary;
    }
    public static void main(String args[]){
        int[] hoursEachDay=new int[7];
        Scanner sc=new Scanner(System.in);
        int totHrsWorked=0;
        for(int i=0;i<7;i++){
            hoursEachDay[i]=sc.nextInt();
            totHrsWorked+=hoursEachDay[i];
        }
        sc.close();
        System.out.println(salaryCalculator(totHrsWorked, hoursEachDay));
    }
}
