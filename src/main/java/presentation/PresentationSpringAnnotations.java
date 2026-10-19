package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotations {
    public static void main(String[] args) {
        System.out.println("=== Inversion de Contrôle avec Spring Framework (Configuration Annotations) ===");

        // 1. Démarrage du conteneur IoC Spring avec scan automatique des packages dao et metier
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");

        // 2. Récupération du bean métier (Spring a scanné @Component et injecté @Autowired)
        IMetier metier = context.getBean(IMetier.class);

        // 3. Exécution du traitement métier
        double resultat = metier.calcul();
        System.out.println("Résultat du calcul Métier (via Annotations) : " + resultat);
    }
}
