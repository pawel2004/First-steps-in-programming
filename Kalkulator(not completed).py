from tkinter import *
from tkinter import ttk

class Calculator:

    def __init__(self):
        self.display = Tk()

        self.display.geometry('500x500')

        #Label
        self.screen = ttk.Label(self.display, text= "0")
        self.screen.config(justify= CENTER)
        self.screen.config(background= "grey", foreground= "white")
        self.screen.config(font= ("Times New Roman",20,"bold"))
        self.screen.pack()

        #Numbers
        self.button_one = ttk.Button(self.display, text= "1")
        self.button_one.pack()
        self.button_one.config(command= self.add_one)
        self.button_two = ttk.Button(self.display, text="2", command=self.add_two).pack()
        self.button_three = ttk.Button(self.display, text="3", command=self.add_three).pack()
        self.button_four = ttk.Button(self.display, text="4", command=self.add_four).pack()
        self.button_five = ttk.Button(self.display, text="5", command=self.add_five).pack()
        self.button_six = ttk.Button(self.display, text="6", command=self.add_six).pack()
        self.button_seven = ttk.Button(self.display, text="7", command=self.add_seven).pack()
        self.button_eight = ttk.Button(self.display, text="8", command=self.add_eight).pack()
        self.button_nine = ttk.Button(self.display, text="9", command=self.add_nine).pack()
        self.a = 0
        self.b = "1"
        self.c = "0"
        self.d = "2"
        self.e = "3"
        self.f = "4"
        self.g = "5"
        self.h = "6"
        self.i = "7"
        self.j = "8"
        self.k = "9"
        self.button_zero = ttk.Button(self.display, text= "0", command= self.add_zero)
        self.button_zero.pack()
        self.check = 0

        #Functions
        self.button_dot = ttk.Button(self.display, text= ".", command= self.convert_to_float).pack()
        self.button_percent = ttk.Button(self.display, text= "%", command= self.percent).pack()
        self.button_add = ttk.Button(self.display, text= "+", command= self.add)
        self.button_add.pack()
        self.button_subtract = ttk.Button(self.display, text= "-", command= self.subtract).pack()
        self.button_multiply = ttk.Button(self.display, text= "*", command= self.multiply).pack()
        self.button_divide = ttk.Button(self.display, text= "/", command= self.divide).pack()
        self.button_delete = ttk.Button(self.display, text="C", command=self.delete_all).pack()
        self.result = ttk.Button(self.display, text = "=")
        self.result.config(command= self.result_func)
        self.result.pack()

        self.display.mainloop()

    def add_zero(self):
        if self.a == 0:
           self.a = str(self.a)
        else:
             self.a += self.c
        self.screen.config(text= self.a)

    def add_one(self):
        if self.a == 0:
            self.b = int(self.b)
            self.a += self.b
            self.b = str(self.b)
            self.a = str(self.a)
        else:
            self.a += self.b
        self.screen.config(text=self.a)

    def add_two(self):
        if self.a == 0:
            self.d = int(self.d)
            self.a += self.d
            self.d = str(self.d)
            self.a = str(self.a)
        else:
            self.a += self.d
        self.screen.config(text=self.a)

    def add_three(self):
        if self.a == 0:
            self.e = int(self.e)
            self.a += self.e
            self.e = str(self.e)
            self.a = str(self.a)
        else:
            self.a += self.e
        self.screen.config(text=self.a)

    def add_four(self):
        if self.a == 0:
            self.f = int(self.f)
            self.a += self.f
            self.f = str(self.f)
            self.a = str(self.a)
        else:
            self.a += self.f
        self.screen.config(text=self.a)

    def add_five(self):
        if self.a == 0:
            self.g = int(self.g)
            self.a += self.g
            self.g = str(self.g)
            self.a = str(self.a)
        else:
            self.a += self.g
        self.screen.config(text=self.a)

    def add_six(self):
        if self.a == 0:
            self.h = int(self.h)
            self.a += self.h
            self.h = str(self.h)
            self.a = str(self.a)
        else:
            self.a += self.h
        self.screen.config(text=self.a)

    def add_seven(self):
        if self.a == 0:
            self.i = int(self.i)
            self.a += self.i
            self.i = str(self.i)
            self.a = str(self.a)
        else:
            self.a += self.i
        self.screen.config(text=self.a)

    def add_eight(self):
        if self.a == 0:
            self.j = int(self.j)
            self.a += self.j
            self.j = str(self.j)
            self.a = str(self.a)
        else:
            self.a += self.j
        self.screen.config(text=self.a)

    def add_nine(self):
        if self.a == 0:
            self.k = int(self.k)
            self.a += self.k
            self.k = str(self.k)
            self.a = str(self.a)
        else:
            self.a += self.k
        self.screen.config(text=self.a)

    def convert_to_float(self):
        if self.a == 0:
            pass
        else:
            self.a += "."
        self.screen.config(text= self.a)

    def percent(self):
        self.number1 = float(self.a)
        self.a = 0
        self.screen.config(text= "0")
        self.check = 5

    def add(self):
        self.number1 = float(self.a)
        self.a = 0
        self.screen.config(text= "0")
        self.check = 1

    def subtract(self):
        self.number1 = float(self.a)
        self.a = 0
        self.screen.config(text= "0")
        self.check = 2

    def multiply(self):
        self.number1 = float(self.a)
        self.a = 0
        self.screen.config(text="0")
        self.check = 3

    def divide(self):
        self.number1 = float(self.a)
        self.a = 0
        self.screen.config(text="0")
        self.check = 4

    def result_func(self):
        result = 0
        self.number2 = float(self.a)
        self.a = 0
        if self.check == 1:
            self.result = self.number1 + self.number2
        elif self.check == 2:
            self.result= self.number1 - self.number2
        elif self.check == 3:
            self.result = self.number1*self.number2
        elif self.check == 4:
            self.result = self.number1/self.number2
        elif self.check == 5:
            self.result = self.number1*self.number2/100
        self.listed_result = list(str(self.result))
        if self.listed_result[-1] == "0":
            self.listed_result.remove(self.listed_result[-1])
            self.listed_result.remove(".")
            for z in self.listed_result:
                o = str(z)
                if result == 0:
                    o = int(o)
                    result += o
                    result = str(result)
                else:
                    result = str(result)
                    result += o
            self.result = result
        self.screen.config(text= self.result)
        self.a = self.result

    def delete_all(self):
        self.result = 0
        self.a = 0
        self.screen.config(text= "0")

okienko = Calculator()