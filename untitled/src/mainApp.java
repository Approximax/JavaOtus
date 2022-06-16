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
        String animalChoice = scan_for_userInput.next().trim().toLowerCase();
        CommandsAnimalMenu commands = CommandsAnimalMenu.valueOf(animalChoice);

        while (true){
            System.out.println("Привет! Вот список команд:" + Arrays.toString(CommandsAnimalMenu.values()));
            switch (commands) {
                case ADD :
                    System.out.println("Какое животное добавить: cat, dog, duck?");

                    if (animalChoice.equals("cat")) {
                        Animal cat = new Cat();
                        animals.add(cat);
                        animalSelect(cat, scan_for_userInput);
                        cat.Say();
                    } else if (animalChoice.equals("dog")) {
                        Animal dog = new Dog();
                        animals.add(dog);
                        animalSelect(dog, scan_for_userInput);
                        dog.Say();
                    } else if (animalChoice.equals("duck")) {
                        Animal duck = new Duck();
                        animals.add(duck);
                        animalSelect(duck, scan_for_userInput);
                        duck.Say();
                    }
                    break;
                case LIST :
                    System.out.println("Вывод списка всех добавленных животных");
                    animals.toString();
                    break;
                case EXIT :
                    System.out.println("Выход");
                    System.exit(1);
                    break;
                default : System.out.println("Неизвестная команда");
            }

        }
    }

    public static void animalSelect (Animal animal, Scanner scanner) {
        System.out.println("Как его будут звать?");
        animal.setName(scanner.next());
        System.out.println("Сколько ему лет?");
        animal.setAge(scanner.nextInt());
        System.out.println("Сколько оно весит?");
        animal.setWeight(scanner.nextInt());
        System.out.println("Какого оно цвета?");
        animal.setColor(scanner.next());
    }
}
