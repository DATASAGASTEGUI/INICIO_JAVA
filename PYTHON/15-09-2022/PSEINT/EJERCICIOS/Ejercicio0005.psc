Algoritmo EvaluarNumeroParImpar
	Definir n Como Entero
	Definir mensaje Como Caracter
	//ENTRADA
	Escribir "Ingrese n�mero n? "
	Leer n
	//PROCESO
	Si (n%2) = 0 Entonces
	    mensaje = "Par"
	SiNo
	    mensaje = "Impar"
	Fin Si
	//SALIDA
	Escribir mensaje
FinAlgoritmo
