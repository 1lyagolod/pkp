package iComputers.Lab5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import iComputers.Lab5.repositories.UserRepository;
import iComputers.Lab5.entities.UserEntity;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<UserEntity> getById(Integer id) {
        return userRepository.findById(id);
    }

    public void delById(Integer id) {
        userRepository.deleteById(id);
    }

    public Boolean exist(Example<? extends UserEntity> example) {
        return userRepository.exists(example);
    }

    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public List<UserEntity> getAll() {

        return userRepository.findAll();
    }

    public void saveAll(List<UserEntity> users) {
        userRepository.saveAll(users);
    }

    public ResponseEntity<?>getUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
