import java.util.Scanner;

public class PemilihanOperator08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName;
        String dayType;

        System.out.print("Input Day Name: ");
        dayName = sc.nextLine().toLowerCase(); 

        if (dayName.equals("monday") || dayName.equals("tuesday") || 
            dayName.equals("wednesday") || dayName.equals("thursday") || 
            dayName.equals("friday")) {
            dayType = "weekday"; 
        } else if (dayName.equals("saturday") || dayName.equals("sunday")) {
            dayType = "weekend"; 
        } else {
            dayType = "invalid day name"; 
        }

        System.out.println(dayName + " is a " + dayType);
    }
}
