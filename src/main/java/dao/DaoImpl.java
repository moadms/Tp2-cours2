package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de Données (DaoImpl) : Récupération des données...");
        double temp = 25.0;
        return temp;
    }
}
