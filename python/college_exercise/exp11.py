class Person:
    name = str()
    age = int()
    Dob_day = int()
    Dob_month = int()
    Dob_year = int()
    gender = str()
    def __init__( sumit,name,age,Dob_day,Dob_month,Dob_year,gender) -> None:
        sumit.age = age
        sumit.name = name
        sumit.Dob_day = Dob_day
        sumit.Dob_month = Dob_month
        sumit.Dob_year = Dob_year
        sumit.gender = gender
    def details(obj):
        print(f"Name :{obj.name}\nage :{obj.age}\nDob :{obj.Dob_day}/{obj.Dob_month}/{obj.Dob_year}\nGender :{obj.gender}")
    
class Boy(Person):
    def __init__(self,name,age,Dob_day,Dob_month,Dob_year):
        Person.__init__(self,name,age,Dob_day,Dob_month,Dob_year,"Male")
    
class Girl(Person):
    def __init__(self,name,age,Dob_day,Dob_month,Dob_year) -> None:
        Person.__init__(self,name,age,Dob_day,Dob_month,Dob_year,"Female")
sumit = Boy("Sumit",22,15,8,2001)
b = Girl("abcd",15,10,7,2009)

sumit.details()
b.details()