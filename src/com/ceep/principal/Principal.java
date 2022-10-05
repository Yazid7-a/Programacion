/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.principal;

import enumeracion.Anime;
import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
    
     public static void main(String[] args){
         
         System.out.println("\tENUM");
         System.out.println("\t=====");
         
         System.out.println("Mi primer dia de la semana es: "+ Dias.Lunes);
         diaSemana(Dias.Martes);
         
         //Asignacion directa con enum
         Dias miDia = Dias.Sabado;
         
         //asignacion de un dia en base a un String con ValueOf()
         Dias miSegundoDia = Dias.valueOf("Viernes");
         
         //Declaracion de un listado de dias inicializado con los values de mi
         //enum
         Dias[] todosMisDias = Dias.values();
         //Imprimo el contenido de mi listado
         for(Dias d: todosMisDias){
             System.out.println("d = "+d.name());

         }
   
             //Visualizando Continentes
             System.out.println("");
             System.out.println("CONTINENTES");
             System.out.println("=============");
             System.out.println("Continente. . ." + Continentes.AFRICA );
             System.out.println("Numero de Paises: " + Continentes.AFRICA.getNum());
             System.out.println("Numero de Paises: " + Continentes.AFRICA.getSuperficie());
         
             //Animes
             System.out.println("");
             System.out.println("Categoria de Anime Favorita: " + Anime.Shônen);
             System.out.println("Número de Animes de " + Anime.Shônen + ": "+ Anime.Shônen.getNumAnimes());
             
             Anime[] listaAnimes = Anime.values();
             
             System.out.println("");
             System.out.println("Lista de Categorias de Anime");
             System.out.println("========================");
             for(Anime d: listaAnimes){
             System.out.println("\t "+d.name());

         }
     }
         
     public static void diaSemana(Dias dias){
         switch(dias){
                case Lunes:
                    System.out.println("Hoy es: " + Dias.Lunes);
                    break;
                case Martes:
                 System.out.println("Hoy es: " + Dias.Martes);
                 break;
                 case Miercoles:
                 System.out.println("Hoy es: " + Dias.Miercoles);
                 break;
                 case Jueves:
                 System.out.println("Hoy es: " + Dias.Jueves);
                 break;
                 case Viernes:
                 System.out.println("Hoy es: " + Dias.Viernes);
                 break;
                 case Sabado:
                 System.out.println("Hoy es: " + Dias.Sabado);
                 break;
                 case Domingo:
                 System.out.println("Hoy es: " + Dias.Domingo);
                 break;
         }
     }
     
}
