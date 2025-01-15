package Hospital_proyect.com.Proyecto.Hospital.Springboot.Services.Interfaces;

import Hospital_proyect.com.Proyecto.Hospital.Springboot.Domain.Entities.User;

import java.util.List;

public interface IUserService {

    User create(User user);

    User update(Long userId, User updatedUser);

    List<User> readAll() throws Exception;

    User getById(Long UserId) throws Exception;

    boolean getDeleteById(Long UserId);
}
