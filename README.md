📘 Playwright Automation Framework (QA / CI-CD Ready)
🚀 Présentation

Ce projet est un framework d’automatisation de tests UI basé sur Playwright + Java + Cucumber, conçu pour les environnements modernes de Quality Assurance et DevOps.

Il permet d’automatiser les tests fonctionnels web tout en s’intégrant dans une chaîne CI/CD (Jenkins / GitHub Actions).

🎯 Objectifs du projet
Automatiser les tests UI end-to-end
Simuler les parcours utilisateurs réels
Garantir la qualité applicative avant production
Réduire les régressions fonctionnelles
Exécuter les tests sur plusieurs environnements (QA / DEV / PROD)
Intégration complète dans CI/CD
🧰 Stack technologique
🔹 Automatisation UI
Playwright (Java)
🔹 Framework de test
Cucumber (BDD)
🔹 Langage
Java
🔹 Build Tool
Maven
🔹 CI/CD
Jenkins
GitHub Actions
🔹 Versioning
Git / GitHub
🏗 Architecture du framework

Le projet suit une architecture professionnelle :

Pages (Page Object Model)
Gestion des éléments UI et actions utilisateur
Step Definitions
Implémentation des scénarios Gherkin
Hooks
Setup / Teardown des tests
Features
Scénarios métier en langage Gherkin
Utils
Configuration, Data handling, Excel reader
🌍 Gestion des environnements

Le framework supporte plusieurs environnements :

QA
DEV
PROD

L’environnement est passé dynamiquement via Jenkins :

mvn test -Denv=qa

Chaque environnement possède son fichier de configuration :

src/test/resources/config/
 ├── qa.properties
 ├── dev.properties
 └── prod.properties
⚙️ Exécution des tests
▶️ Exécution locale
mvn clean test
▶️ Exécution avec environnement
mvn test -Denv=qa
🧪 Types de tests
Smoke Tests
Regression Tests
End-to-End Tests
Tests fonctionnels automatisés
📊 Reporting

Le framework supporte plusieurs types de rapports :

📄 Cucumber Reports
Rapport JSON
Rapport HTML
📊 Allure Reports (optionnel)
Dashboard interactif
Historique des exécutions
Analyse des erreurs
📁 Artifacts CI
Logs d’exécution
Screenshots (si activé)
Rapports HTML
🔄 CI/CD Integration
🔧 Jenkins Pipeline
Checkout du code
Build Maven
Installation Playwright
Exécution des tests
Génération des rapports
Archivage des résultats
☁️ GitHub Actions
Exécution automatique sur push
Validation des Pull Requests
Génération de rapports de tests
🧪 Playwright Configuration
Mode headless configurable
Support multi-browser (Chromium / Firefox / WebKit)
SlowMo activable pour debug UI
📂 Structure du projet
src
 ├── main
 └── test
      ├── java
      │    ├── pages
      │    ├── steps
      │    ├── hooks
      │    └── utils
      └── resources
           ├── features
           ├── config
           └── testdata
📊 Gestion des données (Data Driven)

Le framework supporte la lecture de données externes :

Excel (Apache POI)
JSON (optionnel)
Data Tables Cucumber
🧠 Bonnes pratiques appliquées
Page Object Model (POM)
Séparation des responsabilités
Code réutilisable et maintenable
Tests indépendants
Exécution parallèle possible
Configuration externalisée
Compatible CI/CD
📌 Prérequis
Java 17+
Maven 3+
Node.js (Playwright dependencies)
Jenkins (optionnel)
👤 Auteur

TRAORE

Automation Engineer | QA | SDET
Framework conçu pour environnements modernes DevOps & CI/CD

📈 Niveau du projet

✔ Niveau : Intermédiaire → Avancé
✔ Architecture : Enterprise Ready
✔ CI/CD : opérationnel
✔ Maintenabilité : élevée
✔ Scalabilité : supportée

🚀 Conclusion

Ce framework démontre une maîtrise des outils modernes de test automation et une intégration complète dans un environnement CI/CD professionnel.
