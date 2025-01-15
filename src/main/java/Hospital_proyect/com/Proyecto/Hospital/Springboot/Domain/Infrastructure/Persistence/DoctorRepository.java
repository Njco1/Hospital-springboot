package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Infrastructure.Persistence;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository <Doctor, Long> {
}
