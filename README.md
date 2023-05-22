Java Programming Course Project
This repository contains the course project for the Java Programming course (ID00CS46-3002) at Oulu University.

Project Description
As part of the course project, students are required to create a simple game that is a Spring Boot application. The game must have at least one player and can be anything simple, such as guess the number or hangman.

requirements
The game application must meet the following requirements:

Must be able to create (at least) one player on the server
Must be able to get player information from the server
Must be able to play the game in turns with the player
Must be able to see finished game information and winner
System Architecture
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
