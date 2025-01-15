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
@Table(name = "AppointmentHistory")
public class AppointmentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name= "user_id", referencedColumnName = "id", nullable = false)
    User user;

    @Column(name ="appointments", nullable = false)
    List<Appointment> appointments;

}
