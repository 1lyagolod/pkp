package iComputers.Lab5.utils;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import iComputers.Lab5.entities.UserEntity;
import iComputers.Lab5.services.UserService;

import java.util.List;

@Service
public class InitiateUtils implements CommandLineRunner {

    private final UserService userService;

    public InitiateUtils (UserService userService) {//незабываем конструктор для внедрения
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        UserEntity userEntity1 = new UserEntity();
        userEntity1.setUserName("Golod I.O.");
        userEntity1.setProviderCode(1);

        UserEntity userEntity2 = new UserEntity();
        userEntity2.setUserName("Navoichik I.B.");
        userEntity2.setProviderCode(2);

        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUserName("Shved E.D.");
        userEntity3.setProviderCode(3);

        userService.save(userEntity1);
        userService.save(userEntity2);
        userService.save(userEntity3);

        List<UserEntity> all = userService.getAll();

        for (UserEntity entity : all) {
            System.out.println(entity);
        }
    }
}