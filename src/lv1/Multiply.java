package lv1;

public class Multiply {
        public int solution(int num1, int num2) {
            int answer = 0;
            if(num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
                answer = num1 * num2;
            } else {
                System.out.println("0 ≤ num1 ≤ 100\n" +
                        "0 ≤ num2 ≤ 100\n + " +
                        "조건에 맞는 수를 입력해주세요.");
            }
            return answer;
        }
}
