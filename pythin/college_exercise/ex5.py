#5. Write program to create and read from CSV file.
import csv

n = int(input("1.read \n2.appand\nenter :"))
match n:
    case 1:
        #read
        with open("new.csv","r") as file:
            reader = csv.reader(file)
            for row in reader :
                print(row)
    case 2:
        #Write
        with open("new.csv",'w',newline='') as file:
            writer = csv.writer( file,delimiter=',',)
            k = int(input("this csv has 3 col ,enter : "))
            for i in range(0,k):
                arr= input("enter string separated by space: ")
                writer.writerow(arr.split(" "))