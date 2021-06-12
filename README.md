# Networking

Este proyecto se busca entender como funciona Cliente-Servidor realizando operaciones matemáticas y/o trigonométricas, también se realiza un httpServer queriendo tener respuesta de un servidor por medio de un browser usando el protocolo http

## Autor ✒️


* **Jose María Castro Ortega** - *Autor*  - *Estudiante de ingeniería de sistemas*
* **11/06/2021** - *Fecha* 

### Pre-requisitos 📋
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://git-scm.com/) - Software de control de versiones
* [Java](https://www.oracle.com/java/) - Lenguaje de programación



## Comenzando 🚀
1. Clonar el repositorio
```
git clone https://github.com/Jose1102/WorkNetworking
```

2. Compilar el proyecto

```
mvn package
```



3. Ejecutar el proyecto 

### Para ejecutar la calculadora que retorna el cuadrado de un número

Se debe ejecutar primero la clase SquareServer como se muestrá a continuación
![square](https://github.com/Jose1102/WorkNetworking/blob/master/images/squareServer.PNG)

Luego se ejecuta la clase SquareClient, donde se debe ingresar el número,  para cerrar el servidor se coloca la palabra Bye. 

![square](https://github.com/Jose1102/WorkNetworking/blob/master/images/squareClient.PNG)


### Para ejecutar la calculadora trigonométrica

Se debe ejecutar primero la clase CalculatorServer como se muestrá a continuación
![claculator](https://github.com/Jose1102/WorkNetworking/blob/master/images/claculatorServer.PNG)

Luego se ejecuta la clase CalculatorClient, donde se debe ingresar el número, el primer número realiza la operación de coseno. Para cambiar de función se debe colocar la palabra fun:sin,fun:tan o fun:cos, para cerrar el servidor se coloca la palabra Bye. 

![calculator](https://github.com/Jose1102/WorkNetworking/blob/master/images/claculatorClient.PNG)


### Para ejecutar el UrlReader 

Se debe ejecutar primero la clase UrlReader, donde debemos ingresar en la consola el link de una pagina de estilo http://link.com

![claculator](https://github.com/Jose1102/WorkNetworking/blob/master/images/UrlReader.PNG)
 
⚠️ Se crea un archivo resultado.html en la carpeta WWW con el código fuente de la pagina ingresada


### Para ejecutar el url con información una URL

Se debe ejecutar primero la clase CalculatorServer, donde esta nos mostrará información básica de un link o URL como se muestrá a continuación

![claculator](https://github.com/Jose1102/WorkNetworking/blob/master/images/url.PNG)



### Para ejecutar la clase que abre el servidor desde el brower 

Se debe ejecutar primero la clase MultipleServer como se muestrá a continuación

![claculator](https://github.com/Jose1102/WorkNetworking/blob/master/images/claculatorServer.PNG)

Luego se abre el browser y se coloca localhost

![calculator](https://github.com/Jose1102/WorkNetworking/blob/master/images/multiServer2.PNG)




## Ejecutando las pruebas ⚙️

1. Compilar pruebas

```
mvn test
```
![PRUEBAS](https://github.com/Jose1102/WorkNetworking/blob/master/images/test.PNG)

## Diagrama de clases 📖

![DIAGRAMA](https://github.com/Jose1102/WorkNetworking/blob/master/images/diagrama/calculator.PNG)


Se tienen dos clases una que es la clase cliente y la otra que el servidor donde la clase CalculatorServer realiza las operaciones trigonométricas 



![DIAGRAMA2](https://github.com/Jose1102/WorkNetworking/blob/master/images/diagrama/http.PNG)


Por otra lado se tiee la clase HttpServer que es una clase que nos ayuda a conectarnos por medio de un browser 



![DIAGRAMA3](https://github.com/Jose1102/WorkNetworking/blob/master/images/diagrama/square.PNG)


En este diagrama se puede observar dos clases una que es cliente y la otra el servidor. Realiza el cuadrado de un número 



![DIAGRAMA4](https://github.com/Jose1102/WorkNetworking/blob/master/images/diagrama/url.PNG)


Su objetivo es poder mostrar información por medio de una variable de tipo URL, donde su propósito es mostrar información básica de un link.



![DIAGRAMA5](https://github.com/Jose1102/WorkNetworking/blob/master/images/diagrama/urlreader.PNG)


Por último, esta clase por medio de un entrada de una url este guarda el código html en un archivo resultado.html

 

## Productividad 🛠️
891 loc / 17 horas

## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/WorkNetworking/tree/master/JavaDoc) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/WorkNetworking/blob/master/LICENSE.txt) para obtener más detalles.
