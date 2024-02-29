package Algorithms02Sorting

// #1 - Sort 10 schools around your house by distance:
// Few items
// Insertion sort: few items
// Insertion Sort porque es un tamaño de entrada pequeño, y en estos casos este algoritmo es muy eficaz, además si la entrada está (o casi) ordenada será aún más rápido.

// #2 - eBay sorts listings by the current Bid amount:
// Many items, numbers, decimal
// Radix Sort
// Radix or Counting Sort porque es un número en un rango, por lo que podremos aprovechar sus rápidas ejecuciones con números, además de ser un valor entero, además de que al ser en eBay no será un valor como un billón, serán valores más pequeños.

// #3 - Sport scores on ESPN:
// Many items, numbers, decimal
// Counting sort
// Quick Sort porque a veces tiene decimales, distintos formatos para el fútbol, tenis, etc. Será el más eficiente, porque a pesar de preocuparnos en el peor caso porque sus entradas pueden ser distintas, es importante preocuparnos por el espacio en memoria que ocuparemos.

// #4 - Massive database (can't fit all into memory) needs to sort through past year's user data:
// Many data, not only numbers
// Quick sort because space complexity is O(log(n))
// Merge Sort porque no estaremos ordenando en memoria debido a que la data es muy grande, y debido a que el tamaño es masivo debemos priorizar la complejidad de tiempo.

// #5 - Almost sorted Udemy review data needs to update and add 2 new reviews:
// few items, almost sorted data
// Insertion sort
// Insertion Sort porque la información está casi ordenada, y sólo estamos agregando 2 reviews.

// #6 - Temperature Records for the past 50 years in Canada:
// numbers, many data, 3-digit numbers
// Radix Sort
// Radix or Counting Sort porque no tienen decimales, y suelen ser números de 2 digitos, lo que nos permitirá aprovechar los recursos haciendo uso de estos algoritmos.

// #7 - Large user name database needs to be sorted. Data is very random:
// string data, large data, unordered
// Merge Sort, is O(n log(n)) even in worst scenarios
// Merge Sort si tenemos suficiente memoria, o Quick Sort si no nos preocupamos por el peor caso y podemos seleccionar un buen pivote.

// #8 - You want to teach sorting for the first time:
// academic purpose
// Bubble Sort
// Bubble Sort, Selection Sort porque son los más sencillos.