class Complex:
    real = float()
    img = float()
    def __init__(self,real,img) -> None:
        self.real = real
        self.img = img
    def __add__(self,obj)->None:
        self.real +=obj.real
        self.img += obj.img
    def output(obj)->None:
        print(f"Complex number is : {obj.real} + {obj.img}i")
c1 = Complex(1,2)
c2 = Complex(10,10)
c1.output()
c2.output()
c1.__add__(c2)
c1.output()