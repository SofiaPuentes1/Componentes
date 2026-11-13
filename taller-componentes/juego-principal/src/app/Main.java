package app;

import armas.EspadaExplorador;
import botas.BotasEnlace;
import casco.CascoHierroSellado;
import casco.CascoRunico;
import casco.ProteccionElemental;
import peto.PetoEnlace;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== PRUEBA FINAL: COMPONENT QUEST ===");

        System.out.println("--- Ronda 1: Dragon Ignis ---");
        EspadaExplorador espada = new EspadaExplorador();
        System.out.println("Ataque con espada: " + espada.atacar() + " pts");

        System.out.println("--- Ronda 2: Golem Sismico ---");
        BotasEnlace botas = new BotasEnlace();
        PetoEnlace peto = new PetoEnlace(botas);
        System.out.println("Escudo con botas: " + peto.escudoActivo());
        peto.retirarApoyo();
        System.out.println("Botas retiradas en combate");
        System.out.println("Escudo sin botas: " + peto.escudoActivo());

        System.out.println("--- Ronda 4: Espectro Cambiante (FUEGO) ---");
        ProteccionElemental cascoHierro = new CascoHierroSellado();
        ProteccionElemental cascoRunico = new CascoRunico();
        System.out.println("Casco de hierro: " + cascoHierro.resistirAtaque("FUEGO"));
        System.out.println("Casco runico: " + cascoRunico.resistirAtaque("FUEGO"));
    }
}