package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "Patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name= "user_id", referencedColumnName = "id", nullable = false)
    User user;

    @Column(name ="medical_history", nullable = false)
    String medicalHistory;

    @Column(name = "register_date", nullable = false)
    LocalDate register_date;
}
