package PhoneBook;

/**
*
* @author Reem Khattab
*/

public class Phone {
    int countryCode;
    int areaCode;
    int phoneNumber;

    boolean isUSA(int x) {
        if (x == 1) return true;
        else return false;
    }
    // return name of area code city
    int citycode(int input) {

        switch (input) {
            case 510:
                System.out.println("Your city code is East Bay Area.");
                break;
            case 650:
                System.out.println("Your city code is SF Penisula.");
                break;
            case 415:
                System.out.println("Your city code is San Francisco.");
                break;
            case 408:
                System.out.println("Your city code is South Bay area.");
                break;
            default:
                System.out.println("You are not in our system. Try again.");
        }

        return 0;
    }
}