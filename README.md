# About WebFluxDemo

WebFluxDemo is a demo Spring Boot application demonstrating how to create REST APIs using Web-Flux. it also uses spring security to authorize users.

# How to run application Locally

* Update MySQL and MongoDB related Data (i.e. DB URL, username and password) in the application.properties file.
* Add sample data in Database
* Start Spring Boot Application

# Authorized Users
username: user1<br>
Password: P@ss1<br>
Group: MONGO

username: user2<br>
Password: P@ss2<br>
Group: SQL

# About Endpoints
Endpoint: /getitems<br>
Type: GET<br>
Description: Return list of items based on user role, if a user is in the "MONGO" group it fetches data from the Mongo DB database else it fetches data from MySQL Database. 
