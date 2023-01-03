package week09_11_05_2022;

public class Task2_PrimeNumber {
    public static void main(String[] args) {

        boolean result= isPrime(7);

        System.out.println(result);
    }

    public static boolean isPrime(int number) {

        boolean isPrime=true;

        if(number<2){
            return false;
        }

        for (int i = 2; i <number ; i++) {
            if(number%i==0){
                isPrime=false;
                break;
            }

        }
        return isPrime;
    }
}
