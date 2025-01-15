package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Infrastructure.Persistence;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, Long> {
}
