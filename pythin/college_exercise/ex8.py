# dictionary manipulation
my_dict = {}
n = int(input("the no. of keys you want: "))
for i in range(0, n):
    key = input("enter the key : ")
    value = input("enter the value : ")
    my_dict[key] = value
print(
    f"the dictionary is {my_dict} ,the length is {len(my_dict)} ,the type is {type(my_dict)}")
print("the keys are : ")
for i in my_dict.keys():
    print(i)
print("the values are : ")
for i in my_dict.values():
    print(i)
print("the items are : ")
for i in my_dict.items():
    print(i)
key = input("the key you want to search : ")
if key in my_dict.keys():
    print("the key is present")
else:
    print("the key is abscent")
value = input("the value you want to search : ")
if value in my_dict.values():
    print("the value is present")
else:
    print("the value is abscent")
key = input("the key whose value you want to update : ")
value = input("the value you want to give : ")
my_dict[key] = value
print(f"the updated dictionary is {my_dict}")
key = input("the key you want to delete")
del my_dict[key]
print(f"the new dictionary is {my_dict}")
my_dict.clear()
print(f"the dict is cleared {my_dict}")