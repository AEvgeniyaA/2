import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.



/**
 * t1
 */
public class t1 {

    public static void main(String[] args) {
   number();


}

static void number(){
    System.out.println("Введите дробное число : ");
    Scanner scanner = new Scanner(System. in);
    float n = scanner.nextFloat();
    if(n % 1 == 0){
         System.out.println("Введите именно дробное число");
    }
    else{
        System.out.println ("Ваше число:");
        System.out.println(n);
    }


}

}