import json
file=json.load(open("dictionary.json"))
word = str(input("enter your word :- "))
def output(data):
    if (type(data)==list):
        for item in data :
            print(item)
    else:
        print(data)
if(word.lower() in file):
    output(file[word.lower()])
elif(word.upper() in file):
    output(file[word.upper()])
elif(word.title() in file):
    output(file[word.title()])
else:
    print("The word given does not exist in our Dictionary")
