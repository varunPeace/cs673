import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        int str = scanner.nextInt();
        if(isLeapYear(str))
            System.out.println("Given year is Leap year");
        else
            System.out.println("Given year is NOT leap year");
    }

    public static boolean isLeapYear(int str){
        boolean is_leap_year;

        if(str % 4 == 0){
            is_leap_year = true;
            if(str % 100 == 0)
            {
                if(str % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;

        if(is_leap_year)
            return true;
        else
            return false;
    }
}
