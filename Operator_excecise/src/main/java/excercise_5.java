
import java.util.Scanner;


public class excercise_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n_hours, week, day, hour, res_week, res_day;
        
        System.out.println("Insert the N hours");
        n_hours = input.nextInt();
        
        //24 hours per for all the days of the week
        res_week = n_hours % (24 * 7);
        week = (n_hours - res_week) / (24 * 7);
        
        res_day = res_week % 24;
        day = (res_week - res_day) / 24;
        
        System.out.println("number of weeks: " + week);
        System.out.println("number of days: " + day);
        System.out.println("number of hours: " + res_day);
    }
}
