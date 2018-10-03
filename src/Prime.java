import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần check");
        if (isPrime(sc.nextInt())) {
            System.out.println("->nguyên tố");
        } else {
            System.out.println("->không phải nguyên tố");
        }

        System.out.print("nhập giới hạn số nguyên tố lớn nhất");
        String[] printOut = getArrayOfPrime(sc.nextInt());
        for (int i = 0; i < printOut.length; i++) {
            System.out.println("số nguyên tố thứ " + i + ": " + printOut[i]);
        }


    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt((double) n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String[] getArrayOfPrime(int n) {
        String prime = "";
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                prime += (i + ".");
            }
        }
        return prime.split("\\.");
    }
}
