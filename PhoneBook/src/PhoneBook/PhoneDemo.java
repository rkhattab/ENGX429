package PhoneBook;
import java.util.Scanner;

/**
*
* @author Reem Khattab
*/

public class PhoneDemo {
    private static Scanner city;
	private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter your country code: ");
        int myint = input.nextInt();
        Phone p = new Phone();
        System.out.println("Your status in the USA is " + p.isUSA(myint));

        city = new Scanner(System.in);
        System.out.print("Enter your city code: ");
        int myCity = city.nextInt();
        System.out.println(p.citycode(myCity));
    }
}