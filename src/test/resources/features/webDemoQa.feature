#language: es
#Author: David Cruz
#Email: david3505@hotmail.com
@all
Característica: Ejercicio practico del uso de screenplay-selenium para aplicaciones web

  @demoQaElements
  Escenario: El usuario practica con elementos web
    Dado que el usuario accede a demoqa.com
    Cuando interactua con los elementos:
    |Text Box|
    |Check Box|
    #|Radio Button|
    #|Web Tables|
    #|Buttons|
    #|Links|
    #|Broken Links - Images|
    #|Upload and Download|
    #|Dynamic Properties|
    Entonces deberia ver un cambio en el comportamiento de los elementos
