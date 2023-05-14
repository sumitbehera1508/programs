#2. Write programs using control statements

# if , elif , else
a = int(input("enter integer a : "))
b= int(input("enter integer b : "))
if(a>b):
    print(f"a({a}) is greater than b({b})")
elif(b>a):
    print(f"a({a}) is smaller than b({b})")
else:
    print(f"a and b has the same value {a}")

# for loop with else ,else will run if the loop is not terminated in the middle 
a = int(input("enter the 1st element from which iteration will start : "))
b = int(input("enter the 2nd element where the iteration will stop : "))
for i in range(a,b):
    print(i)
    if(i==10):
        break
else:
    print("loop completed without any problem")

#while loop 
while(a-1<b):
    a=a+1
    if(a%2==0):
        continue
    print(a)

#match statement 
n = int(input("enter a number from 0 to 9 : "))
match n:
    case 0:
        print("zero entered")
    case 1:
        print("one entered")
    case 2:
        print("two entered")
    case 3:
        print("three entered")
    case 4:
        print("Four entered")
    case 5:
        print("Five entered")
    case 6:
        print("Six entered")
    case 7:
        print("Seven entered")
    case 8:
        print("Eight entered")
    case 9:
        print ("Nine entered")
