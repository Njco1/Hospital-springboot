package Hospital_proyect.com.Proyecto.Hospital.Springboot.Services.Interfaces;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.Schedule;

import java.util.List;

public interface IScheduleService {

    Schedule create(Schedule schedule);

    Schedule update(Long scheduleId, Schedule updatedSchedule);

    List<Schedule> readAll() throws Exception;

    Schedule getById(Long ScheduleId) throws Exception;

    boolean getDeleteById(Long ScheduleId);
}
