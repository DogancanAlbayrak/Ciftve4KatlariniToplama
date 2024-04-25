import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n; / We are getting the value of n from the user.
        int sum = 0; //We initialize the sum value as 0 since its initial value is not determined.

        do {
            System.out.print("Sayı giriniz : ");
            n = scan.nextInt(); //We are getting a value for n from the user.
            if (n % 4 == 0 && n % 2 == 0) { //We are checking if the numbers entered by the user are multiples of 4 and 2.
                sum += n; //Summation of the numbers that meet the criteria.
            }
        } while (n % 2 != 1); //If the entered number is odd, we stop the program.
        System.out.print("Toplam : " + sum);
    }
}