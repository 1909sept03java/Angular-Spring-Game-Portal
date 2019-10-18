# Angular-p5.js-Hibernate-Game-Portal
First Revature group assignment
![revature logo](https://revature.com/wp-content/uploads/2017/12/revature-logo-600x219.png)
Mini-Game Portal (project WINNING)
Team: The Boyz
Project Concept: We intend to utilize Hibernate, Angular, Maven and other learned tools to create a SPA featuring several JavaScript coded mini games. Our site will have a login feature and users will be able to view a leaderboard and their own high score while logging in.  We will present a list of games, at most 2 players, that the user can play. admin users will have full control of the leader boards and can update user’s information/credentials. 
Members:
-        Khanh Dang
-        Ray
-        Ill
-        Dj
-        George
Front End via Angular 8 Set-Up:
Git clone or download to a new folder.
Use git bash or other cli tool, and cd into Angular-p5.js-Hibernate-Game-Portal/frontend.
npm install and then run ng build.
ng serve or ng serve –open to start the application at localhost:4200.
·        Download and Allow CORS: extension for Chrome(optional depending on how sensitive your browser is).
Games:
-        Pang
-        Tac Tic
-        Floppy Bird
-        Sanic
-        Dankey Kang
-        Tetris
Backend – 
In this project Spring MVC and Hibernate were used. OrmConfiguration.java is used to set up the connection to our database, session factory, hibernate properties, and transaction functionality. The DAO design was used to separate the different layers of the project. The ‘dao’ package is used to make the dao interface and dao implementation to create all CRUD operations using Hibernate. The ‘service’ package is used to abstract the functionality from the dao from the presentation layer.The ‘model’ package is used to store all the object classes used within the project. The ‘controller’ layer is used to implement Spring MVC to map the service layer to HttpRequests. There is console logging functionality using log4j.
Version Control: DJ 😊
ASANA: DJ😊
Technology Stack:
Java , AWS
RDS, CI/CD pipeline (EC2, Maven, Jenkins, GitHub, Slack), Hibernate, Spring
MVC, Angular, Bootstrap.
Logging
with Log4J and unit testing with JUnit (Maven can automate this as a build
step).
(H2 is a
good mocking framework for your database) 
 
 
