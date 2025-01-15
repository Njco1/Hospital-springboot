package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "Doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name= "user_id", referencedColumnName = "id", nullable = false)
    User user;

    @Column(name ="specialty", length = 50, nullable = false)
    String specialty;

    @Column(name ="available_schedule", nullable = false)
    List<Schedule> availableSchedule;

    @Column(name = "state", nullable = false)
    Boolean state;
}
