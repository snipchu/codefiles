from time import sleep

def bugs():
    bugs = 0
    while bugs!=8:
        print('bugs:', bugs)
        bugs = bugs+1
        sleep(1)
    if bugs==8:
        print('8 bugs total:D')
        bugs=bugs-1
        sleep(3)
    if bugs ==7:
            print('NOOO a bug died')
            sleep(1)
            bugs=8
            print("jk")
            sleep(2)
            print('ok time to get more bug')
            sleep(1)
    while True:
        print('bugs:', bugs)
        bugs = bugs+1
        sleep(1)

print("waiting time")
sleep(2)
bugs()