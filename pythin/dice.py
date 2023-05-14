import random
k = "y"
while(k=="y" or k=="Y"):
    l = random.randint(1,6)
    print(str(l)+"\n")
    if(l==1):
        print("{- - - - -}\n{         }\n{    *    }\n{         }\n{- - - - -}")
    elif(l==2):
        print("{- - - - -}\n{         }\n{  *   *  }\n{         }\n{- - - - -}")
    elif(l==3):
        print("{- - - - -}\n{    *    }\n{    *    }\n{    *    }\n{- - - - -}")
    elif(l==4):
        print("{- - - - -}\n{  *   *  }\n{         }\n{  *   *  }\n{- - - - -}")
    elif(l==5):
        print("{- - - - -}\n{  *   *  }\n{    *    }\n{  *   *  }\n{- - - - -}")
    else:
        print("{- - - - -}\n{  *   *  }\n{  *   *  }\n{  *   *  }\n{- - - - -}")
    k = input("Do you want to roll the Dice ??(press y/Y to continue) : ")