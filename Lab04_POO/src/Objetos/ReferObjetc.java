/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import Poo.*;
/**
 *
 * @author Administrador
 */
public class ReferObjetc {
    public static void main(String[] args) {
        Docente obj1 = new Docente();
        obj1.setNombre("Jairo");
        obj1.setApellido("morales");
        obj1.setDni("12345678");
        obj1.setSexo('m');
        obj1.setSldo(10000);
        obj1.setCursos(new String[]{"a","b","c","d","e"});
    }
}
