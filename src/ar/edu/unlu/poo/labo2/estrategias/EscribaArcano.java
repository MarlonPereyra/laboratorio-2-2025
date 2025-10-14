package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class EscribaArcano implements EstrategiaDeMejora{
@Override
public void mejorar(Artefacto artefacto){
    if(artefacto.getTipo().equals("Pergamino")) {
        int poder = artefacto.getPoder();
        if (artefacto.getPoder() < 30) {
            poder += 25;
            artefacto.setPoder(poder);
        }
        poder -= 10;
        artefacto.setPoder(poder);
    }
}
}
