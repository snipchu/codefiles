# 7/1/2024
# made for Hack Club's Arcade
# It's just a simple scuffed snake game
# WASD to move

import keyboard, os, time, random
board = [[' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . '],
        [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ']]
# Y,X coordinates
snake = [5,2]
apple = [5,7]
# Y,X coordinates, 1 = down/right, -1 = up/left
direction = [0,1]
# all coordinates of snake
snakebody = [[5,2]]
snakelen = 3

while True:
    # user input
    if keyboard.is_pressed('w') and direction != [1,0]:
        direction = [-1,0]
    if keyboard.is_pressed('a') and direction != [0,1]:
        direction = [0,-1]
    if keyboard.is_pressed('s') and direction != [-1,0]:
        direction = [1,0]
    if keyboard.is_pressed('d') and direction != [0,-1]:
        direction = [0,1]

    # update snakebody
    snake[0] += direction[0]
    snake[1] += direction[1]
    snakebody.insert(0, [snake[0],snake[1]])
    while len(snakebody) > snakelen:
        snakebody.pop()

    # apple code
    board[apple[0]][apple[1]] = " @ "
    if snake == apple:
        snakelen += 1
        apple = [random.randint(0,9),random.randint(0,9)]

    # print snake to board
    if (snake[0] >= 0 and snake[1] >= 0) and (snake[0] < 10 and snake[1] < 10):
        for i in range(len(snakebody)):
            board[snakebody[i][0]][snakebody[i][1]] = " # "
    else:
        break

    # print board
    for line in board:
        for letter in line:
            print(letter, end="")
        print()
    print(f"\tScore: {snakelen-3}")
    
    # clear board
    time.sleep(.15)
    os.system('cls')
    os.system('clear')
    
    # reset board
    for i in range(10):
        board[i] = [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ']


print(f"\tScore: {snakelen-3}")
