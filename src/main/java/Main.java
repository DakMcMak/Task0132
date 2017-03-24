public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int number1, number2, number3, greatNumber;
        number1 = number / 100;
        number2 = number % 10;
        number3 = (number % 100) / 10;
        greatNumber = number1 + number2 + number3;
        return greatNumber;
    }
}
