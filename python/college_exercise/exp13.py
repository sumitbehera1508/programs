# experiment 13
try:
    a = int(input("Enter the First Number :"))
    b = int(input("Enter the second Number :"))
    print("the division is "+str(a/b))
except IndentationError:
    print("Indentation error occured")
except ValueError:
    print("Interger was excepted ,But not entered")
except ZeroDivisionError:
    print("Divided By Zero")
except SyntaxError:
    print("Syntax error occured")
finally:
    print("Execution finished")
