package Chapter3;

import java.util.Scanner;

public class Test20_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("성적을 입력하세요 : ");
		int score = sc.nextInt(); // scanf
		char grade;

		if (score < 0 || score > 100) { // or 연산자 사용
			System.out.println("부적절한 점수입니다");
			return;
			// return : 값을 반환 & break와의 차이 -> 하나의 반복문 탈출 , return -> 반복문을 포함한 메서드 자체를 종료
		}

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println(grade);
	}
}
