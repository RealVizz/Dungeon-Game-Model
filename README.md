# Project 3 - Dungeon Model

It is a program that simulates a typical scenario in an Cave and Treasure Game.

## Installation

Install JAVA version 11 and JUnit 4 dependencies for the smooth working of the program. 

## List of features
1. The Dungeon is able to be represented on a 2-D grid.
2. There is a path from every cave in the dungeon to every other cave in the dungeon.
3. Each dungeon can be constructed with a degree of interconnectivity. if interconnectivity = 0 then there is exactly one path from every cave in the dungeon to every other cave in the dungeon. Increasing the degree of interconnectivity increases the number of paths between caves.
4. Not all dungeons "Warp" from one side to the other, this can be set during the creation of the Dungeon.
5. One cave is randomly selected as the start and one cave is randomly selected to be the end. The path between the start and the end locations is always at least of length 5 [5 hops].
6. Warping and non-warping dungeons can be created with different degrees of interconnectivity.
7. Supports for at least three types of treasure: diamonds, rubies, and sapphires.
8. Treasures can be added to a specified percentage of caves, the client is able to ask the model to add treasure to 20% of the caves and the model will add a random treasure to at least 20% of the caves in the dungeon.
9. A cave can have more than one treasure.
10. Player always enter the dungeon at the start point.
11. Model can provide a description of the player that, includes a description of what treasure the player has collected, its current location, the treasures available at current location, its possible moves from current location.
12. A Player can move from their current location to some other location.
13. A Player can pick up treasure that is located in their same location.
14. Dungeon is 2d representable.
15. Jar file can create dummy scenarios.


## How to run the JAR file
Running the jar file is easy, run command in shell/bash/cmd  --> "java -jar 'Project 3.jar' " and no other arguments are needed. This will generate a dry run demonstration for the program.


## How to use the program
The program has several functionalities, Significant of all of its functionality is utilized via an object of Dungeon Class. This object internally governs the entire program as for the user, the inbuilt functionalities are already handled via multiple classes mostly which are hidden to the user.
Users can add only 1 player in the dungeon and do operations on it via method calls over the desired object.

## Example
5 dry run demo files is included in the "/res/TestRuns" folder of the directory.
Each of them have there own showcase purpose.
1. File with name "WarpingDungeon.txt" shows a wrapping dungeon.
2. File with name "NonWarpingDungeon.txt" shows a non-wrapping dungeon.
3. File with name "PlayerMovesAllLocations.txt" shows the player visiting every location in the dungeon.
4. File with name "PlayerMovesAllLocationsUntillReachesEnd.txt" shows the player starting at the start and reaching the end.
5. File with name "StartToEndWithPlayerDescription.txt"  shows that the player's location and description at each step.

## Design/Model  changes
There are 2 version of the design, the version 2 is the latest and final version of it.
In the later version, the UML is simplified to un lengthen and reduce the complexity of the program.
The classes are de-segregated and merged in order to achieve this without loosing any practical advantages.


## Assumptions
1. All the values are runtime and random.
2. There is near true randomness.
3. Min path length of 5.

## Limitations
1. As there exist near true randomness, the behavior or program may vary, and it is strongly recommended for it to be used with min number of rows to be 4 and columns to be 8.


## Citations
1. https://www.geeksforgeeks.org/kruskals-minimum-spanning-tree-algorithm-greedy-algo-2/