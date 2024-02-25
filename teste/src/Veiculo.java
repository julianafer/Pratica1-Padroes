import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Veiculo {

    private String marca;
    private String modelo;
    private double autonomia;
    private double capacidade;
    private double combustivel_disponivel;
    private TipoMotorizacao tipo_motorizacao;
    private TipoCombustivel tipo_combustivel; // Apenas para veículos de combustível

    // Mapa para armazenar os modelos pertencentes a cada marca
    private static final Map<String, Set<String>> modelosPorMarca = new HashMap<>();

    static {
        Set<String> renaultModelos = new HashSet<>();
        renaultModelos.add("Kwid");
        renaultModelos.add("Sandero");
        renaultModelos.add("Captur");
        renaultModelos.add("Duster");
        modelosPorMarca.put("Renault", renaultModelos);

        Set<String> nissanModelos = new HashSet<>();
        nissanModelos.add("March");
        nissanModelos.add("Versa");
        nissanModelos.add("Kicks");
        nissanModelos.add("Sentra");
        modelosPorMarca.put("Nissan", nissanModelos);

        Set<String> hondaModelos = new HashSet<>();
        hondaModelos.add("Civic");
        hondaModelos.add("HR-V");
        hondaModelos.add("Fit");
        hondaModelos.add("City");
        modelosPorMarca.put("Honda", hondaModelos);
    }

    public Veiculo(String marca, String modelo, double autonomia, double capacidade, double combustivelDisponivel, TipoMotorizacao tipo_motorizacao) throws Exception {
        if (tipo_motorizacao.equals(TipoMotorizacao.eletrico)) {
            this.marca = marca;
            this.setModelo(marca, modelo);
            this.autonomia = autonomia;
            this.capacidade = capacidade;
            this.combustivel_disponivel = combustivelDisponivel;
            this.tipo_motorizacao = tipo_motorizacao;
        } else {
            throw new Exception("Especifique o tipo de combustível");
        }
    }

    public Veiculo(String marca, String modelo, double autonomia, double capacidade, double combustivelDisponivel, TipoMotorizacao tipo_motorizacao, TipoCombustivel tipo_combustivel) throws Exception {
        if (tipo_motorizacao.equals(TipoMotorizacao.combustivel)) {
            this.marca = marca;
            this.setModelo(marca, modelo);
            this.autonomia = autonomia;
            this.capacidade = capacidade;
            this.combustivel_disponivel = combustivelDisponivel;
            this.tipo_motorizacao = tipo_motorizacao;
            this.tipo_combustivel = tipo_combustivel;
        } else {
            throw new Exception("Você só pode utilizar esse construtor em carros movidos a combustível");
        }
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

    public void setModelo(String marca, String modelo) throws Exception {
        if (modeloPertenceAMarcaCorreta(marca, modelo)) {
            this.modelo = modelo;
        } else {
            throw new Exception("O modelo " + modelo + " não pertence a marca " + marca);
        }
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

    public TipoMotorizacao getTipo_motorizacao() {
        return tipo_motorizacao;
    }

    public void setTipo_motorizacao(TipoMotorizacao tipo_motorizacao) {
        this.tipo_motorizacao = tipo_motorizacao;
    }

    public TipoCombustivel getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(TipoCombustivel tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    public void abastecer(double combustivel) {
        if (combustivel_disponivel + combustivel > capacidade) {
            setCombustivel_disponivel(capacidade);
        } else {
            setCombustivel_disponivel(combustivel_disponivel + combustivel);
        }
    }

    public boolean modeloPertenceAMarcaCorreta(String marca, String modelo) {
        Set<String> modelos = modelosPorMarca.get(marca);
        if (modelos != null && modelos.contains(modelo)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", autonomia=" + autonomia +
                ", capacidade=" + capacidade +
                ", combustivel_disponivel=" + combustivel_disponivel +
                ", tipo_motorizacao=" + tipo_motorizacao +
                ", tipo_combustivel=" + tipo_combustivel +
                '}';
    }
}
