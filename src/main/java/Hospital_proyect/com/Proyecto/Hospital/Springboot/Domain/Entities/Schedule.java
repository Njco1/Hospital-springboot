package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Enums.StateAppointment;
import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Enums.WeekDays;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "Schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name= "week_days", nullable = false)
    WeekDays weekDays;

    @Column(name ="start_time", nullable = false)
    LocalTime startTime;

    @Column(name = "end-time", nullable = false)
    LocalTime endTime;

    @OneToMany
    @JoinColumn(name= "doctor_id", referencedColumnName = "id", nullable = false)
    Doctor doctor;

}
