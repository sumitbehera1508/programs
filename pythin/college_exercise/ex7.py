#7. Write programs to perform operations on lists.
my_list =[1,2,3,4,5,6,7,8,9]
print("the list is",my_list,"length is",len(my_list),"type is",type(my_list))
output =""
for i in my_list:
    output+=str(i)+" "
print("the list elements are",output)
a = int(input("1st index to start slicing"))
b = int(input("last index to slice : "))
print("new list is",my_list[a:b])
a = int(input("the index to input the data: "))
b = int(input("the data : "))
my_list.insert(a,b)
print("modified list is",my_list)
b = int(input("the data want to add at the end : "))
my_list.append(b)
print("new list is",my_list)
b = input("the new list to add at the back : ")
my_list.extend(b)
print("new list is",my_list)
a = int(input("the int data you want to remove"))
my_list.remove(a)
print("new list is",my_list)
my_list.pop()
print("remove last with pop():",my_list)
del my_list[0]
print("removing 1st element with del :",my_list)
my_list.clear()
print("the cleared list is :",my_list)
a=int(input("the no. from zero to add in new list :"))
my_list=[i for i in range(a)]
print("new lis is",my_list)
my_list.reverse()
print("reversed list is :",my_list)
my_list.sort()
print("sorted list is :",my_list)
my_list.sort(reversed=True)
print("sorted in reverse :",my_list)