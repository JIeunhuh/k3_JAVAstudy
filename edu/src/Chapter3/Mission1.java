package Chapter3;

import java.util.Scanner;

public class Mission1 {
//	public static void main(String[] args) {
//		// 국영수 세과목의 점수 입력 받은 뒤 평균 구해서 70점 이상일때 통과, 60점 미만이면 과락으로 통과하지 못함
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("국어 점수를 입력하세요 : ");
//		int kor = sc.nextInt();
//		System.out.println("영어 점수를 입력하세요 : ");
//		int eng = sc.nextInt();
//		System.out.println("수학 점수를 입력하세요 : ");
//		int math = sc.nextInt();
//
//		int avg = (math + eng + kor) / 3;
//		System.out.println("평균 점수 : " + avg);
//
//		if (kor < 60 || eng < 60 || math < 60) {
//			System.out.println("당신은 탈락입니다.");
//		} else if (avg >= 70) {
//			System.out.println("당신은 통과하셨습니다. 축하합니다!");
//		} else {
//			System.out.println("당신은 탈락입니다.");
//		}
//		sc.close();
//
//	}
	public static void main(String[] args) {
		// 국영수 세과목의 점수 입력 받은 뒤 평균 구해서 70점 이상일때 통과, 60점 미만이면 과락으로 통과하지 못함(while문 사용해서 루프문 만들기)
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("국어 점수를 입력하세요 : ");
			int kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요 : ");
			int eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요 : ");
			int math = sc.nextInt();

			int avg = (math + eng + kor) / 3;
			System.out.println("평균 점수 : " + avg);

			if (kor < 0 || kor >= 100 || eng < 0 || eng >= 100 || math < 0 || math >= 100) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (kor < 60 || eng < 60 || math < 60) {
				System.out.println("당신은 탈락입니다.");
			} else if (avg >= 70) {
				System.out.println("당신은 통과하셨습니다. 축하합니다!");
			} else {
				System.out.println("당신은 탈락입니다.");
			}
			sc.close();

		}
	}
//	//구구단
//	public static void main(String[] args) {
//		for(int i=1; i<10;i++) {
//			for(int j=1; j<10;j++) {
//				System.out.println(i+"*"+j + "=" + (i*j));
//	
//			}
//		}
	}
	

