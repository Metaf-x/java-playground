package homework1;

public class Basics {
    public static void main(String[] args) {

        Basics basics = new Basics();

        basics.dividePositiveIntNumbers(42, 8);
        basics.dividePositiveIntNumbers(42, 0);
        basics.dividePositiveIntNumbers(42, 6);

        basics.overflowDoubleExample();
    }

    void dividePositiveIntNumbers(int num1, int num2) {
        if(num1 <= 0 || num2 <= 0) {
            System.out.println("Hi mom!");
        } else if (num1%num2 == 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println(1.0*num1 / num2);
        }
    }

    void overflowDoubleExample() {
        double maxDouble = Double.MAX_VALUE; // 1.7976931348623157E308
        System.out.println("Max double value: " + maxDouble);

        double overflow = maxDouble * 2;
        System.out.println("Overflow value: " + overflow); // This will result in Infinity
    }
}