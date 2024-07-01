import keyboard, os, time
board = [
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X']
]
# Y, X, length
snake = [4,4]
snakelen = 5
snakebody = [[4,4]]
# Y, X
direction = [1,0]
while True:
    # print board
    for line in board:
        for letter in line:
            print(letter, end="")
        print()

    # user input
    if keyboard.is_pressed('w'):
        direction = [-1,0]
    if keyboard.is_pressed('a'):
        direction = [0,-1]
    if keyboard.is_pressed('s'):
        direction = [1,0]
    if keyboard.is_pressed('d'):
        direction = [0,1]

    snake[0] += direction[0]
    snake[1] += direction[1]
    snakebody.insert(0, snake)
    while len(snakebody) > snakelen:
        snakebody.pop()

    for part in snakebody:
        board[part[0]][part[1]] = "O"

    print(snakebody)
    # clear board
    time.sleep(.5)
    os.system('cls')
    os.system('clear')

    # reset board
    for line in board:
        line = ['X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X']
