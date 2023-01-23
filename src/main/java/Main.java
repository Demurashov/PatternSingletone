import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Integer> integerList;
    private static int trashold;
    private static int sizeList;
    private static int maxNum;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");
        menu();
        integerList = listGena();
        System.out.println("Сгенерированный случайный список: ");
        integerList.forEach(a -> System.out.print(a + " "));
        System.out.println();
        Filter filter = new Filter(trashold);
        List<Integer> outList = filter.filterOut(integerList);
        System.out.println("Выходной список: ");
        outList.forEach(a -> System.out.print(a + " "));
    }

    public static String input(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    public static void menu() {
        Logger logger = Logger.getInstance();
        System.out.println("-----------Старт программы-------------");
        sizeList = parseInt(input("Введите размер списка чисел: "));
        logger.log("Введен размер списка " + sizeList);
        maxNum = parseInt(input("Введите максимальное число списка: "));
        logger.log("Введено предельное значение списка " + maxNum);
        trashold = parseInt(input("Введите порог для фильтра: "));
        logger.log("Введен порог фильтрации " + trashold);
    }

    public static List<Integer> listGena() {
        Logger logger = Logger.getInstance();
        logger.log("Генерация входного списка");
        List<Integer> promlist = new ArrayList<>(sizeList);
        for (int i = 0; i < sizeList; i++) {
            promlist.add(new Random().nextInt(maxNum));
        }
        return promlist;
    }

}
//new Random().nextInt(maxNum)