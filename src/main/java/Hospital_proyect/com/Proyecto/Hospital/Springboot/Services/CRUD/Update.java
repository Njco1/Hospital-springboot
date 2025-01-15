package Hospital_proyect.com.Proyecto.Hospital.Springboot.Services.CRUD;

public interface Update <ID, Entity>{
    public Entity update(ID id, Entity entity);
}
