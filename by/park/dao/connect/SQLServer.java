package by.park.dao.connect;

import by.park.dao.DAOFactory;
import by.park.dao.ForesterDAO;
import by.park.dao.OwnerDAO;
import by.park.dao.PlantsInfoDAO;
import by.park.dao.service.SQLServerForester;
import by.park.dao.service.SQLServerOwner;
import by.park.dao.service.SQLServerPlantsInfo;
import static by.park.resources.ConfigurationManager.getProperty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * The class that stores data on the connection to the SQLServer database
 * has a return connection method to this database, and also implements inherited methods
 * abstract class which return objects of the DAO-layers for park essentials
 */
public class SQLServer extends DAOFactory {
    private static final String DRIVER = getProperty("DRIVER");
    private static final String URL = getProperty("URL");
    private static final String USERNAME = getProperty("USERNAME");
    private static final String PASSWORD = getProperty("PASSWORD");

    public static Connection createConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public OwnerDAO getOwnerDAO() {
        return new SQLServerOwner();
    }

    @Override
    public ForesterDAO getForesterDAO() {
        return new SQLServerForester();
    }

    @Override
    public PlantsInfoDAO getPlantInfoDAO() {
        return new SQLServerPlantsInfo();
    }
}
