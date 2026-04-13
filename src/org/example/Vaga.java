package org.example;

public class Vaga {
    private int numero;
    private boolean ocupada;
    private Veiculo veiculoEstacionado;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Vaga(int numero){
        this.numero = numero;
        this.ocupada = false;
        this.veiculoEstacionado = null;
    }

    public void estacionar(Veiculo veiculo){
        ocupada = true;
        this.veiculoEstacionado = veiculo;
    }
    public void liberar(){
        ocupada = false;
        this.veiculoEstacionado = null;
    }
}
