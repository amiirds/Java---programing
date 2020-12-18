import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImp extends UnicastRemoteObject implements PeopleService {

    public ServiceImp()throws Exception{}

    @Override
    public void save(Entity entity) throws Exception {
        Repository repository =new Repository();
        repository.insert(entity);
        repository.close();
    }
}
