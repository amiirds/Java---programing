

import java.sql.SQLException;

@FunctionalInterface
public interface Employeeinfo<T> {

     T info(T name, T education,T age ,T email ) throws SQLException, ClassNotFoundException ;

}
