package by;

import by.park.dao.DAOFactory;
import by.park.dao.ForesterDAO;
import by.park.dao.OwnerDAO;
import by.park.dao.PlantsInfoDAO;
import by.park.entity.object.Plant;

/*
 * Main class for to check the functionality
 *
 * @author     Anatoli Shipkou
 */
public class MainProgram {
    public static void main(String[] args) {
        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.SQLSERVER);
        OwnerDAO ownerDAO = factory.getOwnerDAO();
        ForesterDAO foresterDAO = factory.getForesterDAO();
        PlantsInfoDAO plantsInfoDAO = factory.getPlantInfoDAO();
        Plant plant;

        //ownerDAO.insertPlant("Ольха");
        //plant = ownerDAO.findPlant(73);
        //ownerDAO.taskLanding(plant);
        //foresterDAO.viewTask();
        //foresterDAO.performTask(7);

        ownerDAO.confirmReport(5);
        ownerDAO.viewForesterReport();
        foresterDAO.viewTask();
        plantsInfoDAO.quantityPlantsByName("Ольха");




    }
}
