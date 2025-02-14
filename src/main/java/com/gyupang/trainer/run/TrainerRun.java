package com.gyupang.trainer.run;

import java.util.Scanner;

public class TrainerRun {
    public static void run() {
        System.out.println("동작 확인 코드");
    }
    public static void signUp() {
        System.out.println("===== 회원가입 페이지다몽 =====");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("트레이너 이름을 입력해달라몽 : ");
            String userName = sc.nextLine();
            if (userName.length() != 1) {
                System.out.println("트레이너 이름은 한글자만 가능하다몽");
                continue;
            }
            while (true) {  // 비밀번호 제약 조건 추가 로직
                System.out.print("트레이너 비밀번호를 입력해달라몽 : ");
                String pwd = sc.nextLine();
                if (pwd.length() < 6 || pwd.length() > 10) {
                    System.out.println("비밀번호는 6자에서 10자 사이다몽");
                    continue;
                } else {
                    sc.close();
                    return;
                }
            }
        }
    }

    public static void signIn() {
        System.out.println("===== 로그인 페이지다몽 =====");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("트레이너 이름을 입력해달라몽");
            String userName = sc.nextLine();
            System.out.println("비밀번호를 입력해달라몽");
            String pwd = sc.nextLine();
            // todo : 그 다음 로직 처리해야함(백엔드)
            break;
        }
        sc.close();
    }
}
