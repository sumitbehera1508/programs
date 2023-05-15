# write a program using functions
def readtask() -> None:
    file1 = open("my.txt", 'r+')
    k = file1.readlines()
    o = ""
    for i in k:
        o += "\n"+i
    print(o)


def writetask() -> None:
    file1 = open("my.txt", 'w+')
    k = input("input your text : ")
    file1.writelines(k)


def appandtask() -> None:
    file1 = open("my.txt", 'a+')
    k = input("input your text : ")
    file1.writelines("\n"+k)


print("print the following for following actions \n 1.read \n 2.write \n 3.appand ")
task = int(input("the task you want : "))
if (task == 1):
    readtask()
elif (task == 2):
    writetask()
elif (task == 3):
    appandtask()