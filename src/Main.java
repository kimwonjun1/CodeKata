public class Main {
    public static void main(String[] args) {
        Subtraction subtraction = new Subtraction();
        int subAnswer = subtraction.solution(3, 1);
        System.out.println("answer = " + subAnswer);

        Multiply multiply = new Multiply();
        int mulAnswer = multiply.solution(3, 3);
        System.out.println("mulAnswer = " + mulAnswer);

        Divide divide = new Divide();
        int divAnswer = divide.solution(4, 4);
        System.out.println("divAnswer = " + divAnswer);
    }
}