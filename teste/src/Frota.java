import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Frota implements IFrota{

    private ArrayList<Veiculo> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<>();
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public ArrayList<Veiculo> listarVeiculos() {
        return getVeiculos();
    }

    @Override
    public ArrayList<Veiculo> top10MaiorAutonomia() {
        ArrayList<Veiculo> veiculosCopia = new ArrayList<>(veiculos);
        Collections.sort(veiculosCopia, Comparator.comparing(Veiculo::getAutonomia).reversed());
        return new ArrayList<>(veiculosCopia.subList(0, Math.min(10, veiculosCopia.size())));
    }

    @Override
    public ArrayList<Veiculo> top10MenorAutonomia() {
        ArrayList<Veiculo> veiculosCopia = new ArrayList<>(veiculos);
        Collections.sort(veiculosCopia, Comparator.comparing(Veiculo::getAutonomia));
        return new ArrayList<>(veiculosCopia.subList(0, Math.min(10, veiculosCopia.size())));
    }

    @Override
    public ArrayList<Veiculo> listarVeiculosCombustivel(TipoCombustivel tipo_combustivel) {
        ArrayList<Veiculo> veiculosCombustivel = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getTipo_motorizacao().equals(TipoMotorizacao.combustivel)) {
                if (veiculo.getTipo_combustivel().equals(tipo_combustivel)) {
                    veiculosCombustivel.add(veiculo);
                }
            }
        }
        return veiculosCombustivel;
    }

    @Override
    public ArrayList<Veiculo> listarVeiculosEletricos() {
        ArrayList<Veiculo> veiculosEletricos = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getTipo_motorizacao().equals(TipoMotorizacao.eletrico)) {
                veiculosEletricos.add(veiculo);
            }
        }
        return veiculosEletricos;
    }

    @Override
    public void abastecerFrota(TipoCombustivel tipo, double quantidade) {
        for (Veiculo veiculo : this.listarVeiculosCombustivel(tipo)) {
            veiculo.abastecer(quantidade);
        }
    }

    @Override
    public ArrayList<Veiculo> listarVeiculosInferioresA(double porcentagem) {
        ArrayList<Veiculo> veiculosInferiores = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getAutonomia() < porcentagem) {
                veiculosInferiores.add(veiculo);
            }
        }
        return veiculosInferiores;
    }

}
