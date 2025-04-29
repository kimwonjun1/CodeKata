public class Division1000 {
    public int solution(int num1, int num2) {
        double answer = 0;
        if(num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
            answer = (double)num1 / (double)num2;
        } else {
            System.out.println("0 ≤ num1 ≤ 100\n" +
                    "0 ≤ num2 ≤ 100\n + " +
                    "조건에 맞는 수를 입력해주세요.");
        }
        return (int)(answer * 1000);
    }
}
