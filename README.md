# dominion-simulator
A simple simulator for the popular card game dominion.

## program structure
The source of this program consists of two main packages: base & game.

*base* contains classes for the different categories of cards that exist in the game. It also contains an abstract class *Cards* from which these inherit:

```
base
  |--- Action  
  |--- Coins  
  |--- Victory        
  |--- Cards
```    

The *game* package contains classes that are required for the execution of the game.
The structure of the package looks as follows:

```
game
  |--- Game: class to simulate an entire game  
  |--- Player: class to setup players  
  |--- Setup: class to initialize the game  (e.g. loading avialable cards)        
  |--- Turn: class to execute one turn for one player
```