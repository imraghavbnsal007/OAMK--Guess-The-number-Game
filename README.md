**Java Programming Course Project**

This repository contains the course project for the Java Programming course (ID00CS46-3002) at Oulu University.

**Project Description**

As part of the course project, students are required to create a simple game that is a Spring Boot application. The game must have at least one player and can be anything simple, such as guess the number or hangman.

**Requirements**

The game application must meet the following requirements:

Must be able to create (at least) one player on the server
Must be able to get player information from the server
Must be able to play the game in turns with the player
Must be able to see finished game information and winner

**System Architecture**
The system architecture for the Spring application is as follows:

Web client (i.e. the Web browser) is shown here only for illustration. No need to create HTML or such files in this course!
Instead of a browser, you can use Thunder (VS Code extension) or Postman or any similar Web client to create and send HTTP requests
Spring Boot requires the application and controller objects on the server
Your game requires a set of objects, i.e. MyApp objects, on the server
File system (i.e. set of files) is needed to store data that is for example player and/or game information (Use of a database is optional if you know what you are doing…)
Example Design
Minimally, the game consists of four objects for which you need to create classes:

Application class is created automatically for a Spring application
Controller class handles different HTTP requests, i.e., runs the game application logic
Game class that runs your game in method play(). May need some additional attributes depending on your game.
Player class that stores player information as its attributes. Needs getters and setters for the attributes. Also saves and loads attributes from a file.
The game is played using HTTP methods and URLs. You need to have at least the following functionality:

HTTP POST /player?name=: to create a new player in the game server, parameter player name
HTTP GET /player: to get player information from the server
HTTP POST /game: to create and play a new game in the server
HTTP PUT /game?move=: to play turns in your game, parameter move (depends on your game)


This is the Guess The number game, Written By Raghav bansal. The Java code is written in Spring Boot Application

Task: To create simple game that is a Spring Boot application. The game has (at least) one player.

It create (at least) one player on the server
It get player information from the server
Players play the game in turns with the player
For the Spring boot Application, These are the commands User should type

**POST mapping : localhost:8090/player?id=1&name=name - to create players 
1 POST mapping : localhost:8090/player?id=1&name=name - to create player 
2 GET Mapping: localhost:8090/player?id=1 - 
Player 1 information GET Mapping: localhost:8090/player?id=2 - 
Player 2 information POST mapping: localhost:8090/game - 
Creating the game and instruction PUT mapping: localhost:8090/game?id=1&move=5 - 
playing game turn by turn PUT mapping: localhost:8090/game?id=2&move=4 - 
player 2 playing his move (If there is a winner and want to check player information) 
GET mapping: localhost:8090/player?id=1 - Check the winner and overall information 
GET mapping: localhost:8090/game?id=1 - check the moves, Player plaeyed DELETE mapping: localhost:8090/player?id=1 - to delete any player**
