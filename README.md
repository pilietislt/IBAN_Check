Sąlygos:

1.	Programavimo kalba gali būti bet kokia. 
2.	Interface’ą irgi rinkitės laisvai – lai tai irgi parodo jūsų, kaip architekto, gebėjimus.
3.	Užduoties atlikimo greitis irgi vertinamas.
4.	Tikiuosi, kad programą galėsiu pasileisti savo kompiuteryje (prisekite diegimo instrukciją ar panašiai).

Užduotis: sąskaitų numerių IBAN tikrinimas.

Parašyti programėlę, kuri dirbtų dviem režimais:
1.	Interaktyvus IBAN numerių tikrinimas. Vartotojo prašoma įvesti sąskaitos numerį ir programa išveda ar numeris yra teisingas.
2.	IBAN numerių iš tekstinio failo tikrinimas. Vartotojo paprašoma įvesti failo kelią ir pavadinimą. Programa nuskaito failą ir tikrina sąskaitos numerius. Rezultatus išveda į tokio pat pavadinimo failą su plėtiniu .out.

Pradinio failo struktūra: kiekviena eilutė - vienas sąskaitos numeris IBAN. Pvz:

	AA051245445454552117989
	LT647044001231465456
	LT517044077788877777
	LT227044077788877777
	CC051245445454552117989



Rezultato failo struktūra: IBAN;valid. Pvz:

	AA051245445454552117989;false
	LT647044001231465456;true
	LT517044077788877777;true
	LT227044077788877777;false
	CC051245445454552117989;false

Vartotojo sąsajai laisvas pasirinkimas (gali būti ir terminalinė sąsaja).

Apie IBAN: https://en.wikipedia.org/wiki/International_Bank_Account_Number  
