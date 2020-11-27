
public class Entity {

    private int melliID;
    private int car_year;
    private String name;
    private String car_name;
    private String car_price;

    public int getMelliID() {
        return melliID;
    }

    public Entity setMelliID(int melliID) {
        this.melliID = melliID;
        return this;
    }

    public int getCar_year() {
        return car_year;
    }

    public Entity setCar_year(int car_year) {
        this.car_year = car_year;
        return this;
    }

    public String getName() {
        return name;
    }

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    public String getCar_name() {
        return car_name;
    }

    public Entity setCar_name(String car_name) {
        this.car_name = car_name;
        return this;
    }

    public String getCar_price() {
        return car_price;
    }

    public Entity setCar_price(String car_price) {
        this.car_price = car_price;
        return this;
    }
}