package Hospital_proyect.com.Proyecto.Hospital.Springboot.Services.Interfaces;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.AppointmentHistory;

import java.util.List;

public interface IAppointmentHistoryService {
    AppointmentHistory create(AppointmentHistory appointmentHistory);

    AppointmentHistory update(Long AppointmentHistoryId, AppointmentHistory updatedAppointmentHistory);

    List<AppointmentHistory> readAll() throws Exception;

    AppointmentHistory getById(Long AppointmentHistoryId) throws Exception;

    boolean getDeleteById(Long AppointmentHistoryId);
}
