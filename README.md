# Tech Used
  * Spring Framework -> Framework for Base Project
  * Hibernate -> Object-relational mapping tool that facilitates the mapping of attributes between a DB and an application's object model.
  * SQL Server DB
  * Azure -> Cloud computing service created to build, test, deploy and manage applications and services.
 # Structure of Project
  * Controllers -> Layer that makes the intermediate between the devices that query and the business logic
  * Managers -> Layer that works as the centralizer and that allows working with more than one DAO, without affecting the logic of the upper layer
  * DAO's -> Layer that contains the repositories and the query to the database
  * Models -> Layer that contains the models on which the application is based
