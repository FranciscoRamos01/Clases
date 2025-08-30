
import clases.Automovil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author ESTUDIANTES
 */
public class Main {
    public static void main(String[] args) {

        Automovil auto = new Automovil(
            "2023-05-01",  
            "1HGBH41JXMN109186",  
            "2A8HR64X0Y6801968", 
            "Ferrari",  
            "Monza SP1",  
            20000.00  
        );


        auto.mostrarDatos();
    }
}
