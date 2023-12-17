Application de Gestion de Comptes avec CQRS et Event Sourcing
Introduction
Cette application a été développée pour permettre la gestion avancée de comptes en utilisant les modèles de conception CQRS (Command Query Responsibility Segregation) et Event Sourcing. Ces modèles offrent une approche robuste et évolutive pour la gestion des données et des opérations.

Technologies utilisées
AXON Framework: AXON est un framework Java spécialisé dans la mise en œuvre de CQRS et Event Sourcing. Il facilite la séparation des opérations de commande (Command) et de requête (Query) tout en gérant efficacement les événements pour le sourcing.

Spring Boot: Utilisé comme base pour le développement d'applications Java, Spring Boot offre une intégration facile avec AXON Framework et facilite la création de services RESTful.

Configuration du Projet
Clonage du Projet:

bash
Copy code
git clone 
Configuration de la Base de Données:

Assurez-vous d'avoir une base de données configurée dans le fichier application.properties.
Lancement de l'Application:

Utilisez votre IDE préféré pour exécuter l'application 

Copy code
./mvnw spring-boot:run
Fonctionnalités Principales
Création d'un Compte:

Utilisez des commandes pour créer de nouveaux comptes.
Dépôt et Retrait:

Effectuez des dépôts et des retraits sur les comptes existants.
Historique des Transactions:

Consultez l'historique des transactions à l'aide du modèle Event Sourcing.

Contributions
Les contributions sont les bienvenues! Si vous souhaitez contribuer à l'amélioration de cette application, veuillez soumettre une Pull Request.
