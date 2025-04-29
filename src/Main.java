public class Main {
    public static void main(String[] args) {
        Subtraction subtraction = new Subtraction();
        int subAnswer = subtraction.solution(3, 1);
        System.out.println("answer = " + subAnswer);

        Multiply multiply = new Multiply();
        int mulAnswer = multiply.solution(3, 3);
        System.out.println("mulAnswer = " + mulAnswer);

        Division divide = new Division();
        int divAnswer = divide.solution(4, 4);
        System.out.println("divAnswer = " + divAnswer);

        Age age = new Age();
        int birthYear = age.solution(24);
        System.out.println("birthYear = " + birthYear);

        Comparison comparison = new Comparison();
        int comAnswer = comparison.solution(5, 5);
        System.out.println("comAnswer = " + comAnswer);

        Addtion addtion = new Addtion();
        int addAnswer = addtion.solution(7, 3);
        System.out.println("addAnswer = " + addAnswer);

        Division1000 division1000 = new Division1000();
        int div1000Answer = division1000.solution(7, 3);
        System.out.println("div1000Answer = " + div1000Answer);

    }
}