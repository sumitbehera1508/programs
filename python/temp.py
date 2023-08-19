# creating an empty dictionary
Dict = {}
print(Dict)

#creating dictionary
# with Integer keys
dicti = {1:'c programming',2:'java',3:'python'}
print(dicti)

# creating a dictionary
# with a mixed keys
dicti = dict({'name':'geeks',1:[1,2,3,4],2:('a','b',)})
print(dicti)

#creating a dictionary
# with  dict() method
name = dict({1:'c programming',2:'java',3:'python'})
print("\nDictinary with the use of dict():")
print(name)

#creating a dictionary
#with each item as a pair
Dict = dict([(1,'c programming'),(2,'java'),(3,'python')])
print("\nDictionary with each item as a pair:")
print(Dict)

#loop through a dictionary for getting keys
for x in Dict.keys():
    print(x)

#loop for getting values
for x in Dict.values():
      print(x)

#Loop for getting both values and keys
    
for x,y in Dict.items():
        print(x,y)
#replacing value
Dict[1]="8"
print(Dict)

#Nested Dictionary

myfamily ={"child1":{"name":"email","year":2004},"child2":{"name":"tobias","year":2007},"child3": {"name": "linus", "year": 2011}}
print(myfamily)

###########
x = ('1','2','3','4')
y = (("a","b","c","d"))
if(len(x)==len(y)):
    res=dict(zip(x,y))