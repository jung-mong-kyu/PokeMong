package com.gyupang.trainer.aggregate;

public enum TrainerStatus {
    ACTIVE,     // 처음 회원 가입 후 로그인 후 활성화 되는 상태
    DEACTIVE,   // 회원 가입만 하고 로그인을 하지 않았을 때 상태
    DELETE;     // 계정 soft delete 상태
}
