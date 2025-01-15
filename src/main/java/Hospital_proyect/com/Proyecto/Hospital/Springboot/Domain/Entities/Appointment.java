package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Enums.Role;
import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Enums.StateAppointment;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "Appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name= "date", nullable = false)
    LocalDateTime date;

    @Column(name ="reason", length = 100, nullable = false)
    String reason;

    @Column(name = "state_appointment", nullable = false)
    StateAppointment state_appointment;

    @OneToMany
    @JoinColumn(name= "user_id", referencedColumnName = "id", nullable = false)
    User user;

    @OneToMany
    @JoinColumn(name= "doctor_id", referencedColumnName = "id", nullable = false)
    Doctor doctor;

    @Column(name = "notes", nullable = false)
    String notes;

    @Column(name = "by_for", nullable = false)
    String byFor;

}
