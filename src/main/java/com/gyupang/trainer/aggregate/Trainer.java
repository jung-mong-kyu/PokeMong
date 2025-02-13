package com.gyupang.trainer.aggregate;

import java.time.LocalDate;

public class Trainer {
    private String id;                          // 트레이너 번호
    private String name;                        // 이름(별명)
    private String pwd;                         // 비밀번호
    private LocalDate accountCreationDate;      // 계정 생성일
    private LocalDate accountDeleationDate;     // 탈퇴 날짜
    private int numberCaptured;                 // 잡은 포켓몬 수
    private int win;                            // 배틀 이긴 횟수
    private int lose;                           // 배틀 진 횟수
    private String totalBattles;                // 배틀 총 전적

}
