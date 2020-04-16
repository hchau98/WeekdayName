import java.util.Scanner;
public class WeekdayName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num =0;
        while(num>=1 || num<=7) {
            System.out.println("Enter in a number between 1-7:");
            num = input.nextInt();

            if (num == 1) {
                System.out.println("It is Sunday");
            }
            if (num == 2) {
                System.out.println("It is Monday");
            }
            if (num == 3) {
                System.out.println("It is Tuesday");
            }
            if (num == 4) {
                System.out.println("It is Wednesday");
            }
            if (num == 5) {
                System.out.println("It is Thrusday");
            }
            if (num == 6) {
                System.out.println("It is Friday");
            }
            if (num == 7) {
                System.out.println("It is Saturday");
            }
        }
    }
}
