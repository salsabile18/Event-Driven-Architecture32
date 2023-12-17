# Application de Gestion de Comptes avec CQRS et Event Sourcing

## Introduction

Cette application a été développée pour permettre la gestion avancée de comptes en utilisant les modèles de conception CQRS (Command Query Responsibility Segregation) et Event Sourcing avec les Framework AXON et Spring Boot. Ces modèles offrent une approche robuste et évolutive pour la gestion des données et des opérations.

## Technologies utilisées

- **AXON Framework**: AXON est un framework Java spécialisé dans la mise en œuvre de CQRS et Event Sourcing. Il facilite la séparation des opérations de commande (Command) et de requête (Query) tout en gérant efficacement les événements pour le sourcing.
  
- **Spring Boot**: Utilisé comme base pour le développement d'applications Java, Spring Boot offre une intégration facile avec AXON Framework et facilite la création de services RESTful.

## Configuration du Projet

1. **Clonage du Projet**:
   ```
   git clone https://

2. **Configuration de la Base de Données**:
   - Assurez-vous d'avoir une base de données configurée dans le fichier `application.properties`.

3. **Lancement de l'Application**:
   - Utilisez votre IDE préféré pour exécuter l'application 
     ./mvnw spring-boot:run
     

## Fonctionnalités Principales

1. **Création d'un Compte**:
   - Utilisez des commandes pour créer de nouveaux comptes.

2. **Dépôt et Retrait**:
   - Effectuez des dépôts et des retraits sur les comptes existants.

3. **Historique des Transactions**:
   - Consultez l'historique des transactions à l'aide du modèle Event Sourcing.

4. **Requêtes sur les Comptes**:
   - Obtenez des informations sur les comptes en utilisant des requêtes spécifiques.



## Testing in localhost and postman 
![image](https://github.com/salsabile18/Event-Driven-Architecture32/assets/100244944/dd8d256d-0aa6-49e0-b490-d52a40d4630d)
![image](https://github.com/salsabile18/Event-Driven-Architecture32/assets/100244944/bfed79d9-e836-4ef8-99db-ac5b818cf93b)
![image](https://github.com/salsabile18/Event-Driven-Architecture32/assets/100244944/bbe8d02e-74f4-4c3f-a73c-2fcad1ba8002)
![image](https://github.com/salsabile18/Event-Driven-Architecture32/assets/100244944/2889aabf-4531-4937-8da4-7aca5bd258fa)
![image](https://github.com/salsabile18/Event-Driven-Architecture32/assets/100244944/e7b1267a-acb0-4579-b673-9e1595343714)



## Contributions

Les contributions sont les bienvenues! Si vous souhaitez contribuer à l'amélioration de cette application, veuillez soumettre une Pull Request.

## Licence

Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.
