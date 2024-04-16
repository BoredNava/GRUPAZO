/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package principal;

import java.util.ArrayList;
import lothel.soft.evento.dao.EspacioDAO;
import lothel.soft.evento.model.Espacio;
import lothel.soft.evento.mysql.EspacioMYSQL;

/**
 *
 * @author efeproceres
 */
public class principal {
<<<<<<< HEAD
    public static void main(String [] args){
        EspacioDAO espacioDAO = new EspacioMYSQL();
        int resultado=0 ;  
        Espacio espacio= new Espacio(3,"a",122,true);
        //int resultado = espacioDAO.insertar(espacio);
        if(resultado==1){
           System.out.println("Se registro");
        }
        else{
           System.out.println("No se registro");
        }
        espacio.setIdEspacio(3);
        espacio.setAforo(40);
        //resultado = espacioDAO.modificar(espacio);
        //resultado=espacioDAO.eliminar(espacio.getIdEspacio());
        ArrayList<Espacio>espacios=new ArrayList<>();
        espacios=espacioDAO.listarEspacios();
        
        for(Espacio esp:espacios){
            System.out.println(esp.getIdEspacio()+"\n");    
        }    
    }
=======
    
>>>>>>> f50772ca2996e05e466e5c35e94d5458fe826568
}
