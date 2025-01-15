package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Infrastructure.Persistence;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.AppointmentHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentHistoryRepository extends JpaRepository <AppointmentHistory, Long> {
}
