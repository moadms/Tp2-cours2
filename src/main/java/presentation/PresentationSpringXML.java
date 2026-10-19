package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args) {
        System.out.println("=== Inversion de Contrôle avec Spring Framework (Configuration XML) ===");
        
        // 1. Démarrage du conteneur IoC Spring à partir du fichier applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Récupération du bean métier (Spring a automatiquement injecté le bean dao)
        IMetier metier = (IMetier) context.getBean("metier");

        // 3. Exécution du traitement métier
        double resultat = metier.calcul();
        System.out.println("Résultat du calcul Métier (via XML) : " + resultat);
    }
}
