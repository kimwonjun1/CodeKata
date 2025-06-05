package lv1;

public class Subtraction {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000) {
            answer = num1 - num2;
        } else {
            System.out.println("-50000 ≤ num1 ≤ 50000\n" +
                    "-50000 ≤ num2 ≤ 50000\n + " +
                    "조건에 맞는 수를 입력해주세요.");
        }
        return answer;
    }
}
