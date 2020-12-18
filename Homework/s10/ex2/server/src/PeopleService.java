import java.rmi.Remote;

public interface PeopleService extends Remote {
    void save (Entity entity)throws Exception;
}
