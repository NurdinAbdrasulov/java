package kg.kstu.teaching.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    String name;// this is a name of user
    String surname;
    Integer age;

}
