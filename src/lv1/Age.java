package lv1;

public class Age {
    public int solution(int age) {
        int birthYear = 0;
        int currentYear = 2022;
        if (age > 0 && age <= 120) {
            birthYear = currentYear - age + 1;
        } else {
            System.out.println("0 < age ≤ 120 제한에 맞게 입력해주세요.");
        }
        return birthYear;
    }
}
