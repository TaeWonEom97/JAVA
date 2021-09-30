package test;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("등급을 입력하시오. : ");
		String grade = k.next();
//		switch (grade) {
//		case "A":
//		case "a":
//		{
//			System.out.println("우수회원");
//			break;
//		}
//		case "B":
//		case "b":
//		{
//			System.out.println("일반회원");
//			break;
//		}
//		default:
//			System.out.println("손님");
//		}
		if (grade == "A" || grade == "a") {
			System.out.println("우수회원");
		} else if (grade == "B" || grade == "b") {
			System.out.println("일반회원");
		} else {
			System.out.println("손님");
		}
	}

}
