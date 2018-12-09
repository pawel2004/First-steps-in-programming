print('Program do dzielenia.')

dzielna = float(input('Wprowadz dzielną: '))
dzielnik = float(input('Wprowadz dzielnik: '))

while dzielnik == 0:
    print('Nie dzielimy przez 0!')
    dzielnik = float(input('Wprowadz dzielnik: '))
if dzielnik != 0:
    reszta = dzielna % dzielnik
    calosc = (dzielna - reszta)/dzielnik
    print('Wynik to:', calosc, 'całosci i:', reszta, 'reszty.')

