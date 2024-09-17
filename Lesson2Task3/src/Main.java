import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Меню зоопарка:");
            System.out.println("1 - Показать список всех животных в зоопарке.");
            System.out.println("2 - Добавить животное в список");
            System.out.println("3 - Удалить животное из списка");
            System.out.println("4 - Очистить список");
            System.out.println("5 - Проверить наличие животного");
            System.out.println("0 - Отмена");

            System.out.println("Выберите действие: ");
            Integer action = scanner.nextInt();
            scanner.nextLine();
            System.out.println(" ");

            switch (action){
                case 1:
                    if(animals.isEmpty())
                        System.out.println("В зоопарке пока нет животных.");
                    else {
                        System.out.println("Животные в зоопарке:");
                        for (String animal : animals) {
                            System.out.println(animal);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите название животного, которого хотите добавить:");
                    String animalAdd = scanner.nextLine();
                    animals.add(animalAdd);
                    break;
                case 3:
                    if (animals.isEmpty()) {
                        System.out.println("В зоопарке нет животных для удаления.");
                    }
                    else {
                        System.out.print("Введите название животного для удаления: ");
                        String animalRemove = scanner.nextLine();
                        if (animals.remove(animalRemove)) {
                            System.out.println("Животное удалено из списка.");
                        }
                        else {
                            System.out.println("Такого животного нет в списке.");
                        }
                    }
                    break;
                case 4:
                    if (animals.isEmpty()) {
                        System.out.println("Список животных уже пуст.");
                    }
                    else {
                        animals.clear();
                        System.out.println("Список животных очищен.");
                    }
                    break;
                case 5:
                    System.out.println("Введите название животного для проверки:");
                    String animalContains = scanner.nextLine();
                    if (animals.contains(animalContains))
                        System.out.println("Это животное есть в зоопарке");
                    else
                        System.out.println("Этого животного нет в зоопарке");
                    break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("Некорректный выбор! Попробуйте снова");
            }
        }
    }
}
