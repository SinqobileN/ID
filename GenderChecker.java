import java.util.Scanner;

public class GenderChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
            System.out.println("Hello!!");
        while (!validInput) {
            System.out.print("Enter ID number: ");
            String idNumber = scanner.nextLine();

            if (idNumber.length() != 13) {
                System.out.println("Invalid ID number. It should be 13 digits long. Please try again.");
            } else {
                String genderCode = idNumber.substring(6, 10);
                int genderInt = Integer.parseInt(genderCode);

                if (genderInt >= 0 && genderInt <= 4999) {
                    System.out.println("Gender: Female");
                    validInput = true;
                } else if (genderInt >= 5000 && genderInt <= 9999) {
                    System.out.println("Gender: Male");
                    validInput = true;
                } else {
                    System.out.println("Invalid ID number. Please try again.");
                }
            }
        }

        scanner.close();
    }
}

