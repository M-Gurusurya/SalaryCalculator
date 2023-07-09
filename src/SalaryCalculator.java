import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours_worked[]=new int[7];
        int total_hours=0;
        int total_salary=0;
        for(int i=0;i<7;i++)
        {
            hours_worked[i] = sc.nextInt();
            int day_salary=0;
            total_hours += hours_worked[i];
            day_salary += hours_worked[i]*100;
            if(hours_worked[i] > 8)
                day_salary += (hours_worked[i]-8)*15;
            if(i == 0)
                day_salary = day_salary+(day_salary*50)/100;
            if(i == 6)
                day_salary = day_salary+(day_salary*25)/100;
            total_salary += day_salary;
        }
        if(total_hours > 40)
            total_salary += (total_hours-40)*25;
        System.out.println(total_salary);
    }
}
