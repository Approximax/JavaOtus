import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class MainApp {

//    @Override
//    public String toString() {
//        return CommandsAnimalMenu.ADD + ", " + CommandsAnimalMenu.LIST + ", " + CommandsAnimalMenu.EXIT;
//    }

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scan_for_userInput = new Scanner(System.in);



        while (true){
            System.out.println("Привет! Вот список команд:" + Arrays.toString(CommandsAnimalMenu.values()));
            String commandChoice = scan_for_userInput.next().trim().toUpperCase();
            CommandsAnimalMenu commands = CommandsAnimalMenu.valueOf(commandChoice);

            switch (commands) {
                case ADD :
                    System.out.println("Какое животное добавить: cat, dog, duck?");
                    String animalChoice = scan_for_userInput.next().trim().toLowerCase();
                    if (animalChoice.equals("cat")) {
                        Animal cat = new Cat();
                        cat.say();
                        animals.add(cat);
                        animalSelect(cat, scan_for_userInput);
                    } else if (animalChoice.equals("dog")) {
                        Animal dog = new Dog();
                        dog.say();
                        animals.add(dog);
                        animalSelect(dog, scan_for_userInput);
                    } else if (animalChoice.equals("duck")) {
                        Animal duck = new Duck();
                        duck.say();
                        animals.add(duck);
                        animalSelect(duck, scan_for_userInput);
                    }
                break;

                case LIST :
                    System.out.println("Вывод списка всех добавленных животных");
                    animals.forEach(new Consumer<Animal>() {
                        @Override
                        public void accept(Animal animal) {
                            System.out.println(animal);
                        }
                    });
                break;
                case EXIT :
                    System.out.println("Выход");
                    System.exit(1);

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
