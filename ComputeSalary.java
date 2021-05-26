import java.util.Scanner;
class ComputeSalary{
    public static void main(String args[]){
        int[] hoursEachDay=new int[7];
        Scanner sc=new Scanner(System.in);
        int totHrsWorked=0,num,salary=0,extraHoursPay;
        for(int i=0;i<7;i++){
            hoursEachDay[i]=sc.nextInt();
            totHrsWorked+=hoursEachDay[i];
        }
        sc.close();
        if(totHrsWorked>40){
            extraHoursPay=(totHrsWorked-40)*25;  //Extra pay beyond 40 hrs
            salary=extraHoursPay+totHrsWorked*100;
        }
        else{
            for(int i=0;i<=6;i++){
                num=hoursEachDay[i];
                if(i==0){ //Sunday
                    salary+=num>8?((num-8)*15)+num*150:num*150;
                }
                else if(i==6){ //Saturday
                    salary+=num>8?((num-8)*15)+num*125:num*125;
                }
                else{ //Weekdays
                    salary+=num>8?((num-8)*15)+num*100:num*100;
                }
            }
        }
        System.out.println(salary);
    }
}
