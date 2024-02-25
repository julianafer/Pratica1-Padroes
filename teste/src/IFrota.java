import java.util.ArrayList;

public interface IFrota {

    ArrayList<Veiculo> top10MaiorAutonomia();
    ArrayList<Veiculo> top10MenorAutonomia();
    ArrayList<Veiculo> listarVeiculosCombustivel(TipoCombustivel tipo_combustivel);
    ArrayList<Veiculo> listarVeiculosEletricos();
    void abastecerFrota(TipoCombustivel tipo, double quantidade);
    ArrayList<Veiculo> listarVeiculosInferioresA(double porcentagem);

}
