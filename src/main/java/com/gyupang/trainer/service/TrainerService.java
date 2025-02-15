package com.gyupang.trainer.service;

import com.gyupang.trainer.aggregate.Trainer;
import com.gyupang.trainer.repository.TrainerRepository;

public class TrainerService {
    private final static TrainerRepository tr = new TrainerRepository();
    public void registerTrainer(Trainer registTrainer) {
        int trainerNo = tr.selectTrainerLastNo();
        registTrainer.setId(trainerNo);
        int result = tr.insertTrainer(registTrainer);
        if (result == 1){
            System.out.println("회원 가입에 성공했다몽! 트레이너가 된 걸 환영한다몽!");
        } else {
            System.out.println("현재 회원가입이 안된다몽 ㅠㅠ 금방 해결하겠다몽");
        }
    }
}
