package Assignment;
import java.util.*;
public class Boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1 || n == 0) {
            System.out.println(0);
        } else {
            if (PrimeFactor(n) == DigitSum(n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }

    public static int PrimeFactor(int n) {
        int i = 2;
        int sum = 0;
        while (n > 1) {
            while (n % i == 0) {
                sum += DigitSum(i);
                n = n / i;
            }
            i++;
        }
        return sum;
    }

    public static int DigitSum(int n) {
        int num = n;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
	}

}
