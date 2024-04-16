/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package principal;

import lothel.soft.evento.dao.EspacioDAO;
import lothel.soft.evento.model.Espacio;
import lothel.soft.evento.mysql.EspacioMYSQL;

/**
 *
 * @author efeproceres
 */
public class principal {
    public static void main(String [] args){
        EspacioDAO espacioDAO = new EspacioMYSQL();

        Espacio espacio= new Espacio(2,"b",120,true);
        int resultado = espacioDAO.insertar(espacio);
        if(resultado==1){
           System.out.println("Se registro");
        }
        else{
           System.out.println("No se registro");
        }
    }
    
}
