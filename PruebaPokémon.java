/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class PruebaPokémon {
    
    public static void main( String[] args ) throws InterruptedException
    {
        Scanner reader = new Scanner(System.in);
        String nombre;
        String nombre2;
        String ataque = null;
        int opcion;
        
        //Inicio del programa
        System.out.println("********************************************** ");
        System.out.println("      Elija una opción de juego: ");
        System.out.println("//////////////////////////////////////////// \n ");
        Thread.sleep(850);
        System.out.println("1.Resistencias y Debilidades de un Pokémon");
        Thread.sleep(850);
        System.out.println("2.Realizar un movimiento contra un Pokémon");
        Thread.sleep(850);
        System.out.println("\n////////////////////////////////////////// ");
        System.out.println("********************************************** \n");
        opcion = reader.nextInt();
        System.out.println("Opcion escogida -> " + opcion);
        Thread.sleep(700);
        System.out.println("*");
        Thread.sleep(900);
        System.out.println("*");
        Thread.sleep(900);
        System.out.println("*");
        Thread.sleep(700);
        
        //Opciones de juego
        System.out.println("Introduzca el primer tipo de su Pokémon: ");
        nombre = reader.nextLine();nombre = reader.nextLine();
        System.out.println("Introduzca el segundo tipo de su Pokémon: (Presione 'Enter' sino quiere un segundo tipo)");
        nombre2 = reader.nextLine();
        if (opcion == 2)
        {
            System.out.println("Introduzca el tipo del ataque que va a realizar: ");
            ataque = reader.nextLine();
        }
        Pokémon Pokemon = new Pokémon();
        String resultado = null;
        
        float n = 0;
        //Tipos del pokemon//
        if ("Agua".equals(nombre) || "agua".equals(nombre) ||
                "Agua".equals(nombre2) || "agua".equals(nombre2))
            Pokemon.Agua(ataque);
        if ("Fuego".equals(nombre) || "fuego".equals(nombre) ||
                "Fuego".equals(nombre2) || "fuego".equals(nombre2))
            Pokemon.Fuego(ataque);
        if ("Fantasma".equals(nombre) || "fantasma".equals(nombre) ||
                "Fantasma".equals(nombre2) || "fantasma".equals(nombre2))
            Pokemon.Fantasma(ataque);
        if ("Hielo".equals(nombre) || "hielo".equals(nombre) ||
                "Hielo".equals(nombre2) || "hielo".equals(nombre2))
            Pokemon.Hielo(ataque);
        if ("Normal".equals(nombre) || "normal".equals(nombre) ||
                "Normal".equals(nombre2) || "normal".equals(nombre2))
            Pokemon.Normal(ataque);
        if ("Hada".equals(nombre) || "hada".equals(nombre) ||
                "Hada".equals(nombre2) || "hada".equals(nombre2))
            Pokemon.Hada(ataque);
        if ("Veneno".equals(nombre) || "veneno".equals(nombre) ||
                "Veneno".equals(nombre2) || "veneno".equals(nombre2))
            Pokemon.Veneno(ataque);
        if ("Tierra".equals(nombre) || "tierra".equals(nombre) ||
                "Tierra".equals(nombre2) || "tierra".equals(nombre2))
            Pokemon.Tierra(ataque);
        if ("Roca".equals(nombre) || "roca".equals(nombre) ||
                "Roca".equals(nombre2) || "roca".equals(nombre2))
            Pokemon.Roca(ataque);
        if ("Acero".equals(nombre) || "acero".equals(nombre) ||
                "Acero".equals(nombre2) || "acero".equals(nombre2))
            Pokemon.Acero(ataque);
        if ("Siniestro".equals(nombre) || "siniestro".equals(nombre) ||
                "Siniestro".equals(nombre2) || "siniestro".equals(nombre2))
            Pokemon.Siniestro(ataque);
        if ("Lucha".equals(nombre) || "lucha".equals(nombre) ||
                "Lucha".equals(nombre2) || "lucha".equals(nombre2))
            Pokemon.Lucha(ataque);
        if ("Planta".equals(nombre) || "planta".equals(nombre) ||
                "Planta".equals(nombre2) || "planta".equals(nombre2))
            Pokemon.Planta(ataque);
        if ("Bicho".equals(nombre) || "bicho".equals(nombre) ||
                "Bicho".equals(nombre2) || "bicho".equals(nombre2))
            Pokemon.Bicho(ataque);
         if ("Volador".equals(nombre) || "volador".equals(nombre) ||
                "Volador".equals(nombre2) || "volador".equals(nombre2))
            Pokemon.Volador(ataque);
        if ("Dragon".equals(nombre) || "dragon".equals(nombre) ||
                "Dragón".equals(nombre) || "dragón".equals(nombre) ||
                "Dragon".equals(nombre2) || "dragon".equals(nombre2) ||
                "Dragón".equals(nombre2) || "dragón".equals(nombre2))
            Pokemon.Dragón(ataque);
        if ("Electrico".equals(nombre) || "electrico".equals(nombre) ||
                "Eléctrico".equals(nombre) || "eléctrico".equals(nombre) ||
                "Electrico".equals(nombre2) || "electrico".equals(nombre2) ||
                "Eléctrico".equals(nombre2) || "eléctrico".equals(nombre2))
            Pokemon.Eléctrico(ataque);   
        if ("Psiquico".equals(nombre) || "psiquico".equals(nombre) ||
                "Psíquico".equals(nombre) || "psíquico".equals(nombre) ||
                "Psiquico".equals(nombre2) || "psiquico".equals(nombre2) ||
                "Psíquico".equals(nombre2) || "psíquico".equals(nombre2))
            Pokemon.Psíquico(ataque);

        
        //Tipo de movimiento//
        if (opcion == 2)
        {
            if ("Agua".equals(ataque) || "agua".equals(ataque))
                n = Pokemon.agua;
            if ("Acero".equals(ataque) || "acero".equals(ataque))
                n = Pokemon.acero;
            if ("Fuego".equals(ataque) || "fuego".equals(ataque))
                n = Pokemon.fuego;
            if ("Roca".equals(ataque) || "roca".equals(ataque))
                n = Pokemon.roca;
            if ("Tierra".equals(ataque) || "tierra".equals(ataque))
                n = Pokemon.tierra;
            if ("Veneno".equals(ataque) || "veneno".equals(ataque))
                n = Pokemon.veneno;
            if ("Hada".equals(ataque) || "hada".equals(ataque))
                n = Pokemon.hada;
            if ("Normal".equals(ataque) || "normal".equals(ataque))
                n = Pokemon.normal;
            if ("Hielo".equals(ataque) || "hielo".equals(ataque))
                n = Pokemon.hielo;
            if ("Fantasma".equals(ataque) || "fantasma".equals(ataque))
                n = Pokemon.fantasma;
            if ("Siniestro".equals(ataque) || "siniestro".equals(ataque))
                n = Pokemon.siniestro;
            if ("Lucha".equals(ataque) || "lucha".equals(ataque))
                n = Pokemon.lucha;
            if ("Planta".equals(ataque) || "planta".equals(ataque))
                n = Pokemon.planta;
            if ("Bicho".equals(ataque) || "bicho".equals(ataque))
                n = Pokemon.bicho;
            if ("Volador".equals(ataque) || "volador".equals(ataque))
                n = Pokemon.volador;
            if ("Dragon".equals(ataque) || "dragon".equals(ataque) 
                || "Dragón".equals(ataque) || "dragón".equals(ataque))
                n = Pokemon.dragon;
            if ("Electrico".equals(ataque) || "electrico".equals(ataque) 
                || "Eléctrico".equals(ataque) || "eléctrico".equals(ataque))
                n = Pokemon.electrico;
            if ("Psiquico".equals(ataque) || "psiquico".equals(ataque) 
                || "Psíquico".equals(ataque) || "psíquico".equals(ataque))
                n = Pokemon.psiquico;
        
            //Efectividad y resultado//
            if (n == 0)
                resultado = "ineficaz";
            if (n == 0.25)
                resultado = "muy poco eficaz";
            if (n == 0.5)
                resultado = "poco eficaz";
            if (n == 1)
                resultado = "neutro";
            if (n == 2)
                resultado = "muy eficaz";
            if (n == 4)
                resultado = "super eficaz";
            System.out.println("Tu ataque de tipo " + ataque + " es " + resultado + "(x"
                + n + ")" + " contra el Pokémon de tipo " + nombre + "/" + nombre2);
        }
    }
}
