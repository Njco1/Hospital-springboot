package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name= "username", length = 50, nullable = false)
    String username;

    @Column(name ="password", length = 50, nullable = false)
    String password;

    @Column(name = "role", nullable = false)
    Role role;

    @Column(name = "name", length = 50, nullable = false)
    String name;

    @Column(name= "email", length = 50, nullable = false)
    String email;

    @Column(name = "phone", length = 50, nullable = false)
    String phone;

    @Column(name = "state", nullable = false)
    Boolean state;

}
