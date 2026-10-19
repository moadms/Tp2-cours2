# TP 2 : Inversion de Contrôle (IoC) & Injection de Dépendances avec Spring Framework

Ce projet met en œuvre l'Inversion de Contrôle (IoC) et l'Injection de Dépendances (DI) avec le framework **Spring 6**, dans le cadre du module **Architecture Microservices**.

---

## 🎯 Objectifs Pédagogiques

1. Comprendre l'Inversion de Contrôle (IoC) et la délégation de la gestion du cycle de vie des objets au conteneur Spring (`ApplicationContext`).
2. Maîtriser l'injection de dépendances par **configuration XML** (`applicationContext.xml`).
3. Maîtriser l'injection de dépendances par **Annotations** (`@Component`, `@Autowired`, `@Qualifier`).
4. Écrire des tests unitaires isolés avec **JUnit 5**.

---

## 🏗️ Architecture du Projet

```text
Tp2-cours2/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── dao/
│   │   │   │   ├── IDao.java               # Interface DAO
│   │   │   │   ├── DaoImpl.java            # Implémentation Base de Données (@Component("dao"))
│   │   │   │   └── DaoImpl2.java           # Implémentation Web Service (@Component("dao2"))
│   │   │   ├── metier/
│   │   │   │   ├── IMetier.java            # Interface Métier
│   │   │   │   └── MetierImpl.java         # Implémentation Métier (@Component("metier"))
│   │   │   └── presentation/
│   │   │       ├── PresentationSpringXML.java         # Démarrage via ClassPathXmlApplicationContext
│   │   │       └── PresentationSpringAnnotations.java # Démarrage via AnnotationConfigApplicationContext
│   │   └── resources/
│   │       └── applicationContext.xml      # Configuration XML des Beans Spring
│   └── test/
│       └── java/
│           └── metier/
│               └── MetierImplTest.java     # Tests unitaires JUnit 5
├── pom.xml                                 # Configuration Maven (Spring 6 + JUnit 5)
└── README.md
```

---

## 🚀 Compilation et Exécution

### 1. Compiler le projet et lancer les tests unitaires
```bash
mvn clean test
```

### 2. Exécution via Configuration XML
```bash
mvn compile exec:java -Dexec.mainClass="presentation.PresentationSpringXML"
```

### 3. Exécution via Configuration Annotations
```bash
mvn compile exec:java -Dexec.mainClass="presentation.PresentationSpringAnnotations"
```

---

## 👨‍💻 Auteur
**Moad Moussaoui** • Étudiant Ingénieur • GitHub: [@moadms](https://github.com/moadms)
