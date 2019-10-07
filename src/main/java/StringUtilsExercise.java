import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilsExercise {

    public static void main(String[] args) {

        Faker faker = new Faker();
        for(int i = 0; i < 100; i++) {

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter something");


            if (StringUtils.isNumeric(name)) {
                System.out.println("You entered: " + name);
                System.out.println(name + " is a number.");
                System.out.println("Flipped case: " + StringUtils.swapCase(name));
                System.out.println("Reversed: " + StringUtils.reverse(name));
            } else {
                System.out.println("You entered: " + name);
                System.out.println(name + " is not a number.");
                System.out.println("Flipped case: " + StringUtils.swapCase(name));
                System.out.println("Reversed: " + StringUtils.reverse(name));
            }
        }


    }

}
