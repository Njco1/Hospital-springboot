package Hospital_proyect.com.Proyecto.Hospital.Springboot.Services.Interfaces;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.Doctor;

import javax.print.Doc;
import java.util.List;

public interface IDoctorService {

    Doctor create(Doctor doctor);

    Doctor update(Long doctorId, Doctor updatedDoctor);

    List<Doctor> readAll() throws Exception;

    Doctor getById(Long DoctorId) throws Exception;

    boolean getDeleteById(Long DoctorId);
}
