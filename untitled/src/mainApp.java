import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class mainApp {

    public static void main(String[] args) {

//        тут тоже не большой велосипед с перечисление команд из енам, подозреваю, что можно переопределить метод toString.
//        Реализую с переопределением ту стринг позже
        System.out.println("Привет! Вот список команд:" + CommandsAnimalMenu.ADD + ", " + CommandsAnimalMenu.LIST + ", " + CommandsAnimalMenu.EXIT);

        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scan_for_userInput = new Scanner(System.in);
        String userChoice = scan_for_userInput.next();

//        switch (userChoice.trim().toUpperCase(Locale.ROOT)){
//            case   :
//
//        }


    }
}
