import name.NameContainer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NameContainer nameContainer = new NameContainer();
        nameContainer.setName("mario");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        nameContainer.setSurname(scanner.next());
        System.out.println(nameContainer.printFullname());
    }
}