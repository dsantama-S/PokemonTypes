/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

/**
 *
 * @author david
 */
public class Pokémon {
    public float agua = 1;
    public float tierra = 1;
    public float roca = 1;
    public float electrico = 1;
    public float fuego = 1;
    public float planta = 1;
    public float veneno = 1;
    public float hada = 1;
    public float acero = 1;
    public float lucha = 1;
    public float fantasma = 1;
    public float siniestro = 1;
    public float bicho = 1;
    public float normal = 1;
    public float hielo = 1;
    public float dragon = 1;
    public float volador = 1;
    public float psiquico = 1;
    
    public void Agua(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Agua":
            case "agua":
                agua /= 2;
                break;
            case "Acero":
            case "acero":
                acero /= 2;
                break;
            case "Electrico":
            case "electrico":
            case "Eléctrico":
            case "eléctrico":
                electrico *= 2;
                break;
            case "Fuego":
            case "fuego":
                fuego /= 2;
                break;
            case "Hielo":
            case "hielo":
                hielo /= 2;
                break;
            case "Planta":
            case "planta":
                planta *= 2;
                break;
            default:
                break;
        }
    }
    public void Fuego(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Agua":
            case "agua":
                agua *= 2;
                break;
            case "Acero":
            case "acero":
                acero /= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho /= 2;
                break;
            case "Hada":
            case "hada":
                hada /= 2;
                break;
            case "Hielo":
            case "hielo":
                hielo /= 2;
                break;
            case "Fuego":
            case "fuego":
                fuego /= 2;
                break;
            case "Planta":
            case "planta":
                planta /= 2;
                break;
            case "Roca":
            case "roca":
                roca *= 2;
                break;
            case "Tierra":
            case "tierra":
                tierra *= 2;
                break;
            default:
                break;
        }
    }
    
    public void Fantasma(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Veneno":
            case "veneno":
                veneno /= 2;
                break;
            case "Fantasma":
            case "fantasma":
                fantasma *= 2;
                break;
            case "Siniestro":
            case "siniestro":
                siniestro *= 2;
                break;
            case "Lucha":
            case "lucha":
                lucha *= 0;
                break;
            case "Normal":
            case "normal":
                normal *= 0;
                break;
            default:
                break;
        }
    }
    public void Veneno(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Lucha":
            case "lucha":
                lucha /= 2;
                break;
            case "Psiquico":
            case "psiquico":
            case "Psíquico":
            case "psíquico":
                psiquico *= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho /= 2;
                break;
            case "Hada":
            case "hada":
                hada /= 2;
                break;
            case "Tierra":
            case "tierra":
                tierra *= 2;
                break;
            case "Planta":
            case "planta":
                planta /= 2;
                break;
            case "Veneno":
            case "veneno":
                veneno /= 2;
                break;
            default:
                break;
        }
    }
    public void Normal(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Fantasma":
            case "fantasma":
                fantasma *= 0;
                break;
            case "Lucha":
            case "lucha":
                lucha *= 2;
                break;
            default:
                break;
        }
    }
    public void Hielo(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Fuego":
            case "fuego":
                fuego *= 2;
                break;
            case "Acero":
            case "acero":
                acero *= 2;
                break;
            case "Lucha":
            case "lucha":
                lucha *= 2;
                break;
            case "Hielo":
            case "hielo":
                hielo /= 2;
                break;
            case "Roca":
            case "roca":
                roca *= 2;
                break;
            default:
                break;
        }
    }
    public void Tierra(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Agua":
            case "agua":
                agua *= 2;
                break;
            case "Electrico":
            case "electrico":
            case "Eléctrico":
            case "eléctrico":
                electrico *= 0;
                break;
            case "Hielo":
            case "hielo":
                hielo *= 2;
                break;
            case "Planta":
            case "planta":
                planta *= 2;
                break;
            case "Roca":
            case "roca":
                roca /= 2;
                break;
            case "Veneno":
            case "veneno":
                veneno /= 2;
                break;
            default:
                break;
        }
    }
    public void Roca(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Agua":
            case "agua":
                agua *= 2;
                break;
            case "Acero":
            case "acero":
                acero *= 2;
                break;
            case "Fuego":
            case "fuego":
                fuego /= 2;
                break;
            case "Lucha":
            case "lucha":
                lucha *= 2;
                break;
            case "Normal":
            case "normal":
                normal /= 2;
                break;
            case "Planta":
            case "planta":
                planta *= 2;
                break;
            case "Tierra":
            case "tierra":
                tierra *= 2;
                break;
            case "Veneno":
            case "veneno":
                veneno /= 2;
                break;
            case "Volador":
            case "volador":
                volador /= 2;
                break;
            default:
                break;
        }
    }
    public void Lucha(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Psiquico":
            case "psiquico":
            case "Psíquico":
            case "psíquico":
                psiquico *= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho /= 2;
                break;
            case "Hada":
            case "hada":
                hada *= 2;
                break;
            case "Siniestro":
            case "siniestro":
                siniestro /= 2;
                break;
            case "Volador":
            case "volador":
                volador *= 2;
                break;
            case "Roca":
            case "roca":
                roca /= 2;
                break;
            default:
                break;
        }
    }
    public void Siniestro(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Psiquico":
            case "psiquico":
            case "Psíquico":
            case "psíquico":
                psiquico *= 0;
                break;
            case "Lucha":
            case "lucha":
                lucha *= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho *= 2;
                break;
            case "Hada":
            case "hada":
                hada *= 2;
                break;
            case "Fantasma":
            case "fantasma":
                fantasma /= 2;
                break;
            case "Siniestro":
            case "siniestro":
                siniestro /= 2;
                break;
            default:
                break;
        }
    }
    public void Acero(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Psiquico":
            case "psiquico":
            case "Psíquico":
            case "psíquico":
                psiquico /= 2;
                break;
            case "Dragon":
            case "dragon":
            case "Dragón":
            case "dragón":
                dragon /= 2;
                break;
            case "Acero":
            case "acero":
                acero /= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho /= 2;
                break;
            case "Normal":
            case "normal":
                normal /= 2;
                break;
            case "Hada":
            case "hada":
                hada /= 2;
                break;
            case "Hielo":
            case "hielo":
                hielo /= 2;
                break;
            case "Planta":
            case "planta":
                planta /= 2;
                break;
            case "Roca":
            case "roca":
                roca /= 2;
                break;
            case "Volador":
            case "volador":
                volador /= 2;
                break;
            case "Veneno":
            case "veneno":
                veneno *= 0;
                break;
            case "Tierra":
            case "tierra":
                tierra *= 2;
                break;
            case "Lucha":
            case "lucha":
                tierra *= 2;
                break;
            case "Fuego":
            case "fuego":
                fuego *= 2;
                break;
            default:
                break;
        }
    }
    public void Hada(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Dragon":
            case "dragon":
            case "Dragón":
            case "dragón":
                dragon *= 0;
                break;
            case "Lucha":
            case "lucha":
                lucha /= 2;
                break;
            case "Acero":
            case "acero":
                acero *= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho /= 2;
                break;
            case "Siniestro":
            case "siniestro":
                siniestro /= 2;
                break;
            case "Veneno":
            case "veneno":
                veneno *= 2;
                break;
            default:
                break;
        }
    }
    public void Planta(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Agua":
            case "agua":
                agua /= 2;
                break;
            case "Electrico":
            case "electrico":
            case "Eléctrico":
            case "eléctrico":
                electrico /= 2;
                break;
            case "Fuego":
            case "fuego":
                fuego *= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho *= 2;
                break;
            case "Veneno":
            case "veneno":
                veneno *= 2;
                break;
            case "Hielo":
            case "hielo":
                hielo *= 2;
                break;
            case "Planta":
            case "planta":
                planta /= 2;
                break;
            case "Volador":
            case "volador":
                volador *= 2;
                break;
            case "Tierra":
            case "tierra":
                tierra /= 2;
                break;
            default:
                break;
        }
    }
    public void Bicho(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Fuego":
            case "fuego":
                fuego *= 2;
                break;
            case "Lucha":
            case "lucha":
                lucha /= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho /= 2;
                break;
            case "Planta":
            case "planta":
                planta /= 2;
                break;
            case "Roca":
            case "roca":
                roca *= 2;
                break;
            case "Tierra":
            case "tierra":
                tierra /= 2;
                break;
            case "Volador":
            case "volador":
                volador *= 2;
                break;
            default:
                break;
        }
    }
    public void Volador(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Lucha":
            case "lucha":
                lucha /= 2;
                break;
            case "Electrico":
            case "electrico":
            case "Eléctrico":
            case "eléctrico":
                electrico *= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho /= 2;
                break;
            case "Hielo":
            case "hielo":
                hielo *= 2;
                break;
            case "Planta":
            case "planta":
                planta /= 2;
                break;
            case "Roca":
            case "roca":
                roca *= 2;
                break;
            case "Tierra":
            case "tierra":
                tierra *= 0;
            default:
                break;
        }
    }
    public void Dragón(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Agua":
            case "agua":
                agua /= 2;
                break;
            case "Dragon":
            case "dragon":
            case "Dragón":
            case "dragón":
                dragon *= 2;
                break;
            case "Electrico":
            case "electrico":
            case "Eléctrico":
            case "eléctrico":
                electrico /= 2;
                break;
            case "Fuego":
            case "fuego":
                fuego /= 2;
                break;
            case "Hada":
            case "hada":
                hada *= 2;
                break;
            case "Hielo":
            case "hielo":
                hielo *= 2;
                break;
            case "Planta":
            case "planta":
                planta /= 2;
                break;
            default:
                break;
        }
    }
    public void Eléctrico(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Electrico":
            case "electrico":
            case "Eléctrico":
            case "eléctrico":
                electrico /= 2;
                break;
            case "Acero":
            case "acero":
                acero /= 2;
                break;
            case "Volador":
            case "volador":
                volador /= 2;
                break;
            case "Tierra":
            case "tierra":
                tierra *= 2;
                break;
            default:
                break;
        }
    }
    public void Psíquico(String ataque)
    {
        if (null != ataque)
            switch (ataque) {
            case "Fantasma":
            case "fantasma":
                fantasma *= 2;
                break;
            case "Bicho":
            case "bicho":
                bicho *= 2;
                break;
            case "Lucha":
            case "lucha":
                lucha /= 2;
                break;
            case "Siniestro":
            case "siniestro":
                siniestro *= 2;
                break;
            case "Psiquico":
            case "psiquico":
            case "Psíquico":
            case "psíquico":
                psiquico /= 2;
                break;
            default:
                break;
        }
    }
}
