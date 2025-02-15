package com.gyupang.trainer.repository;

import com.gyupang.trainer.aggregate.Trainer;
import com.gyupang.trainer.stream.TrainerOutput;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TrainerRepository {
    private final ArrayList<Trainer> trainerList = new ArrayList<>();
    private final File file = new File("src/main/java/com/gyupang/trainer/db/trainerInfo.dat");

    public TrainerRepository() {
        if (!file.exists()){
            // 관리자는 여러 명으로 할지, 1명으로 할지에 대해 선정을 안해, list 생성했음
            ArrayList<Trainer> adminTrainers = new ArrayList<>();
            adminTrainers.add(new Trainer(0, "admin정밍몽규", "jungmingmonggyu", LocalDate.now()));
            saveTrainers(adminTrainers);
        }
        // 파일에 데이터를 자바 list에 넣어, 서비스 개발에 유용하게 하는 작업
        loadtoListTrainers();

        for (Trainer trainer : trainerList) {
            System.out.println(trainer);
        }
    }

    // 이제 포켓몽 처음 실행시에, 파일들에 저장된 것을 list에 저장한다.
    private void loadtoListTrainers() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)
                    )
            );

            while(true) {
                try {
                    Trainer trainer = (Trainer)ois.readObject();
                    trainerList.add(trainer);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void saveTrainers(ArrayList<Trainer> adminTrainers) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)
                    )
            );
            for (Trainer adminTrainer : adminTrainers) {
                oos.writeObject(adminTrainer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public int selectTrainerLastNo() {
        return trainerList.size();
    }

    public int insertTrainer(Trainer insertNewTrainer) {
        TrainerOutput too = null;
        System.out.println(insertNewTrainer);
        int result = 0;
        try {
            too = new TrainerOutput(
                    new BufferedOutputStream(
                            new FileOutputStream(file, true)
                    )
            );
            too.writeObject(insertNewTrainer);
            result = 1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (too != null) too.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }
}
