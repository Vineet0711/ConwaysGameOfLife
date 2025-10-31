# Conway's Game of life- BAckend Implementation
It is referenced from “Conway’s game of life”. It is a zero-player game meaning that its evolution is determined by its initial state. 
In “Conway’s game of life”, every generation of population  is generated as output but here only n(user given input)th generation will 
be printed as output.

# Rules of the Game
1.Any live cell with fewer than two live neighbours dies, as if by underpopulation.
2.Any live cell with two or three live neighbours lives on to the next generation.
3.Any live cell with more than three live neighbours dies, as if by overpopulation.
4.Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

# Features
-> Pure backend implementation.
-> Console Input and output in the form of 1 & 0.
-> 1 represents alive cell and 0 represents dead cell.
-> Configure nth generation board on the basis of rules.
-> Print the nth generation of board in the console.

# How to run
1. If you are using terminal or command Prompt:
# 1.Clone the Repository:
   git clone https://github.com/Vineet0711/ConwaysGameOfLife.git
# 2.Move into the folder:
   cd ConwaysGameOfLife
# 3.Compile the java files:
Run these commands one by one:
   1. mkdir bin
   2. javac -d bin src/*.java
# 4.Run the Program:
  java -cp bin Main

2. If you are using any IDE like IntelliJ, Eclipse or STS:
  Import the project as Java project and click run.
