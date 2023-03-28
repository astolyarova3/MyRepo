//Программа с использованием ArrayList:

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // заполнение списка числами от 1 до N
        System.out.print("Введите количество человек: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        // вычеркивание каждого второго человека
        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size(); // выбираем каждый второй человек
            list.remove(index);
        }

        // вывод результата
        System.out.println("Остался человек под номером " + list.get(0));
    }
}

//Программа с использованием LinkedList:

        import java.util.LinkedList;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // заполнение списка числами от 1 до N
        System.out.print("Введите количество человек: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        // вычеркивание каждого второго человека
        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size(); // выбираем каждый второй человек
            list.remove(index);
        }

        // вывод результата
        System.out.println("Остался человек под номером " + list.get(0));
    }
}

//Программа с использование LinkedList работает быстрее 