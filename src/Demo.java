import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Moi ban nhap so luong sont");
        int n = s.nextInt();
        printNPrimes(n);
        clearConsole();

    }
    public static boolean isPrime(int n){
        if (n<=1)
            return false;
        else
            if (n<=3)
                return true;
            else {
                for (int i = 2; i <= Math.sqrt(n) ; i++) {
                    if (n % i == 0) return false;
                }
                return true;
            }
    }

    public  static void printNPrimes(int n){
        int count = 0;
        int i = 2;
        while (count <n){
            if (isPrime(i)) {
                System.out.println(i);
                count++;}
            i++;
        }
    }
    public static void printPrimeNhoHon100(){
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}