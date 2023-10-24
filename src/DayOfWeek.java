import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number (1-7): ");
    int dayNumber = scanner.nextInt();

    scanner.close();

    String dayOfWeek;

    switch (dayNumber) {
        case 1:
            dayOfWeek = "Sunday";
            System.out.print("Sunday");
            break;
        case 2:
            dayOfWeek = "Monday";
            System.out.print("Monday");
            break;
        case 3:
            dayOfWeek = "Tuesday";
            System.out.print("Tuesday");
            break;
        case 4:
            dayOfWeek = "Wednesday";
            System.out.print("Wednesday");
            break;
        case 5:
            dayOfWeek = "Thursday";
            System.out.print("Thursday");
            break;
        case 6:
            dayOfWeek = "Friday";
            System.out.print("Friday");
            break;
        case 7:
            dayOfWeek = "Saturday";
            System.out.print("Saturday");
            break;
        default:
            dayOfWeek = "Invalid input";
            break;
    }
    String suffix;

    switch (dayNumber) {
        case 1:
        case 21:
        case 31:
            suffix = "st";
            break;
        case 2:
        case 22:
            suffix = "nd";
            break;
        case 3:
        case 23:
            suffix = "rd";
            break;
        default:
            suffix = "th";
            break;
    }
    if (dayNumber >= 1 && dayNumber <= 7) {
        System.out.println("The " + dayNumber + suffix + " day of the week is " + dayOfWeek);
    }
    else {
        System.out.println("Invalid input. Please enter a number between 1 and 7.");
    }

}




}



