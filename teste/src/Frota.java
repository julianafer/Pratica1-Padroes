import java.util.ArrayList;

public interface Frota {

    ArrayList<Veiculo> top10MaiorAutonomia();
    ArrayList<Veiculo> top10MenorAutonomia();
    ArrayList<Veiculo> listarVeiculos();
    void abastecerFrota(TipoMotorizacao tipo, double quantidade);
    ArrayList<Veiculo> listarVeiculosInferioresA(double porcentagem);

}
