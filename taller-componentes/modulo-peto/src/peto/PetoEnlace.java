package peto;

import core.GemaEnergia;

public class PetoEnlace implements GemaEnergia {

    private GemaEnergia apoyo;

    public PetoEnlace(GemaEnergia apoyo) {
        this.apoyo = apoyo;
    }

    public void retirarApoyo() {
        this.apoyo = null;
    }

    public boolean tieneCarga() {
        return true;
    }

    public boolean escudoActivo() {
        boolean cargaPropia = tieneCarga();
        boolean cargaApoyo = false;
        if (apoyo != null) {
            cargaApoyo = apoyo.tieneCarga();
        }
        return cargaPropia || cargaApoyo;
    }
}