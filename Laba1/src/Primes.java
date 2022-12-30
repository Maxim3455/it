public class Primes {

    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) { //Перебор чисел от 2 до 100
            if (isPrime(i)){ // Вызов метода isPrime. Если условие выполнилось, тогда мы вывводим его.
                System.out.println (i);
            }
        }
    }

    public static boolean isPrime(int n) //Находим простые числа
    {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}