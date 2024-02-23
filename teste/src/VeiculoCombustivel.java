public class VeiculoCombustivel extends Veiculo {

    TipoMotorizacao tipo_de_motorizacao;

    public VeiculoCombustivel(String marca, String modelo, double autonomia, double capacidade, double combustivel_disponivel, TipoMotorizacao tipo_de_motorizacao) {
        super(marca, modelo, autonomia, capacidade, combustivel_disponivel);
        this.tipo_de_motorizacao = tipo_de_motorizacao;
    }

    @Override
    public String toString() {
        return "VeiculoCombustivel{" + super.toString() +
                "tipo_de_motorizacao=" + tipo_de_motorizacao +
                '}';
    }
}
