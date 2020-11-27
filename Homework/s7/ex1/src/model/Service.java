package model;


import java.util.List;

public class Service {
    private Service() {
    }
    private static Service service = new Service();
    public static Service getInstance() {
        return service;
    }
    public void save(Entity entity) throws Exception {
        try (Repo repository = new Repo()) {
            repository.insert(entity);
            repository.commit();
        }
    }
    public void edit(Entity entity) throws Exception {
        try (Repo repository = new Repo()) {
            repository.update(entity);
            repository.commit();
        }
    }
    public List<Entity> report() throws Exception {
        List<Entity> entities;
        try (Repo repository = new Repo()) {
            entities = repository.view();
        }
        return entities;
    }
}
