import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in); //Создание сканера
        String s = m.nextLine();
        args = s.split(" "); //Разбиение строчки на отдельные слова и записываем в массив args
        for (int i = 0; i < args.length; i++) {
            String str = args[i]; // Заносим в переменную str элементы массива
            System.out.print (str+" ");
            System.out.println(isPalindrome(str));
        }
    }
    public static String reverseString(String s){ //Переворачиваем буквы в слове
        String l;
        l = "";
        for (int i = s.length()-1; i > -1; i--){
            l += s.charAt(i);
        }
        return l;
    }
    public static boolean isPalindrome(String s){

        return s.equals(reverseString(s)); // Сравнение слов
    }
}
