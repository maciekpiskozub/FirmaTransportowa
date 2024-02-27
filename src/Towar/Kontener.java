package Towar;

import java.util.ArrayList;

public class Kontener {

    private  ArrayList<Towar> listaTowarow;

    public Kontener(ArrayList<Towar> listaTowarow) {
        this.listaTowarow = listaTowarow;

    }

    public void zaladowanie(Towar towar) {
        listaTowarow.add(towar);
    }

    public void rozladowanie(Towar towar) {

    }


}
