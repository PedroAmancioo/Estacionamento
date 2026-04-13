package org.example;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;
    private Tarifario tarifario;

    public Estacionamento (int totalDeVagas){
        this.vagas = new ArrayList<>();

        for(int i= 1; i <= totalDeVagas; i++){
            Vaga novaVaga = new Vaga(i);
            this.vagas.add(novaVaga);
        }
    }
}
