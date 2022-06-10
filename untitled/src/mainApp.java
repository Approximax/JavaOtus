import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mainApp {

    @Override
    public String toString() {
        return CommandsAnimalMenu.ADD + ", " + CommandsAnimalMenu.LIST + ", " + CommandsAnimalMenu.EXIT;
    }

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scan_for_userInput = new Scanner(System.in);
        String userChoice = scan_for_userInput.next().toUpperCase().trim();
        CommandsAnimalMenu commands = CommandsAnimalMenu.ADD;

        while (true){
            System.out.println("Привет! Вот список команд:" + Arrays.toString(CommandsAnimalMenu.values()));
            switch (commands) {
                case ADD -> {
                    System.out.println("Какое животное добавить: cat, dog, duck?");
                    String animalChoice = scan_for_userInput.next();
//                    animalChoice();
//                    System.out.println("Какое у него будет имя?");
//                    nameChoice();
//                    System.out.println("Какого возраста?");
//                    ageChoice();
//                    System.out.println("Какого цвета?");
//                    colourChoice();


                }

                case LIST -> {}
                case EXIT -> {

                }

            }

        }
    }

    public Animal animalSelect (Animal animal, Scanner scanner) {
        System.out.println("Как его будут звать?");
        animal.setName(scanner.next());
        System.out.println("СЧ");
    }
}
