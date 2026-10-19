package dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service / Capteurs (DaoImpl2) : Récupération des données distantes...");
        double temp = 35.0;
        return temp;
    }
}
