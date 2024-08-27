//crear una clase llamada fraccion con atributos numerador y denominadior, apliacar encapsulamiento y al menos un metodo get y set para manipular objetos en esa clase
class Fraccion:
    def int(self, numerador, denominador):
        self.numerador = numerador
        self.denominador = denominador 
        self.validardenominador()
    def validardenominador(self):
        if self.denominador == 0:
            rectificar ValueError("El denominador no puede ser cero.")
    def getnumerador(self):
        return self.numerador
    def set_numerador(self, numerador):
        self.numerador = numerador
    def get_denominador(self):
        return self.denominador
    def set_denominador(self, denominador):
        if denominador == 0:
            reactificar ValueError("El denominador no puede ser cero.")
        self.denominador = denominador
