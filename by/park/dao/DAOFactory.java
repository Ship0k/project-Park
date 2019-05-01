package by.park.dao;

import by.park.dao.connect.SQLServer;

/*
 * This class is written using the AbstractFactory pattern.
 * has abstract methods for park entities,
 * as well as getDAOFactory method - to connect to a specific database
 */
public abstract class DAOFactory {
    //There should be a list of DAO types supported by the generator
    public static final int SQLSERVER = 1;

    public abstract OwnerDAO getOwnerDAO();
    public abstract ForesterDAO getForesterDAO();
    public abstract PlantsInfoDAO getPlantInfoDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {
        //so far there is only one type of DAO
        switch (whichFactory) {
            case SQLSERVER:
                return new SQLServer();
            default:
                return null;
        }
    }
}
