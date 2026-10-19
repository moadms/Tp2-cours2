package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    // Couplage faible via l'interface IDao
    private IDao dao;

    // Constructeur sans paramètres (requis pour l'injection par setter et par réflexion)
    public MetierImpl() {
    }

    // Constructeur avec paramètres (requis pour l'injection par constructeur)
    @Autowired
    public MetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        if (dao == null) {
            throw new IllegalStateException("L'objet DAO n'est pas initialisé !");
        }
        double data = dao.getData();
        double res = data * 2.5;
        return res;
    }

    // Setter pour l'injection des dépendances (utilisé par Spring XML et tests)
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public IDao getDao() {
        return dao;
    }
}
