class Vehiculo:
    def __init__(self, fecha_fabricacion, VIN_Chasis, VINMotor):
        self.fecha_fabricacion = fecha_fabricacion
        self.VIN_Chasis = VIN_Chasis
        self.VINMotor = VINMotor

    @property
    def fecha_fabricacion(self):
        return self._fecha_fabricacion

    @fecha_fabricacion.setter
    def fecha_fabricacion(self, valor):
        self._fecha_fabricacion = valor
    

    @property
    def VIN_Chasis(self):
        return self._VIN_Chasis

    @VIN_Chasis.setter
    def VIN_Chasis(self, valor):
        self._VIN_Chasis = valor


    @property
    def VINMotor(self):
        return self._VINMotor

    @VINMotor.setter
    def VINMotor(self, valor):
        self._VINMotor = valor
    

