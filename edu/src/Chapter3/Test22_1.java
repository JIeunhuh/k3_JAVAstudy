package Chapter3;

import java.util.Scanner;

public class Test22_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner를 이용하여 입력값을 받음

		System.out.println("학점을 입력하세요 : ");
		String grade = sc.next();// string

		switch (grade) {
		case "A":
			System.out.println("90점 이상");
			break;
		case "B":
			System.out.println("80점 이상");
			break;
		case "C":
			System.out.println("70점 이상");
			break;
		case "D":
			System.out.println("60점 이상");
			break;
		default:
			System.out.println("60점 미만");
			break;
		}
	}
}
