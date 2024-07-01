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
# Y, X, length
snake = [4,4]
snakelen = 3
# all coordinates of snake
snakebody = [[4,4]]
# Y, X
direction = [1,0]
while True:
    # clear board
    os.system('cls')
    os.system('clear')
    # reset board
    for i in range(10):
        board[i] = [' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ', ' . ']

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

    # print snake to board
    print(snake)
    if (snake[0] > 0 and snake[1] > 0) and (snake[0] < 10 and snake[1] < 10):
        for i in range(len(snakebody)):
            board[snakebody[i][0]][snakebody[i][1]] = " o "
    else:
        break

    # print board
    for line in board:
        for letter in line:
            print(letter, end="")
        print()
    time.sleep(.5)

os.system('cls')
os.system('clear')
print("You lost :(")
