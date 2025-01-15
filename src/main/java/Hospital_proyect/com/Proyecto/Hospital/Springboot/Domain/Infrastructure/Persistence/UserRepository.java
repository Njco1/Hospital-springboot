package Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Infrastructure.Persistence;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
