public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        separator();
        taskOne task1 = new taskOne();
        task1.findUnique(); // Ищем, подсчитываем и выводим уникальные слова

        separator();

        System.out.println("Задание №2");
        separator();
        taskTwo task2 = new taskTwo();
        fillPhoneBook(task2); // Добавляем данные в адрессную книгу
        System.out.println(task2.get("Иванов")); // ищем телефон
    }

    private static void separator() {
        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println();
    }

    private static void fillPhoneBook(taskTwo task2) {
        task2.add("Иванов", "555-11-11");
        task2.add("Сидоров", "555-11-12");
        task2.add("Петров", "555-11-13");
        task2.add("Ключневский", "555-11-14");
        task2.add("Светлова", "555-11-15");
        task2.add("Верховны", "555-11-16");
        task2.add("Верховны", "555-11-17");
        task2.add("Иванов", "555-11-18");
        task2.add("Светлова", "555-11-19");
    }
}
