print('Program otwierający pliki.')

tekst = open('Plik.txt')
try:
    plik = tekst.read()
finally:
    tekst.close()
print(plik)