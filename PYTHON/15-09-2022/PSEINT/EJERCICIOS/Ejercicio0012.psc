Algoritmo CantidadParesImparesSerie
	//Generar una serie 1..N y el programa dir� cuantos son pares y cuantos impares
	//Contador a = a + 1
    Definir pares,impares Como Entero
	Escribir "Ingrese N? "; Leer n
	pares=0
	impares=0
	Para i=1 Hasta n Hacer
			Si (i%2) = 0 Entonces
				pares = pares + 1
			SiNo
				impares = impares + 1
			FinSi
	FinPara
	Escribir "Pares  : ",pares
	Escribir "Impares:",impares
FinAlgoritmo

	
