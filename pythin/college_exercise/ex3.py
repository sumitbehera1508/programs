#3. Write programs involving string manipulations
my_string1 = input("input your string1 : ")
my_string2 = input("input your string2 : ")
print(f"by concanating we have {my_string1}+{my_string2} = {my_string1+my_string2}")
print(f"the length of new string using len() :{len(my_string1)}+{len(my_string2)}={len(my_string1+my_string2)}")
arr = [i for i in my_string1]
print(f"array from the elements using iteration is {arr}")
arr = my_string2.split(" ")
print(f"array using split() is {arr}")
temp = input("cheak a character sequence in string1 : ")
if temp in my_string1:
    print("present")
else:
    print("Not present")
a = int(input("the 1st index to start slicing string1 : "))
b = int(input("the last index to slice string1 : "))
print(my_string1[a:b])
print(f"String1 in uppercase is {my_string1.upper()}")
print(f"string1 in lowercase is {my_string1.lower()}")
print(f"string1 in title format is {my_string1.title()}")
print(f"removing space in starting and ending is {my_string1.strip()}")
a= input("character squence want to change in string1 : ")
b= input("change into : ")
print(f"modified string is {my_string1.replace(a,b)}")