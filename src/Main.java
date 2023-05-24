import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with a zip code (BR): ");
        var zipCode = sc.nextLine();

        ZipCodeQuery zipCodeQuery = new ZipCodeQuery();

        try {
            Address newAddress = zipCodeQuery.findAddress(zipCode);
            System.out.println(newAddress);

            FileGenerator generator = new FileGenerator();
            generator.jsonSave(newAddress);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Terminated.");
        }
    }
}
