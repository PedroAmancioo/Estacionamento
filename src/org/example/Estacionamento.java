package org.example;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;
    private Tarifario tarifario;

    public void exibirVagasLivres() {
        System.out.println("Vagas livres:");

        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {
                System.out.println("Vaga " + vaga.getNumero() + " VAZIA");
            }else{
                System.out.println("Vaga " + vaga.getNumero() + " - " + vaga.getVeiculoEstacionado().getPlaca());
            }
        }
    }

    public boolean estacionarVeiculo(Veiculo veiculo) {
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {
                vaga.estacionar(veiculo);
                System.out.println("Veículo estacionado na vaga " + vaga.getNumero());
                return true;
            }
        }

        System.out.println("Não há vagas disponíveis!");
        return false;
    }

    public Estacionamento (int totalDeVagas){
        this.vagas = new ArrayList<>();

        for(int i= 1; i <= totalDeVagas; i++){
            Vaga novaVaga = new Vaga(i);
            this.vagas.add(novaVaga);
        }
    }
}
