package kg.kstu.teaching.service;

import kg.kstu.teaching.dto.UserDto;
import kg.kstu.teaching.entity.User;
import kg.kstu.teaching.repository.UserRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

    UserRepo userRepo;
    public void save(UserDto dto){

        User user = new User(
                null,
                dto.getName(),
                dto.getSurname(),
                dto.getAge()
        );

        userRepo.save(user);
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }
}
