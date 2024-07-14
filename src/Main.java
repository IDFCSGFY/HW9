import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("\n#1\n");
        int expenses[] = new int[5];
        Random random = new Random();
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(expenses));
        int sumOfExpenses = 0;
        for (int expense : expenses) {
            sumOfExpenses += expense;
        }
        System.out.println("Сумма трат за месяц составила " + sumOfExpenses + " рублей");

        //2
        System.out.println("\n#2\n");
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(expenses));
        int minExpense = expenses[0];
        int maxExpense = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] < minExpense) {
                minExpense = expenses[i];
            } else if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        //3
        System.out.println("\n#3\n");
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(expenses));
        float averageExpense = 0;
        for (int expense : expenses) {
            averageExpense += expense;
        }
        averageExpense /= 5;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

        //4
        System.out.println("\n#4\n");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}
