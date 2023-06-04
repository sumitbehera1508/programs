#6. Write program involving regular expression.
import re
txt = input("enter the text starting with i and ending with human\n : ")
if(re.search("^i.*human$",txt)):
    print("It is a Valid input.")
else:
    print("It is an invalid input.")
temp=input("the no. of occurance char seq : ")
print(f"the no. is {len(re.findall(temp,txt))}")
temp = input("the text want to search : ")
print(f"the first index is {re.search(temp,txt).start()}")
print(f"the span is {re.search(temp,txt).span()}")
print(f"the group is {re.search(temp,txt).group()}")
temp = input("the char used as separator : ")
print(f"the arr is {re.split(temp,txt)}")