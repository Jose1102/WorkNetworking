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
git clone https://github.com/Jose1102/OODesign
```

2. Compilar el proyecto

```
mvn package
```



3. Ejecutar el proyecto 
```
java -cp "./target/classes/" edu.escuelaing.arsw.OOdesign.app.App /Users/José/Desktop/prueba/prueba2.txt
```


### Estructura al ejecutar app⚠️

como argumento debe ir la dirección del archivo txt a leer

## Ejecutando las pruebas ⚙️

1. Compilar pruebas

```
mvn test
```
![PRUEBAS](https://github.com/Jose1102/OODesign/blob/master/images/Pruebas.PNG)

## Diagrama de clases 📖

![DIAGRAMA](https://github.com/Jose1102/OODesign/blob/master/images/Diagrama.PNG)

Se creo una clase linkedList que implementa List<E>, Deque<E>, Cloneable, Serializable donde se importa y se sobre escriben todos los métodos de cada uno de ellos, Luego se crea Nodo donde se le coloca como cabeza y cola el atributo last y first. Para direccionar cada nodo como se muestra es con el atributo siguiente 

## Productividad 🛠️
554 loc / 11 horas

## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/OODesign/tree/master/apidocs) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/OODesign/blob/master/LICENSE.txt) para obtener más detalles.
