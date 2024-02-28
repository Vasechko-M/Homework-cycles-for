public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача 1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //task 2
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
        //task 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
        //task 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
        //task 5
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " является високосным");
        }
        //task 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //task 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //task 8
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }
        //task 9
        System.out.println("Задача 9");
        salary = 29000; total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }
        //task 10
        System.out.println("Задача 10");
        int number = 0;
            for (int x = 2; x <= 20; x = x+2){
                number = number+1;
            System.out.println("2 * " +number+ " = " +x);
        }

    }
}