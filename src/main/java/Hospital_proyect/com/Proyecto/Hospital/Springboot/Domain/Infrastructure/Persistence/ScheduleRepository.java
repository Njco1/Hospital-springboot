package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Infrastructure.Persistence;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository <Schedule, Long> {
}
