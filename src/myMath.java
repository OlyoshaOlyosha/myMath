public class myMath {
    public void addition(int number1, int number2){
        System.out.print(number1 + number2);
    }
    public void substraction(int number1, int number2){
        System.out.print(number1 - number2);
    }

    public void division(int number1, int number2){
        System.out.print(number1 / number2);
    }

    public void multiplication(int number1, int number2){
        System.out.print(number1 * number2);
    }

    public void degree(int number1, int number2) {
        for (int i = 0; i < number2; i++) {
            number1 = number1 * number1;
        }
        System.out.print(number1);
    }
}
