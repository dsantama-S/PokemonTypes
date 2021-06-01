/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class PruebaPokémon
{
    public static void main( String[] args ) throws InterruptedException
    {
        Scanner reader = new Scanner(System.in);
        boolean salir = false;
        
        //Inicio del programa
        while(!salir){
            
        String nombre = null;
        String nombre2 = null;
        String ataque = null;
        Pokémon Pokemon = new Pokémon();
        boolean avanzar = false;
        int opcion = 0;
        
        System.out.println("********************************************** ");
        System.out.println("      Elija una opción de juego: ");
        System.out.println("//////////////////////////////////////////// \n ");
        Thread.sleep(650);
        System.out.println("1.Resistencias y Debilidades de un Pokémon");
        Thread.sleep(650);
        System.out.println("2.Realizar un movimiento contra un Pokémon");
        Thread.sleep(650);
        System.out.println("3.Combate random nivel 100 1 vs 1! (1st gen)");
        Thread.sleep(650);
        System.out.println("4.Salir");
        Thread.sleep(650);
        System.out.println("\n//////////////////////////////////////////");
        System.out.println("********************************************** \n");
        Thread.sleep(250);
        
        //Elegir opciones
        int k = 0;
        while(!avanzar){
        try 
            {
            if (k > 0)
                System.out.println("Elige una opción correcta: ");
            if (k == 0)
                System.out.println("Elige una opción: ");
            opcion = reader.nextInt();
                switch (opcion) 
                {
                    case 1:
                        avanzar = true;
                        break;
                    case 2:
                        avanzar = true;
                        break;
                    case 3:
                        avanzar = true;
                        break;
                    case 4:
                        avanzar = true;
                        break;
                    default:
                        k++;
                }
            }catch (InputMismatchException e) 
            {
                System.out.println("(Debes insertar un número)\n");
                k++;
                reader.next();
            }
        }
        System.out.println( "Opción escogida -> " + opcion );
        if (opcion == 4)
            salir = true;
        else
        {
        //cargando
        Thread.sleep(700);
        System.out.println("*");
        Thread.sleep(800);
        System.out.println("*");
        Thread.sleep(750);
        
        
        
        //inicio 1 y 2
        if (opcion == 1 || opcion == 2)
        {
            System.out.println("Introduzca el primer tipo de su Pokémon: ");
            nombre = reader.nextLine();nombre = reader.nextLine();
            System.out.println("Introduzca el segundo tipo de su Pokémon: (Presione 'Enter' sino quiere un segundo tipo)");
            nombre2 = reader.nextLine();
        }
        if (opcion == 2)
        {
            System.out.println("Introduzca el tipo del ataque que va a realizar: ");
            ataque = reader.nextLine();
        }
        
        
        //Tipos del pokemon//
        if (opcion == 1 || opcion == 2)
        {
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
        }
        
        //Tipo de juego y salida//
        int option;
        boolean salida = false;
        boolean entrada = false;
        if (opcion == 3)
        {
            Combate();
        }
        if (opcion == 2)
        {
            Ataques(ataque, Pokemon, nombre, nombre2);

            //volver al juego
            Thread.sleep(1050);
            System.out.println("\n\n\n\n ////////////////////////////");
            System.out.println(": ¿Quieres volver a jugar? :");
            System.out.println("1. Si");
            System.out.println("2. No\n");
            Thread.sleep(350);
            int j = 0;
            while(!entrada)
            {
            try 
            {
                if (j > 0)
                    System.out.println(":Escribe una de las opciones correctamente:");
                if (j == 0)
                    System.out.println(":Escribe una de las opciones:");
            option = reader.nextInt();
                switch (option) 
                {
                    case 1:
                        System.out.println("\n\n\n\n\n\n");
                        entrada = true;
                        break;
                    case 2:
                        salida = true;
                        break;
                    default:
                        j++;
                        
                }
            }catch (InputMismatchException e) 
            {
                System.out.println("(Debes insertar un número)\n");
                j++;
                reader.next();
            }
            if (salida == true)
            {
                exit(0);
            }
            }
        }
        if (opcion == 1)
        {
            Fortalezas(ataque, Pokemon, nombre, nombre2);
            
            //volver al juego
            Thread.sleep(1050);
            System.out.println("\n\n\n\n ////////////////////////////");
            System.out.println(": ¿Quieres volver a jugar? :");
            System.out.println("1. Si");
            System.out.println("2. No\n");
            Thread.sleep(350);
            int j = 0;
            while(!entrada)
            {
            try 
            {
                if (j > 0)
                    System.out.println(":Escribe una de las opciones correctamente:");
                if (j == 0)
                    System.out.println(":Escribe una de las opciones:");
            option = reader.nextInt();
                switch (option) 
                {
                    case 1:
                        System.out.println("\n\n\n\n\n\n");
                        entrada = true;
                        break;
                    case 2:
                        salida = true;
                        break;
                    default:
                        j++;
                        
                }
            }catch (InputMismatchException e) 
            {
                System.out.println("(Debes insertar un número)\n");
                j++;
                reader.next();
            }
            if (salida == true)
            {
                exit(0);
            }
            }
        }
        }
        }
    }
    public static void Ataques(String ataque, Pokémon Pokemon, String nombre, String nombre2)
    {
        String resultado = null;
        float n = 0;
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
            if ("".equals(nombre2))
            {
                System.out.println("Tu ataque de tipo " + ataque + " es " + resultado + "(x"
                    + n + ")" + " contra el Pokémon de tipo " + nombre);
            }
            else
            {
                System.out.println("Tu ataque de tipo " + ataque + " es " + resultado + "(x"
                    + n + ")" + " contra el Pokémon de tipo " + nombre + "/" + nombre2);
            }
        }
        public static void Fortalezas(String ataque, Pokémon Pokemon, String nombre, String nombre2) throws InterruptedException
     {
        String resultado = null;
        String resultado1 = null;
        String resultado2 = null;
        String resultado3 = null;
        String resultado4 = null;
        String resultado5 = null;
        String resultado6 = null;
        String resultado7 = null;
        String resultado8 = null;
        String resultado9 = null;
        String resultado10 = null;
        String resultado11 = null;
        String resultado12 = null;
        String resultado13 = null;
        String resultado14 = null;
        String resultado15 = null;
        String resultado16 = null;
        String resultado17 = null;
        
        float n;
        n = Pokemon.agua;
        if (n == 0)
            resultado = "Agua.i";
        if (n == 0.25)
            resultado = "Agua.mr";
        if (n == 0.5)
            resultado = "Agua.r";
        if (n == 1)
            resultado = "Agua.n";
        if (n == 2)
            resultado = "Agua.me";
        if (n == 4)
            resultado = "Agua.se";
        n = Pokemon.acero;
        if (n == 0)
            resultado1 = "Acero.i";
        if (n == 0.25)
            resultado1 = "Acero.mr";
        if (n == 0.5)
            resultado1 = "Acero.r";
        if (n == 1)
            resultado1 = "Acero.n";
        if (n == 2)
            resultado1 = "Acero.me";
        if (n == 4)
            resultado = "Acero.se";
        n = Pokemon.fuego;
        if (n == 0)
            resultado2 = "Fuego.i";
        if (n == 0.25)
            resultado2 = "Fuego.mr";
        if (n == 0.5)
            resultado2 = "Fuego.r";
        if (n == 1)
            resultado2 = "Fuego.n";
        if (n == 2)
            resultado2 = "Fuego.me";
        if (n == 4)
            resultado2 = "Fuego.se";
        n = Pokemon.roca;
        if (n == 0)
            resultado3 = "Roca.i";
        if (n == 0.25)
            resultado3 = "Roca.mr";
        if (n == 0.5)
            resultado3 = "Roca.r";
        if (n == 1)
            resultado3 = "Roca.n";
        if (n == 2)
            resultado3 = "Roca.me";
        if (n == 4)
            resultado3 = "Roca.se";
        n = Pokemon.tierra;
        if (n == 0)
            resultado4 = "Tierra.i";
        if (n == 0.25)
            resultado4 = "Tierra.mr";
        if (n == 0.5)
            resultado4 = "Tierra.r";
        if (n == 1)
            resultado4 = "Tierra.n";
        if (n == 2)
            resultado4 = "Tierra.me";
        if (n == 4)
            resultado4 = "Tierra.se";
        n = Pokemon.veneno;
        if (n == 0)
            resultado5 = "Veneno.i";
        if (n == 0.25)
            resultado5 = "Veneno.mr";
        if (n == 0.5)
            resultado5 = "Veneno.r";
        if (n == 1)
            resultado5 = "Veneno.n";
        if (n == 2)
            resultado5 = "Veneno.me";
        if (n == 4)
            resultado5 = "Veneno.se";
        n = Pokemon.hada;
        if (n == 0)
            resultado6 = "Hada.i";
        if (n == 0.25)
            resultado6 = "Hada.mr";
        if (n == 0.5)
            resultado6 = "Hada.r";
        if (n == 1)
            resultado6 = "Hada.n";
        if (n == 2)
            resultado6 = "Hada.me";
        if (n == 4)
            resultado6 = "Hada.se";
        n = Pokemon.normal;
        if (n == 0)
            resultado7 = "Normal.i";
        if (n == 0.25)
            resultado7 = "Normal.mr";
        if (n == 0.5)
            resultado7 = "Normal.r";
        if (n == 1)
            resultado7 = "Normal.n";
        if (n == 2)
            resultado7 = "Normal.me";
        if (n == 4)
            resultado7 = "Normal.se";
        n = Pokemon.hielo;
           if (n == 0)
            resultado8 = "Hielo.i";
        if (n == 0.25)
            resultado8 = "Hielo.mr";
        if (n == 0.5)
            resultado8 = "Hielo.r";
        if (n == 1)
            resultado8 = "Hielo.n";
        if (n == 2)
            resultado8 = "Hielo.me";
        if (n == 4)
            resultado8 = "Hielo.se";
        n = Pokemon.fantasma;
        if (n == 0)
            resultado9 = "Fantasma.i";
        if (n == 0.25)
            resultado9 = "Fantasma.mr";
        if (n == 0.5)
            resultado9 = "Fantasma.r";
        if (n == 1)
            resultado9 = "Fantasma.n";
        if (n == 2)
            resultado9 = "Fantasma.me";
        if (n == 4)
            resultado9 = "Fantasma.se";
        n = Pokemon.siniestro;
        if (n == 0)
            resultado10 = "Siniestro.i";
        if (n == 0.25)
            resultado10 = "Siniestro.mr";
        if (n == 0.5)
            resultado10 = "Siniestro.r";
        if (n == 1)
            resultado10 = "Siniestro.n";
        if (n == 2)
            resultado10 = "Siniestro.me";
        if (n == 4)
            resultado10 = "Siniestro.se";
        n = Pokemon.lucha;
        if (n == 0)
            resultado11 = "Lucha.i";
        if (n == 0.25)
            resultado11 = "Lucha.mr";
        if (n == 0.5)
            resultado11 = "Lucha.r";
        if (n == 1)
            resultado11 = "Lucha.n";
        if (n == 2)
            resultado11 = "Lucha.me";
        if (n == 4)
            resultado11 = "Lucha.se";
        n = Pokemon.planta;
        if (n == 0)
            resultado12 = "Planta.i";
        if (n == 0.25)
            resultado12 = "Planta.mr";
        if (n == 0.5)
            resultado12 = "Planta.r";
        if (n == 1)
            resultado12 = "Planta.n";
        if (n == 2)
            resultado12 = "Planta.me";
        if (n == 4)
            resultado12 = "Planta.se";
        n = Pokemon.bicho;
        if (n == 0)
            resultado13 = "Bicho.i";
        if (n == 0.25)
            resultado13 = "Bicho.mr";
        if (n == 0.5)
            resultado13 = "Bicho.r";
        if (n == 1)
            resultado13 = "Bicho.n";
        if (n == 2)
            resultado13 = "Bicho.me";
        if (n == 4)
            resultado13 = "Bicho.se";
        n = Pokemon.volador;
        if (n == 0)
            resultado14 = "Volador.i";
        if (n == 0.25)
            resultado14 = "Volador.mr";
        if (n == 0.5)
            resultado14 = "Volador.r";
        if (n == 1)
            resultado14 = "Volador.n";
        if (n == 2)
            resultado14 = "Volador.me";
        if (n == 4)
            resultado14 = "Volador.se";
        n = Pokemon.dragon;
           if (n == 0)
            resultado15 = "Dragón.i";
        if (n == 0.25)
            resultado15 = "Dragón.mr";
        if (n == 0.5)
            resultado15 = "Dragón.r";
        if (n == 1)
            resultado15 = "Dragón.n";
        if (n == 2)
            resultado15 = "Dragón.me";
        if (n == 4)
            resultado15 = "Dragón.se";
        n = Pokemon.electrico;
        if (n == 0)
            resultado16 = "Eléctrico.i";
        if (n == 0.25)
            resultado16 = "Eléctrico.mr";
        if (n == 0.5)
            resultado16 = "Eléctrico.r";
        if (n == 1)
            resultado16 = "Eléctrico.n";
        if (n == 2)
            resultado16 = "Eléctrico.me";
        if (n == 4)
            resultado16 = "Eléctrico.se";
        n = Pokemon.psiquico;
        if (n == 0)
            resultado17 = "Psíquico.i";
        if (n == 0.25)
            resultado17 = "Psíquico.mr";
        if (n == 0.5)
            resultado17 = "Psíquico.r";
        if (n == 1)
            resultado17 = "Psíquico.n";
        if (n == 2)
            resultado17 = "Psíquico.me";
        if (n == 4)
            resultado17 = "Psíquico.se";
        
            //Efectividad y resultado//
            if("".equals(nombre2))
            {
                System.out.println("\n//// Tu Pokémon de tipo " + nombre +
                    " tiene las siguientes " + "fortalezas y debilidades: //// \n");
            }
            else
            {
                System.out.println("\n//// Tu Pokémon de tipo " + nombre + "/" + nombre2 + 
                    " tiene las siguientes " + "fortalezas y debilidades: //// \n");
            }
            
            //Inmunidades
            Thread.sleep(1200);
            System.out.println("      Inmunidades (x0)");
            System.out.println("---------------------------");
            int count = 0;
            if("Agua.i".equals(resultado))
            {
                count++;
                System.out.println("Agua");
            }
            if("Acero.i".equals(resultado1))
            {
                count++;
                System.out.println("Acero");
            }
            if("Fuego.i".equals(resultado2))
            {
                count++;
                System.out.println("Fuego");
            }
            if("Roca.i".equals(resultado3))
            {
                count++;
                System.out.println("Roca");
            }
            if("Tierra.i".equals(resultado4))
            {
                count++;
                System.out.println("Tierra");
                
            }
            if("Veneno.i".equals(resultado5))
            {
                count++;
                System.out.println("Veneno");
            }
            if("Hada.i".equals(resultado6))
            {
                count++;
                System.out.println("Hada");
            }
            if("Normal.i".equals(resultado7))
            {
                count++;
                System.out.println("Normal");
            }
            if("Hielo.i".equals(resultado8))
            {
                count++;
                System.out.println("Hielo");
            }
            if("Fantasma.i".equals(resultado9))
            {
                count++;
                System.out.println("Fantasma");
            }
            if("Siniestro.i".equals(resultado10))
            {
                count++;
                System.out.println("Siniestro");
            }
            if("Lucha.i".equals(resultado11))
            {
                count++;
                System.out.println("Lucha");
            }
            if("Planta.i".equals(resultado12))
            {
                count++;
                System.out.println("Planta");
            }
            if("Bicho.i".equals(resultado13))
            {
                count++;
                System.out.println("Bicho");
            }
            if("Volador.i".equals(resultado14))
            {
                count++;
                System.out.println("Volador");
            }
            if("Dragón.i".equals(resultado15))
            {
                count++;
                System.out.println("Dragón");
            }
            if("Eléctrico.i".equals(resultado16))
            {
                count++;
                System.out.println("Eléctrico");
            }
            if("Psíquico.i".equals(resultado17))
            {
                count++;
                System.out.println("Psíquico");
            }
            if (count == 0)
                System.out.println("No tiene inmunidades");
            
            //superresistencias
            Thread.sleep(1200);
            System.out.println("\n\n  Super Resistecias (x0.25)");
            System.out.println("---------------------------");
            count = 0;
            if("Agua.mr".equals(resultado))
            {
                count++;
                System.out.println("Agua");
            }
            if("Acero.mr".equals(resultado1))
            {
                count++;
                System.out.println("Acero");
            }
            if("Fuego.mr".equals(resultado2))
            {
                count++;
                System.out.println("Fuego");
            }
            if("Roca.mr".equals(resultado3))
            {
                count++;
                System.out.println("Roca");
            }
            if("Tierra.mr".equals(resultado4))
            {
                count++;
                System.out.println("Tierra");
                
            }
            if("Veneno.mr".equals(resultado5))
            {
                count++;
                System.out.println("Veneno");
            }
            if("Hada.mr".equals(resultado6))
            {
                count++;
                System.out.println("Hada");
            }
            if("Normal.mr".equals(resultado7))
            {
                count++;
                System.out.println("Normal");
            }
            if("Hielo.mr".equals(resultado8))
            {
                count++;
                System.out.println("Hielo");
            }
            if("Fantasma.mr".equals(resultado9))
            {
                count++;
                System.out.println("Fantasma");
            }
            if("Siniestro.mr".equals(resultado10))
            {
                count++;
                System.out.println("Siniestro");
            }
            if("Lucha.mr".equals(resultado11))
            {
                count++;
                System.out.println("Lucha");
            }
            if("Planta.mr".equals(resultado12))
            {
                count++;
                System.out.println("Planta");
            }
            if("Bicho.mr".equals(resultado13))
            {
                count++;
                System.out.println("Bicho");
            }
            if("Volador.mr".equals(resultado14))
            {
                count++;
                System.out.println("Volador");
            }
            if("Dragón.mr".equals(resultado15))
            {
                count++;
                System.out.println("Dragón");
            }
            if("Eléctrico.mr".equals(resultado16))
            {
                count++;
                System.out.println("Eléctrico");
            }
            if("Psíquico.mr".equals(resultado17))
            {
                count++;
                System.out.println("Psíquico");
            }
            if (count == 0)
                System.out.println("No tiene super resistencias");
        
            //resistencias
            Thread.sleep(1200);
            count = 0;
            System.out.println("\n\n     Resistecias (x0.5)");
            System.out.println("---------------------------");
            if("Agua.r".equals(resultado))
            {
                count++;
                System.out.println("Agua");
            }
            if("Acero.r".equals(resultado1))
            {
                count++;
                System.out.println("Acero");
            }
            if("Fuego.r".equals(resultado2))
            {
                count++;
                System.out.println("Fuego");
            }
            if("Roca.r".equals(resultado3))
            {
                count++;
                System.out.println("Roca");
            }
            if("Tierra.r".equals(resultado4))
            {
                count++;
                System.out.println("Tierra");
                
            }
            if("Veneno.r".equals(resultado5))
            {
                count++;
                System.out.println("Veneno");
            }
            if("Hada.r".equals(resultado6))
            {
                count++;
                System.out.println("Hada");
            }
            if("Normal.r".equals(resultado7))
            {
                count++;
                System.out.println("Normal");
            }
            if("Hielo.r".equals(resultado8))
            {
                count++;
                System.out.println("Hielo");
            }
            if("Fantasma.r".equals(resultado9))
            {
                count++;
                System.out.println("Fantasma");
            }
            if("Siniestro.r".equals(resultado10))
            {
                count++;
                System.out.println("Siniestro");
            }
            if("Lucha.r".equals(resultado11))
            {
                count++;
                System.out.println("Lucha");
            }
            if("Planta.r".equals(resultado12))
            {
                count++;
                System.out.println("Planta");
            }
            if("Bicho.r".equals(resultado13))
            {
                count++;
                System.out.println("Bicho");
            }
            if("Volador.r".equals(resultado14))
            {
                count++;
                System.out.println("Volador");
            }
            if("Dragón.r".equals(resultado15))
            {
                count++;
                System.out.println("Dragón");
            }
            if("Eléctrico.r".equals(resultado16))
            {
                count++;
                System.out.println("Eléctrico");
            }
            if("Psíquico.r".equals(resultado17))
            {
                count++;
                System.out.println("Psíquico");
            }
            if (count == 0)
                System.out.println("No tiene resistencias");
            
            //neutro
            Thread.sleep(1200);
            count = 0;
            System.out.println("\n\n        Neutro (x1)");
            System.out.println("---------------------------");
            if("Agua.n".equals(resultado))
            {
                count++;
                System.out.println("Agua");
            }
            if("Acero.n".equals(resultado1))
            {
                count++;
                System.out.println("Acero");
            }
            if("Fuego.n".equals(resultado2))
            {
                count++;
                System.out.println("Fuego");
            }
            if("Roca.n".equals(resultado3))
            {
                count++;
                System.out.println("Roca");
            }
            if("Tierra.n".equals(resultado4))
            {
                count++;
                System.out.println("Tierra");
                
            }
            if("Veneno.n".equals(resultado5))
            {
                count++;
                System.out.println("Veneno");
            }
            if("Hada.n".equals(resultado6))
            {
                count++;
                System.out.println("Hada");
            }
            if("Normal.n".equals(resultado7))
            {
                count++;
                System.out.println("Normal");
            }
            if("Hielo.n".equals(resultado8))
            {
                count++;
                System.out.println("Hielo");
            }
            if("Fantasma.n".equals(resultado9))
            {
                count++;
                System.out.println("Fantasma");
            }
            if("Siniestro.n".equals(resultado10))
            {
                count++;
                System.out.println("Siniestro");
            }
            if("Lucha.n".equals(resultado11))
            {
                count++;
                System.out.println("Lucha");
            }
            if("Planta.n".equals(resultado12))
            {
                count++;
                System.out.println("Planta");
            }
            if("Bicho.n".equals(resultado13))
            {
                count++;
                System.out.println("Bicho");
            }
            if("Volador.n".equals(resultado14))
            {
                count++;
                System.out.println("Volador");
            }
            if("Dragón.n".equals(resultado15))
            {
                count++;
                System.out.println("Dragón");
            }
            if("Eléctrico.n".equals(resultado16))
            {
                count++;
                System.out.println("Eléctrico");
            }
            if("Psíquico.n".equals(resultado17))
            {
                count++;
                System.out.println("Psíquico");
            }
            if (count == 0)
                System.out.println("Nada es efectivo");
            
            //debilidades
            Thread.sleep(1150);
            count = 0;
            System.out.println("\n\n      Debilidades (x2)");
            System.out.println("---------------------------");
            if("Agua.me".equals(resultado))
            {
                count++;
                System.out.println("Agua");
            }
            if("Acero.me".equals(resultado1))
            {
                count++;
                System.out.println("Acero");
            }
            if("Fuego.me".equals(resultado2))
            {
                count++;
                System.out.println("Fuego");
            }
            if("Roca.me".equals(resultado3))
            {
                count++;
                System.out.println("Roca");
            }
            if("Tierra.me".equals(resultado4))
            {
                count++;
                System.out.println("Tierra");
                
            }
            if("Veneno.me".equals(resultado5))
            {
                count++;
                System.out.println("Veneno");
            }
            if("Hada.me".equals(resultado6))
            {
                count++;
                System.out.println("Hada");
            }
            if("Normal.me".equals(resultado7))
            {
                count++;
                System.out.println("Normal");
            }
            if("Hielo.me".equals(resultado8))
            {
                count++;
                System.out.println("Hielo");
            }
            if("Fantasma.me".equals(resultado9))
            {
                count++;
                System.out.println("Fantasma");
            }
            if("Siniestro.me".equals(resultado10))
            {
                count++;
                System.out.println("Siniestro");
            }
            if("Lucha.me".equals(resultado11))
            {
                count++;
                System.out.println("Lucha");
            }
            if("Planta.me".equals(resultado12))
            {
                count++;
                System.out.println("Planta");
            }
            if("Bicho.me".equals(resultado13))
            {
                count++;
                System.out.println("Bicho");
            }
            if("Volador.me".equals(resultado14))
            {
                count++;
                System.out.println("Volador");
            }
            if("Dragón.me".equals(resultado15))
            {
                count++;
                System.out.println("Dragón");
            }
            if("Eléctrico.me".equals(resultado16))
            {
                count++;
                System.out.println("Eléctrico");
            }
            if("Psíquico.me".equals(resultado17))
            {
                count++;
                System.out.println("Psíquico");
            }
            if (count == 0)
                System.out.println("No tiene debilidades");
            
            //resistencias
            Thread.sleep(1050);
            count = 0;
            System.out.println("\n\n  Super Debilidades (x4)");
            System.out.println("---------------------------");
            if("Agua.se".equals(resultado))
            {
                count++;
                System.out.println("Agua");
            }
            if("Acero.se".equals(resultado1))
            {
                count++;
                System.out.println("Acero");
            }
            if("Fuego.se".equals(resultado2))
            {
                count++;
                System.out.println("Fuego");
            }
            if("Roca.se".equals(resultado3))
            {
                count++;
                System.out.println("Roca");
            }
            if("Tierra.se".equals(resultado4))
            {
                count++;
                System.out.println("Tierra");
                
            }
            if("Veneno.se".equals(resultado5))
            {
                count++;
                System.out.println("Veneno");
            }
            if("Hada.se".equals(resultado6))
            {
                count++;
                System.out.println("Hada");
            }
            if("Normal.se".equals(resultado7))
            {
                count++;
                System.out.println("Normal");
            }
            if("Hielo.se".equals(resultado8))
            {
                count++;
                System.out.println("Hielo");
            }
            if("Fantasma.se".equals(resultado9))
            {
                count++;
                System.out.println("Fantasma");
            }
            if("Siniestro.se".equals(resultado10))
            {
                count++;
                System.out.println("Siniestro");
            }
            if("Lucha.se".equals(resultado11))
            {
                count++;
                System.out.println("Lucha");
            }
            if("Planta.se".equals(resultado12))
            {
                count++;
                System.out.println("Planta");
            }
            if("Bicho.se".equals(resultado13))
            {
                count++;
                System.out.println("Bicho");
            }
            if("Volador.se".equals(resultado14))
            {
                count++;
                System.out.println("Volador");
            }
            if("Dragón.se".equals(resultado15))
            {
                count++;
                System.out.println("Dragón");
            }
            if("Eléctrico.se".equals(resultado16))
            {
                count++;
                System.out.println("Eléctrico");
            }
            if("Psíquico.se".equals(resultado17))
            {
                count++;
                System.out.println("Psíquico");
            }
            if (count == 0)
                System.out.println("No tiene super debilidades");
     }
        public static void Combate() throws InterruptedException
        {
            Scanner reader = new Scanner(System.in);
            String especie[] = { "Charizard", "Blastoise", "Venusaur" };
            String PokemonP;
            String PokemonR;
            int PSp = 0;
            int PSr = 0;
            int numerop = (int) (Math.random() * 2);
            int numeror = (int) (Math.random() * 2);
            
            PokemonP = especie[numerop];
            PokemonR = especie[numeror];
           
            System.out.println("*** Generando Pokémon Aleatorio ***\n");
            Thread.sleep(2100);
            System.out.println("Te ha tocado el siguiente Pokémon: " + PokemonP + "\n");
            Thread.sleep(1250);
            System.out.println("Al rival le ha tocado el siguiente Pokémon: " + PokemonR);
            Thread.sleep(1200);
            System.out.println("\n*** Empezando combate ***\n");
            Thread.sleep(1100);
            
            //stats y ataques
            Stats P = new Stats();
            Stats R = new Stats();
            String ataquesp[] = new String [4];
            String ataquesr[] = new String [4];
            String Type1P = null;
            String Type2P = null;
            String Type1R = null;
            String Type2R = null;
            if("Charizard".equals(PokemonP))
            {
                P.Charizard();
                PSp = P.ps;
                ataquesp[0] = "Llamarada";
                ataquesp[1] = "Tajo Aéreo";
                ataquesp[2] = "Pulso Dragón";
                ataquesp[3] = "Onda Certera";
                Type1P = "Fuego";
                Type2P = "Volador";
            }
            if("Charizard".equals(PokemonR))
            {
                R.Charizard();
                PSr = R.ps;
                ataquesr[0] = "Llamarada";
                ataquesr[1] = "Tajo Aéreo";
                ataquesr[2] = "Pulso Dragón";
                ataquesr[3] = "Onda Certera";
                Type1R = "Fuego";
                Type2R = "Volador";
            }
            if("Blastoise".equals(PokemonP))
            {
                P.Blastoise();
                PSp = P.ps;
                ataquesp[0] = "Escaldar";
                ataquesp[1] = "Esfera Aural";
                ataquesp[2] = "Pulso Umbrío";
                ataquesp[3] = "Rayo Hielo";
                Type1P = "Agua";
            }
            if("Blastoise".equals(PokemonR))
            {
                R.Blastoise();
                PSr = R.ps;
                ataquesr[0] = "Escaldar";
                ataquesr[1] = "Esfera Aural";
                ataquesr[2] = "Pulso Umbrío";
                ataquesr[3] = "Rayo Hielo";
                Type1R = "Agua";
            }
            
            //inicio combate
            boolean muerto = false;
            while(!muerto)
            {
                if (PSp == 0 || PSr == 0 || PSp < 0 || PSr < 0)
                {
                    muerto = true;
                    if (PSp == 0)
                        System.out.println(PokemonP + " ha sido debilitado, terminando el combate...");
                    if (PSr == 0)
                        System.out.println(PokemonR + " ha sido debilitado, terminando el combate...");
                    
                }
                else
                {
                    System.out.println("//////////////////////////////////////////////////////// \n" + "Tú: " + PokemonP + ": " + PSp + " PS          " + "Rival: " + PokemonR + ": " + PSr + " PS \n");
                    System.out.println("\n           1.Luchar               2.Rendirse");
                    System.out.println("\n\n\n//////////////////////////////////////////////////////// \n ");
                    
                    int opcion = 0;
                    int k = 0;
                    boolean avanzar = false;
                    while(!avanzar){
                    try 
                    {
                        if (k > 0)
                            System.out.println("Elige una opción correcta: ");
                        if (k == 0)
                            System.out.println("Elige una opción: ");
                        opcion = reader.nextInt();
                        switch (opcion) 
                        {
                            case 1:
                                avanzar = true;
                                break;
                            case 2:
                                avanzar = true;
                                break;
                            default:
                                k++;
                        }
                    }catch (InputMismatchException e) 
                    {
                        System.out.println("(Debes insertar un número)\n");
                        k++;
                        reader.next();
                    }
                    }
                    if (opcion == 2)
                        muerto = true;
                    
                    //combate
                    Pokémon Principal = new Pokémon();
                    Pokémon Rival = new Pokémon();
                    String ataque_ut = null;
                    String type_ataque = null;
                    String categoria_ataque = null;
                    float n = 0;
                    float STAB_p = 1;
                    float STAB_r = 1;
                    int power = 0;
                    int daño_realizado = 0;
                    if (opcion == 1)
                    {
                        System.out.println("//////////////////////////////////////////////////////// \n" + "Tú: " + PokemonP + ": " + PSp + " PS          " + "Rival: " + PokemonR + ": " + PSr + " PS \n");
                        System.out.println("\n  " + "       1." + ataquesp[0] + "          2." + ataquesp[1] + "\n         3." + ataquesp[2] + "       4." + ataquesp[3] );
                        System.out.println("\n\n\n//////////////////////////////////////////////////////// \n ");
                        int option = 0;
                        int c = 0;
                        boolean proseguir = false;
                        while(!proseguir){
                        try 
                        {
                            if (c > 0)
                                System.out.println("Elige una opción correcta: ");
                            if (c == 0)
                                System.out.println("¿Qué debería hacer " + PokemonP + "?");
                            option = reader.nextInt();
                            switch (option) 
                            {
                                case 1:
                                    proseguir = true;
                                    break;
                                case 2:
                                    proseguir = true;
                                    break;
                                case 3:
                                    proseguir = true;
                                    break;
                                case 4:
                                    proseguir = true;
                                    break;
                                    
                                default:
                                    c++;
                            }
                        }catch (InputMismatchException e) 
                        {
                            System.out.println("(Debes insertar un número)\n");
                            c++;
                            reader.next();
                        }
                        }
                        
                        //tu daño
                        if (option == 1)
                            ataque_ut = ataquesp[0];
                        if (option == 2)
                            ataque_ut = ataquesp[1];
                        if (option == 3)
                            ataque_ut = ataquesp[2];
                        if (option == 4)
                            ataque_ut = ataquesp[3];
                        
                        //tipos de ataque y su poder
                        if ("Escaldar".equals(ataque_ut))
                        {
                            power = 80;
                            categoria_ataque = "Especial";
                            type_ataque = "Agua";
                        }
                        if ("Esfera Aural".equals(ataque_ut))
                        {
                            power = 80;
                            categoria_ataque = "Especial";
                            type_ataque = "Lucha";
                        }
                        if ("Rayo Hielo".equals(ataque_ut))
                        {
                            power = 90;
                            categoria_ataque = "Especial";
                            type_ataque = "Hielo";
                        }
                        if ("Pulso Umbrío".equals(ataque_ut))
                        {
                            power = 80;
                            categoria_ataque = "Especial";
                            type_ataque = "Siniestro";
                        }
                        if ("Llamarada".equals(ataque_ut))
                        {
                            power = 110;
                            categoria_ataque = "Especial";
                            type_ataque = "Fuego";
                        }
                        if ("Pulso Dragón".equals(ataque_ut))
                        {
                            power = 85;
                            categoria_ataque = "Especial";
                            type_ataque = "Dragón";
                        }
                        if ("Tajo Aéreo".equals(ataque_ut))
                        {
                            power = 75;
                            categoria_ataque = "Especial";
                            type_ataque = "Volador";
                        }
                        if ("Onda Certera".equals(ataque_ut))
                        {
                            power = 120;
                            categoria_ataque = "Especial";
                            type_ataque = "Lucha";
                        }
                        
                        //tipo del pokemon rival y el tipo de ataque que le afecta
                        if ("Agua".equals(Type1R) || "Agua".equals(Type2R))
                            Rival.Agua(type_ataque);
                        if ("Fuego".equals(Type1R) || "Fuego".equals(Type2R))
                            Rival.Fuego(type_ataque);
                        if ("Volador".equals(Type1R) || "Volador".equals(Type2R))
                            Rival.Volador(type_ataque);
                        
                        //multiplicador de daño segun el tipo
                        if ("Agua".equals(type_ataque))
                            n = Rival.agua;
                        if ("Acero".equals(type_ataque))
                            n = Rival.acero;
                        if ("Fuego".equals(type_ataque))
                            n = Rival.fuego;
                        if ("Roca".equals(type_ataque))
                            n = Rival.roca;
                        if ("Tierra".equals(type_ataque))
                            n = Rival.tierra;
                        if ("Veneno".equals(type_ataque))
                            n = Rival.veneno;
                        if ("Hada".equals(type_ataque))
                            n = Rival.hada;
                        if ("Normal".equals(type_ataque))
                            n = Rival.normal;
                        if ("Hielo".equals(type_ataque))
                            n = Rival.hielo;
                        if ("Fantasma".equals(type_ataque))
                            n = Rival.fantasma;
                        if ("Siniestro".equals(type_ataque))
                            n = Rival.siniestro;
                        if ("Lucha".equals(type_ataque))
                            n = Rival.lucha;
                        if ("Planta".equals(type_ataque))
                            n = Rival.planta;
                        if ("Bicho".equals(type_ataque))
                            n = Rival.bicho;
                        if ("Volador".equals(type_ataque))
                            n = Rival.volador;
                        if ("Dragón".equals(type_ataque))
                            n = Rival.dragon;
                        if ("Eléctrico".equals(type_ataque))
                            n = Rival.electrico;
                        if ("Psíquico".equals(type_ataque))
                            n = Rival.psiquico;
                        
                        //multiplicador por STAB
                        if (type_ataque == null ? Type1P == null : type_ataque.equals(Type1P))
                            STAB_p = (float) 1.5;
                        
                        //daño realizado
                        int Rnd = (int) (Math.random() * (101 - 86)) + 86;
                        int prob_crit = (int) (Math.random() * (17 - 1)) + 1;
                        int CH = 1;
                        if (prob_crit == 1)
                            CH = 2;
                        if ("Especial".equals(categoria_ataque))
                        {
                            daño_realizado = (int) (((((((((2 * 100) / 7) * P.ataquesp * power) / R.defensaesp) / 50) + 2) * n * STAB_p * Rnd) / 100) * CH);
                        }
                        if ("Fisico".equals(categoria_ataque))
                        {
                            daño_realizado = (int) (((((((((2 * 100) / 7) * P.ataque * power) / R.defensa) / 50) + 2) * n * STAB_p * Rnd) / 100) * CH);
                        }
                        PSr = PSr - daño_realizado;
                        
                        //imprimir el daño realizado y recibido
                        String resultado = null;
                        if (n == 0)
                            resultado = "ineficaz";
                        if (n == 0.25)
                            resultado = "muy poco eficaz";
                        if (n == 0.5)
                            resultado = "poco eficaz";
                        if (n == 1)
                            resultado = "eficaz";
                        if (n == 2)
                            resultado = "muy eficaz";
                        if (n == 4)
                            resultado = "super eficaz";
                        Thread.sleep(700);
                        System.out.println(PokemonP + " usó " + ataque_ut);
                        Thread.sleep(1200);
                        System.out.println("\nEl movimiento " + ataque_ut + " es " + resultado + "(x"
                        + n + ")" + " contra el " + PokemonR + " enemigo");
                        Thread.sleep(1300);
                        System.out.println("El " + PokemonR + " enemigo perdió " + daño_realizado + " PS" + " (-" + daño_realizado + "PS)\n" );
                        if (CH == 2)
                        {
                            Thread.sleep(700);
                            System.out.println("¡Un golpe crítico!\n");
                        }
                        System.out.println("\n");
                        Thread.sleep(1900);
                    }
                }
            }
        }
}
        
