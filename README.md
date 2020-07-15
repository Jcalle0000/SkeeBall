# SkeeBallOOP

Description: Collect as many points as possible by having the ball fall into holes in the rings which have
progressively increasing point values.

Must Use:
- While
- for loop
- switch
- Private Static Final = MAX_PLAYS

- Prompt the user to enter the number of files 1<=x<=MAX_PLAYS
- Show error, if this is not the case

- Invoke Methods: play(), showStats()
- (Must be invoked through an instance of your class)

play()
- use a random number generator, simulate a roll of the ball, based on the number generated, assign the paly to specific hall points

Hints:
- Create a separate method to return the hall value

Sample Output:
How Many plays (1-8)? 5
Rolling ball #1. Landed in 80
Rolling ball #2. Landed in 10
Rolling ball #3. Landed in 20
Rolling ball #4. Landed in 20
Rolling ball #5. Landed in 10

+-------+-------+
 Play #   Score
+-------+-------+
    1      80
    2      10
    3      20
    4      20
    5      10
