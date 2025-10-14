package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class AlquimistaExperto implements EstrategiaDeMejora {

    @Override
    public void mejorar(Artefacto artefacto){
        if(artefacto.getTipo().equals("Pocion")) {
            int poder = artefacto.getPoder();
            poder += 20;
            artefacto.setPoder(poder);

            if (artefacto.getPoder() > 100) {
                poder = 100;
                artefacto.setPoder(poder);
            }

        }
    }
}
