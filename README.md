📘 Playwright Automation Framework (QA / CI-CD Ready)
🚀 Présentation

Ce projet est un framework d’automatisation de tests UI basé sur Playwright + Java + Cucumber, conçu pour les environnements modernes de Quality Assurance et DevOps.

Il permet d’automatiser les tests fonctionnels web et de l’intégrer dans une chaîne CI/CD (Jenkins / GitHub Actions).

🎯 Objectifs du projet
Automatiser les tests UI end-to-end
Simuler les parcours utilisateurs réels
Détecter les anomalies avant production
Réduire les régressions applicatives
Support multi-environnements (QA / DEV / PROD)
Intégration complète CI/CD
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
📁 Pages (Page Object Model)

Gestion des éléments UI et des actions utilisateur

🧪 Step Definitions

Implémentation des scénarios Gherkin

🔧 Hooks

Gestion du cycle de vie des tests (Before / After)

📜 Features

Scénarios métier écrits en Gherkin

⚙️ Utils

Configuration, lecture Excel, helpers

🌍 Gestion des environnements

Le framework supporte plusieurs environnements :

QA
DEV
PROD
🔁 Exécution avec environnement
mvn test -Denv=qa
📂 Fichiers de configuration
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
📄 Cucumber Reports
Rapport JSON
Rapport HTML
📊 Allure Reports (optionnel)
Dashboard interactif
Historique des tests
Analyse des échecs
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
Archivage des artifacts
☁️ GitHub Actions
Exécution automatique sur push
Validation des Pull Requests
Génération des rapports
🧪 Playwright Configuration
Mode headless configurable
Support multi-browser (Chromium / Firefox / WebKit)
SlowMo pour debug UI
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
📊 Data Driven Testing
Excel (Apache POI)
Data Tables Cucumber
JSON (optionnel)
🧠 Bonnes pratiques
Page Object Model (POM)
Séparation des responsabilités
Code réutilisable
Tests indépendants
Configuration externalisée
Compatible CI/CD
📌 Prérequis
Java 17+
Maven 3+
Jenkins (optionnel)
👤 Auteur

TRAORE

QA Automation Engineer / SDET
Spécialiste CI/CD & Test Automation

📈 Niveau du projet
Intermédiaire → Avancé
Architecture enterprise-ready
CI/CD opérationnel
Projet scalable
🚀 Conclusion

Ce framework démontre une maîtrise des outils modernes de test automation, ainsi qu’une intégration complète dans un environnement DevOps professionnel.
