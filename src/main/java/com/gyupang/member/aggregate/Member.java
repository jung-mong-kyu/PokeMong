package com.gyupang.member.aggregate;

import java.time.LocalDate;

public class Member {
    private String name;                                // 이름(별명)
    private String id;                                  // 아이디
    private String pwd;                                 // 비밀번호
    private LocalDate Account_creation_date;       // 계정 생성일
    private LocalDate Account_deletion_date;       // 탈퇴 날짜
    private int Number_captured;                        // 잡은 포켓몬 수

}
