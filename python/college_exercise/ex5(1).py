#5. Write program to create and read from CSV file.
n = int(input("\t1.read\n\t2.write\n\t3.appand\nenter : "))
match n:
    case 1:
        f = open("text.csv",'r+')
        print(f.read())
    case 2:
        f= open("text.csv",'w+')
        temp = input("enter data to file : ")
        f.write(temp+"\n")
    case 3:
        f=open("text.csv",'a+')
        temp = input("enter data to appand : ")
        f.write(temp+"\n")
f.close()