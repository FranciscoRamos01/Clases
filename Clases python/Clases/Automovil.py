from Clases.Vehiculo import*
class Automovil(Vehiculo):
    def __init__(self, fecha_fabricacion, VIN_Chasis, VINMotor, marca, modelo, precio):
        super().__init__(fecha_fabricacion, VIN_Chasis, VINMotor) 
        self.marca = marca
        self.modelo = modelo
        self.precio = precio
    @property
    def marca(self):
        return self._marca

    @marca.setter
    def marca(self, valor):
        self._marca = valor
    
    @property
    def modelo(self):
        return self._modelo

    @modelo.setter
    def modelo(self, valor):
        self._modelo = valor
    
    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, valor):
        self._precio = valor
    
    def mostrar_datos(self):
        print(f"Datos del Automóvil:")
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Precio: ${self.precio:,.2f}")
        print(f"Fecha de Fabricación: {self.fecha_fabricacion}")
        print(f"VIN Chasis: {self.VIN_Chasis}")
        print(f"VIN Motor: {self.VINMotor}")