from tkinter import *
from tkinter import ttk

class Pesel_Checker:

    def __init__(self):
        self.display = Tk()

        self.size = self.display.geometry("250x100")

        self.entry = ttk.Entry(self.display, width= 30)
        self.entry.pack()
        self.entry.insert(0, "Enter your pesel number, please.")
        self.button_check = ttk.Button(self.display, text= "Check", command= self.check).pack()
        self.screen_date = ttk.Label(self.display, text= "Birth Date... ", background= "light grey", wraplength= 120, justify= CENTER)
        self.screen_date.pack()
        self.screen_plec = ttk.Label(self.display, text= "...", background="light grey", wraplength=120, justify=CENTER)
        self.screen_plec.pack()

        self.display.mainloop()

    def check(self):
        self.pesel = self.entry.get()
        self.pesel = list(self.pesel)
        if len(self.pesel) == 11:
            self.date_pesel = self.pesel[0], self.pesel[1], self.pesel[2], self.pesel[3], self.pesel[4], self.pesel[5]
            self.plec = int(self.pesel[9])
            self.year = int(self.pesel[0] + self.pesel[1])
            self.month = int(self.pesel[2] + self.pesel[3])
            self.day = self.pesel[4] + self.pesel[5]

            if self.day <= '31':
                self.date_day = self.day

            if self.month >= 21:
                self.date_month = self.month - 20
                self.date_year = self.year + 2000
                if self.date_month == 1:
                    self.date_month_name = 'January'
                elif self.date_month == 2:
                    self.date_month_name = 'February'
                elif self.date_month == 3:
                    self.date_month_name = 'March'
                elif self.date_month == 4:
                    self.date_month_name = 'April'
                elif self.date_month == 5:
                    self.date_month_name = 'May'
                elif self.date_month == 6:
                    self.date_month_name = 'June'
                elif self.date_month == 7:
                    self.date_month_name = 'July'
                elif self.date_month == 8:
                    self.date_month_name = 'August'
                elif self.date_month == 9:
                    self.date_month_name = 'September'
                elif self.date_month == 10:
                    self.date_month_name = 'October'
                elif self.date_month == 11:
                    self.date_month_name = 'November'
                elif self.date_month == 12:
                    self.date_month_name = 'December'

            elif self.month <= 12:
                self.date_month = self.month
                self.date_year = self.year + 1900
                if self.date_month == 1:
                    self.date_month_name = 'January'
                elif self.date_month == 2:
                    self.date_month_name = 'February'
                elif self.date_month == 3:
                    self.date_month_name = 'March'
                elif self.date_month == 4:
                    self.date_month_name = 'April'
                elif self.date_month == 5:
                    self.date_month_name = 'May'
                elif self.date_month == 6:
                    self.date_month_name = 'June'
                elif self.date_month == 7:
                    self.date_month_name = 'July'
                elif self.date_month == 8:
                    self.date_month_name = 'August'
                elif self.date_month == 9:
                    self.date_month_name = 'September'
                elif self.date_month == 10:
                    self.date_month_name = 'October'
                elif self.date_month == 11:
                    self.date_month_name = 'November'
                elif self.date_month == 12:
                    self.date_month_name = 'December'

            if self.plec % 2 == 0:
                self.plec_inf = 'Woman'
            else:
                self.plec_inf = 'Man'

            self.output = [self.date_day, self.date_month_name, self.date_year]

            self.screen_date.config(text= self.output)
            self.screen_plec.config(text= self.plec_inf)

        else:
            self.screen_date.config(text= "Wrong pesel number!!!")


window = Pesel_Checker()
