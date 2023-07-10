class student:
    Name = ""
    Age = 0
    Year = 0
    Branch = ""
    def __init__(self, Name: str, Age: int, Year: int, Branch: str) -> None:
        self.name = Name
        self.age = Age
        self.Year = Year
        self.Branch = Branch
        
    def details(obj) -> None:
            print(f"Name : {obj.Name} \nAge : {obj.Age} \nYear : {obj.Year}\nBranch : {obj.Branch}")
        
object1 = student("Sumit Behera",21,2001,"MCA")

print("Name is "+object1.name)

print("Age is "+str(object1.age))

print("Year Of Birth is "+str(object1.Year))

print("Bramch is "+object1.Branch)

print(object1)

object1.details()