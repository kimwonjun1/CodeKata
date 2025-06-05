package lv1;

public class EvenOdd {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) {
            answer = "Even";
        } else if ((num % 2) != 0) {
            answer = "Odd";
        } else {
            System.out.println("정수를 입력해주세요.");
        }
        return answer;
    }
}
