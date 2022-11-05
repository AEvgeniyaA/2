import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.




public class t4 {
    public static void main(String[] args) {
        System.out.println("Введите число в терминал:");
        Scanner scanner = new Scanner(System.in);
        String numAsSyr = scanner.nextLine();
        try {
            double d = Double.parseDouble(numAsSyr.trim());
        }catch (NumberFormatException ex) {
            System.out.println("Не число или пустая строка!");
        }
    }

    }

