<# Cifrado de una cadena de texto
Desarrollar un programa que implemente una aplicación con GUI para el cifrado de archivos de texto con el algoritmo de cifrado Vigenère. Se va a crear un programa de cifrado simple. El proceso es muy sencillo. Se divide en dos partes. En primer lugar, cada letra mayúscula o minúscula debe desplazarse tres posiciones hacia la derecha, de acuerdo con la tabla ASCII: la letra ’a’ debe convertirse en la letra ’d’, la letra ’y’ debe convertirse en el carácter’—’, etc. En segundo lugar, cada línea debe invertirse. Después de invertir, todos los caracteres de la mitad en adelante (truncado) deben moverse una posición a la izquierda en ASCII. En este caso, ’b’ se convierte en ’a’ y ’a’ se convierte en ’‘’. Por ejemplo, si como entrada tenemos la cadena abcABC1 si la palabra resultante de la primera parte es ”defDEF1”, las letras ”DEF1”deben moverse una posición a la izquierda. Sin embargo, si la palabra resultante de la primera parte es ”tesA”, las letras ”sA”serán desplazadas. El resultado cifrado de la cadena es 1FECedc.

# Características solicitadas 
- Debe contener una ventana donde solicite un usuario que ingrese el nombre del archivo
para abrir y se muestre el contenido del archivo, una JTextArea donde el usuario ingresara
el texto que se desea encriptar o desencriptar y 4 botones los cuales tendrán las acciones 
de abrir, guardar, encriptar y desencripta.

# Pre-requisitos 
- Un de java en este caso (IDE. NetBeans 8.2) 
- Librerías como:
   *import java.io.BufferedReader;   

   *import java.io.FileNotFoundException;

   *import java.io.FileReader;

   *import java.io.IOException;

   *import java.io.BufferedWriter;

   *import java.io.File;

   *import java.io.FileWriter;

# Construido con:
- Boton para abrir el archivo:
Se ingresa el nombre del archivo para después accionar el botón de abrir y se muestre en el
JTextAre el contenido del archivo en la misma ventana.
- Se implemento un textArea para que el usuario ingrese el texto para el cifrado o descifrado
- Botón de guardar que accionara la tarea de guardar la el texto en un archivo.
- Botón de Encriptar que accionara el método que encriptara el texto.
- Botón de Desencriptar que accionara el método de desencriptar el texto .
# Agradecimientos
Compañeros:
- Leonel Aguirre.
Agradezco por orientarme en las dudas que iban surgiendo sobre el desarrollo del programa.

# Pruebas
- Pueden utilizar estas cadenas como prueba.
- Texto #3
- abcABC1
- vxpdylY .ph
- vv.xwfxo.fd
# Cadenas resultantes
- 3# rvzgV
- 1FECedc
- ks. \n{frzx
- gi.r{hyz-xx.

# Bibliografía
https://stackoverrun.com/es/q/1065964

file:///C:/Users/valti/Downloads/Como%20programar%20en%20Java%20-%207ma%20Edicion%20-%20P.%20J.%20Deitel.pdf

#iMPORTANTE
- Para abrir el archivo se tiene que escribir "file" y presiona boton de open

# Ejecucion:
https://youtu.be/VaruImNSqUU
