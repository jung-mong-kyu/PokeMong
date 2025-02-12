package com.gyupang;


import com.gyupang.member.run.MemberRun;
import com.gyupang.pokemon.run.PokeMonRun;

public class Application {
    public static void main(String[] args) {
        /* 설명. 코드 동작은 여기서 run에 있는 클래스 불러와서 동작 시키게 할 것 */
        MemberRun.run();
        PokeMonRun.run();
    }
}
