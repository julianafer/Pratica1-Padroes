import java.util.ArrayList;

public class Veiculo implements Frota {

    private String marca, modelo;
    private double autonomia, capacidade, combustivel_disponivel;

    public Veiculo(
            String marca,
            String modelo,
            double autonomia,
            double capacidade,
            double combustivel_disponivel
    ) {
        this.marca = marca;
        this.modelo = modelo;
        this.autonomia = autonomia;
        this.capacidade = capacidade;
        this.combustivel_disponivel = combustivel_disponivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getCombustivel_disponivel() {
        return combustivel_disponivel;
    }

    public void setCombustivel_disponivel(double combustivel_disponivel) {
        this.combustivel_disponivel = combustivel_disponivel;
    }

    @Override
    public ArrayList<Veiculo> top10MaiorAutonomia() {
        return null;
    }

    @Override
    public ArrayList<Veiculo> top10MenorAutonomia() {
        return null;
    }

    @Override
    public ArrayList<Veiculo> listarVeiculos() {
        return null;
    }

    @Override
    public void abastecerFrota(TipoMotorizacao tipo, double quantidade) {

    }

    @Override
    public ArrayList<Veiculo> listarVeiculosInferioresA(double porcentagem) {
        return null;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", autonomia=" + autonomia +
                ", capacidade=" + capacidade +
                ", combustivel_disponivel=" + combustivel_disponivel +
                '}';
    }

}
