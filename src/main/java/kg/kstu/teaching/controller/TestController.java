package kg.kstu.teaching.controller;


import kg.kstu.teaching.dto.UserDto;
import kg.kstu.teaching.entity.User;
import kg.kstu.teaching.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TestController {
    UserService userService;

    @GetMapping
    public List<User> test(){
        List<User> list =  userService.getAll();
        return list;
    }

    @PostMapping
    public String testPost(@RequestBody UserDto dto){

        userService.save(dto);
        return "This is post method";
    }
}
