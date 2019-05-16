/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocolas;

import java.util.Scanner;

/**
 *
 * @author YO
 */
public class ProyectoColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      int sw,dato;
      Colas cola = new Colas();

      do{
            System.out.println("\n\t 0. SALIR \n\t 1. INGRESAR \n\t 2.ELIMINAR \n\t 3. MOSTRAR \n\t");
            System.out.println("\n\t OPCION:    ");
            sw = sc.nextInt();
            switch(sw){
                case 1:{
                    System.out.print("\n\t INGRESE NUMERO :\t\t");
                     dato = sc.nextInt();
                     cola.InsertarEnPrimero(dato);
                break;
                }
                case 2:{
                    System.out.println("\n\t EL DATO HA SIDO ELIMINADO");
                    cola.borrarUltimo();
                     break;
                }
                case 3:{
                    System.out.println("\n\t DATOS:  "+cola.Listar());
                     break;
                }
              }
        }while(sw!=0);
        
    }
    
}
