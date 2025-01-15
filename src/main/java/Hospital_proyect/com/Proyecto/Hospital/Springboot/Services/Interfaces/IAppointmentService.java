package Hospital_proyect.com.Proyecto.Hospital.Springboot.Services.Interfaces;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.Appointment;

import java.util.List;

public interface IAppointmentService {

    Appointment create(Appointment appointment);

    Appointment update(Long appointmentId, Appointment updatedAppointment);

    List<Appointment> readAll() throws Exception;

    Appointment getById(Long AppointmentId) throws Exception;

    boolean getDeleteById(Long AppointmentId);
}
