package lv1;

public class Comparison {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 >= 0 && num1 <= 10000 && num2 >= 0 && num2 <= 10000) {
            if (num1 == num2) {
                return 1;
            } else {
                return -1;
            }
        } else {
            System.out.println("0 ≤ num1 ≤ 10,000\n" +
                    "0 ≤ num2 ≤ 10,000\n 제한사항에 맞게 입력해주세요.");
        }
        return answer;
    }
}
