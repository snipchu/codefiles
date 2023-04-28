# Tuyet Do
# 10B


def setup():
    size(800,600)
    noStroke()
    background(164, 207, 229)

def layer1(xcoord,ycoord):
    # layer 1 - grass
    fill(219, 229, 184)
    rect(-50+xcoord,550+ycoord,900,100)
    
def layer2(xcoord,ycoord):
    # layer 2 - cities
    fill(165, 161, 161)
    
    # section 1 of city
    rect(0+xcoord,500+ycoord,40,200)
    rect(40+xcoord,490+ycoord,20,110)
    rect(60+xcoord,470+ycoord,40,130)
    rect(100+xcoord,430+ycoord,60,170)
    rect(110+xcoord,420+ycoord,40,10)
    rect(160+xcoord,450+ycoord,30,150)
    rect(190+xcoord,440+ycoord,30,160)
    rect(220+xcoord,430+ycoord,30,170)
    
    # section 2 of city
    rect(270+xcoord,350+ycoord,50,250)
    triangle(270+xcoord,350+ycoord,320+xcoord,350+ycoord,295+xcoord,320+ycoord)
    rect(320+xcoord,470+ycoord,30,130)
    rect(350+xcoord,410+ycoord,40,190)
    rect(390+xcoord,530+ycoord,20,70)
    rect(410+xcoord,330+ycoord,70,270)
    rect(420+xcoord,320+ycoord,50,10)
    rect(430+xcoord,310+ycoord,30,10)
    rect(435+xcoord,290+ycoord,20,20)
    
    # section 3 of city
    rect(520+xcoord,250+ycoord,50,350)
    rect(530+xcoord,240+ycoord,30,10)
    rect(560+xcoord,430+ycoord,150,170)
    quad(710+xcoord,530+ycoord,740+xcoord,540+ycoord,740+xcoord,600+ycoord,710+xcoord,600+ycoord)
    rect(740+xcoord,350+ycoord,50,250)
    rect(790+xcoord,500+ycoord,10,100)

def layer3(xcoord,ycoord):
    # layer 3 - hill 1
    fill(186, 210, 172)
    quad(-20+xcoord,350+ycoord,-20+xcoord,600+ycoord,800+xcoord,600+ycoord,800+xcoord,400+ycoord)
    
def layer4(xcoord,ycoord):
    # layer 4 - hill 2
    fill(160, 186, 160)
    quad(-50+xcoord,300+ycoord,-20+xcoord,600+ycoord,800+xcoord,600+ycoord,800+xcoord,200+ycoord)

def layer5(xcoord,ycoord):
    # layer 5 - sky
    
    # cloud 1
    arc(700+xcoord,130+ycoord,150,100,PI,2*PI)
    arc(600+xcoord,130+ycoord,100,50,PI,2*PI)
    
    # cloud 2
    arc(100+xcoord,220+ycoord,150,100,PI,2*PI)
    arc(200+xcoord,220+ycoord,100,50,PI,2*PI)
    
def layer6(xcoord,ycoord):
    # layer 6 - sun
    fill(182,208,212)
    circle(100+xcoord,80+ycoord,250)
    fill(201,208,192)
    circle(100+xcoord,80+ycoord,150)
    fill(244, 209, 149)
    circle(100+xcoord,80+ycoord,100)
    fill(249, 244, 241)
    
def draw():
    # How the parallax works:
    # mouseX and mouseY are added to the original location of the shapes
    # dividing the values makes the effect more subtle
    # (ex mouseX/5 is greater than mouseX/20)
    # the farther away from the camera the larger the value gets
    # the shapes will then follow the cursor
    # putting it backwards makes the shapes 'push away' from the cursor
    # ex rect(-50+coord,....) -50 is the original location and we add the xcoord value to it depend on its distance
    
    # fill with background color for "reset" instead of smearing
    fill(164, 207, 229)
    rect(0,0,800,600)
    
    # all the layers go backwards order
    layer6(mouseX/7,mouseY/7)
    layer5(mouseX/10,mouseY/10)
    layer4(mouseX/30,mouseY/30)
    layer3(mouseX/50,mouseY/50)
    layer2(mouseX/70,mouseY/70)
    layer1(mouseX/100,mouseY/100)
    
    # anyways if you want to ask me how i knew this without googling it up i used to be a scratch kid ok byeeeee
