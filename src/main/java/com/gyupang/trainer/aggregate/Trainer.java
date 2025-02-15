package com.gyupang.trainer.aggregate;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Trainer implements Serializable {
    private int id;                          // 트레이너 번호
    private String name;                        // 이름(별명)
    private String pwd;                         // 비밀번호
    private LocalDate accountCreationDate;      // 계정 생성일
    private LocalDate accountDeleationDate;     // 탈퇴 날짜
    private int numberCaptured;                 // 잡은 포켓몬 수

    public Trainer() {
    }

    public Trainer(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
        this.accountCreationDate = LocalDate.now();
        this.numberCaptured = 0;
    }

    // 관리자 계정 생성용 생성자
    public Trainer(int id, String name, String pwd, LocalDate accountCreationDate) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.accountCreationDate = accountCreationDate;
        this.numberCaptured = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public LocalDate getAccountDeleationDate() {
        return accountDeleationDate;
    }

    public void setAccountDeleationDate(LocalDate accountDeleationDate) {
        this.accountDeleationDate = accountDeleationDate;
    }

    public int getNumberCaptured() {
        return numberCaptured;
    }

    public void setNumberCaptured(int numberCaptured) {
        this.numberCaptured = numberCaptured;
    }

    @Override
    public String   toString() {
        return "Trainer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                ", accountDeleationDate=" + accountDeleationDate +
                ", numberCaptured=" + numberCaptured +
                '}';
    }
}
