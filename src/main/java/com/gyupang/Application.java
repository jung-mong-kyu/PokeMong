package com.gyupang;


import com.gyupang.trainer.run.TrainerRun;
import com.gyupang.pokemon.run.PokeMonRun;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 설명. 코드 동작은 여기서 run에 있는 클래스 불러와서 동작 시키게 할 것 */
        /* 설명. 여기 상태 값*/
        System.out.println("===== <하트> 포케몽에 오신 걸 환영합니다 <하트> =====");
        while (true) {
            System.out.println("1번 : 회원가입");
            System.out.println("2번 : 로그인");
            System.out.println("9번 : 포케몽 종료");
            System.out.println("===== 이용하시려는 기능 번호를 눌러주세요! =====");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    TrainerRun.signUp();
                    break;
                case 2:
                    TrainerRun.signIn();
                    break;
                case 3: break;
                case 4: break;
                case 9:
                    System.out.println("밍 ㅠㅠ 진짜 끌꺼야 ?");
                    System.out.println("아맏따레포트 맞다면 1을 눌러줘");
                    while (true) {
                        int quitNum = sc.nextInt();
                        if (quitNum == 1) {
                            return;
                        } else if (quitNum == 2) {
                            break;
                        } else {
                            System.out.println("번호가 잘못됐몽, 다시 골라라몽");
                            continue;
                        }
                    }
                    break;
                default:
                    System.out.println("번호가 잘못됐몽, 다시 골라라몽");
            }

        }
    }
}
