package iComputers.Lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import iComputers.Lab5.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
