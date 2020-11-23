package Model.service;
import Model.Entity.Entity;
import Model.Repository.Repository;

import java.util.List;

public class Service {
    private Service() {}
    private static Service service = new Service();
    public static Service getInstance() {
        return service;
    }
    public void save (Entity entity) throws Exception {
        try (Repository repository = new Repository()) {
            repository.insert(entity);
            repository.commit();
        }
    }
    public List<Entity> report() throws Exception {
        List<Entity> entities;
        try (Repository repository = new Repository()) {
            entities = repository.select();
        }
        return entities;
    }
    public void user(Entity entity) throws Exception {
        try (Repository repository = new Repository()) {
            repository.users(entity);
            repository.commit();
        }
    }
}