@FunctionalInterface
interface PrimeChecker {
    MyPrimeClass check(int number);
}

class MyPrimeClass {
    public MyPrimeClass(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class Test {
    public static void main(String[] args) {
        PrimeChecker pc = MyPrimeClass::new;

        pc.check(29);
        pc.check(42);
    }
}
