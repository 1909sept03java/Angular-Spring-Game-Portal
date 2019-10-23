# Angular-p5.js-Hibernate-Game-Portal

![revature logo](https://revature.com/wp-content/uploads/2017/12/revature-logo-600x219.png)


First Revature group assignment
===============================

Mini-Game Portal (project WINNING)
Team: The Boyz
Project Concept: We intend to utilize Angular, Spring, Maven and other learned tools to create a SPA featuring several JavaScript coded mini games. Our site will allow users to login,feature a leaderboard,and allow users to view their own high score while.  We will present a list of games, that the user can play. 

Members
=======
-        Khanh Dang
-        Raymond
-        Ilya
-        Dj
-        George

Initial Burndown chart
======================

![burndown-chart](https://i.ibb.co/7VvrSw9/Untitled.png)

Games
=====
-        Pang
-        Tac Tic
-        Floppy Bird
-        Sanic
-        Dankey Kang
-        Tetris

Front-end 
=========

via Angular 8 Set-Up:
Git clone or download to a new folder.
Use git bash or other cli tool, and cd into Angular-p5.js-Hibernate-Game-Portal/frontend.
npm install and then run ng build.
ng serve or ng serve –open to start the application at localhost:4200.


Back-end
=======
In this project Spring MVC and Hibernate were used. OrmConfiguration.java is used to set up the connection to our database, session factory, hibernate properties, and transaction functionality. The DAO design was used to separate the different layers of the project. The ‘dao’ package is used to make the dao interface and dao implementation to create all CRUD operations using Hibernate. The ‘service’ package is used to abstract the functionality from the dao from the presentation layer.The ‘model’ package is used to store all the object classes used within the project. The ‘controller’ layer is used to implement Spring MVC to map the service layer to HttpRequests. There is console logging functionality using log4j.


Technology Stack
================
Java , AWS
RDS, CI/CD pipeline (EC2, Maven, Jenkins, GitHub, Slack), Hibernate, Spring
MVC, Angular, Bootstrap.
Logging
with Log4J and unit testing with JUnit (Maven can automate this as a build
step).

Our team also utilized Asana to organize task assignments and to prioritze stories. 
 
 
