public class Main {
    public static void main(String[] args) {

        Frota frota = new Frota();

        try {

            frota.addVeiculo(new Veiculo("Renault", "Kwid", 185, 38, 15, TipoMotorizacao.combustivel, TipoCombustivel.gasolina));
            frota.addVeiculo(new Veiculo("Honda", "Civic", 400, 45, 20, TipoMotorizacao.combustivel, TipoCombustivel.flex));
            frota.addVeiculo(new Veiculo("Nissan", "Kicks", 100, 41, 40, TipoMotorizacao.eletrico));
            frota.addVeiculo(new Veiculo("Nissan", "Versa", 200, 42, 5, TipoMotorizacao.combustivel, TipoCombustivel.diesel));
            frota.addVeiculo(new Veiculo("Renault", "Captur", 200, 40, 18, TipoMotorizacao.combustivel, TipoCombustivel.flex));
            frota.addVeiculo(new Veiculo("Honda", "HR-V", 600, 50, 25, TipoMotorizacao.eletrico));
            frota.addVeiculo(new Veiculo("Nissan", "March", 180, 35, 15, TipoMotorizacao.combustivel, TipoCombustivel.gasolina));
            frota.addVeiculo(new Veiculo("Honda", "Fit", 550, 38, 17, TipoMotorizacao.combustivel, TipoCombustivel.gasolina));
            frota.addVeiculo(new Veiculo("Renault", "Duster", 220, 42, 19, TipoMotorizacao.combustivel, TipoCombustivel.diesel));
            frota.addVeiculo(new Veiculo("Nissan", "Sentra", 190, 36, 16, TipoMotorizacao.combustivel, TipoCombustivel.flex));
            frota.addVeiculo(new Veiculo("Renault", "Captur", 210, 39, 17, TipoMotorizacao.eletrico));
            frota.addVeiculo(new Veiculo("Honda", "City", 570, 42, 22, TipoMotorizacao.eletrico));
            frota.addVeiculo(new Veiculo("Nissan", "Kicks", 240, 38, 18, TipoMotorizacao.combustivel, TipoCombustivel.diesel));
            frota.addVeiculo(new Veiculo("Renault", "Kwid", 230, 40, 20, TipoMotorizacao.eletrico));
            frota.addVeiculo(new Veiculo("Honda", "Civic", 500, 48, 25, TipoMotorizacao.combustivel, TipoCombustivel.gasolina));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n1. Listar os 10 veículos com maior autonomia de rodagem.\n");

        for (Veiculo veiculo : frota.top10MaiorAutonomia()) {
            System.out.println(veiculo);
        }

        System.out.println("\n2. Listar os 10 veículos com menor autonomia de rodagem.\n");

        for (Veiculo veiculo : frota.top10MenorAutonomia()) {
            System.out.println(veiculo);
        }

        System.out.println("\n3. Listar os veículos movidos a gasolina, diesel, flex ou elétricos.\n");

        for (Veiculo veiculo : frota.listarVeiculosCombustivel(TipoCombustivel.gasolina)) {
            System.out.println("Gasolina: " + veiculo);
        }

        for (Veiculo veiculo : frota.listarVeiculosCombustivel(TipoCombustivel.diesel)) {
            System.out.println("Diesel: " + veiculo);
        }

        for (Veiculo veiculo : frota.listarVeiculosCombustivel(TipoCombustivel.flex)) {
            System.out.println("Flex: " + veiculo);
        }

        for (Veiculo veiculo : frota.listarVeiculosEletricos()) {
            System.out.println("Elétrico: " + veiculo);
        }

        System.out.println("\n4. Abastecer a frota de acordo com um tipo de combustível e quantidade de combustível informadas.\n");

        frota.abastecerFrota(TipoCombustivel.diesel, 50);

        for (Veiculo veiculo : frota.listarVeiculosCombustivel(TipoCombustivel.diesel)) {
            System.out.println(veiculo);
        }

        System.out.println("\n5. Listar os veículos com autonomia inferior a uma porcentagem informada.\n");

        for (Veiculo veiculo : frota.listarVeiculosInferioresA(200)) {
            System.out.println(veiculo);
        }

        System.out.println("\n1. Validar que o modelo informado pertence a marca selecionada.\n");

        try {
            frota.addVeiculo(new Veiculo("Honda", "Kicks", 185, 38, 15, TipoMotorizacao.combustivel, TipoCombustivel.gasolina));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}