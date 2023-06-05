import random
print("-"*100,"\n"," "*45,"start game")
k = input("Choose one \n\t1.Rock(r)\n\t2.Paper(p)\n\t3.Scissor(s) : ")
if(k not in [1,2,3,'r','p','s','R','P','S']):
    print("invalid Input")
n = random.randint(1,3)
match n:
    case 1:
        n = "r"
    case 2:
        n="p"
    case 3:
        n="s"
if(k==n):
    print("It is a Tie")
elif((k=="r") | (k=="R") |(k==1)):
    if(n=="p"):
        print("You Lose")
    else:
        print("You Win")
elif((k=="p" )|( k== "P") | (k==2)):
    if(n=="s"):
        print("You Lose")
    else:
        print("You Win")
elif((k=="s" )|( k=="S") | (k==3)):
    if(n=="r"):
        print("You Lose")
    else:
        print("You Win")
