package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class JoyeroElfico implements EstrategiaDeMejora{
    @Override
    public void mejorar(Artefacto artefacto){
        if(artefacto.getTipo().equals("Amuleto")) {
            int poder = artefacto.getPoder();
            if (artefacto.getPoder() < 50) {
                poder *= 2;
                artefacto.setPoder(poder);
            }
            poder *= (int) 1.25;
            artefacto.setPoder(poder);
        }
    }

}
