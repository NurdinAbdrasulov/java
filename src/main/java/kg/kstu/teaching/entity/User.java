package kg.kstu.teaching.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "sername")
    String surname;

    @Column(name = "age")
    Integer age;


}
