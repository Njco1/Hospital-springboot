package Hospital_proyect.com.Proyecto.Hospital.Springboot.Services.Interfaces;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.Patient;

import java.util.List;

public interface IPatientService {

    Patient create(Patient patient);

    Patient update(Long patientId, Patient updatedPatient);

    List<Patient> readAll() throws Exception;

    Patient getById(Long PatientId) throws Exception;

    boolean getDeleteById(Long PatientId);
}
