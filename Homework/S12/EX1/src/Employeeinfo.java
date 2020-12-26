

import java.sql.SQLException;

@FunctionalInterface
public interface Employeeinfo<D> {

    D info(D name, D education,D age ,D email ) throws SQLException, ClassNotFoundException ;

}
