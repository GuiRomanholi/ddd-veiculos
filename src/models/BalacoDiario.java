package models;

public class BalacoDiario {

    private static int qtdeCarros;
    private static double total;

    /**
     * Icrementa a quantidade de carros e incrementa o total
     * do metódo doTotal() e objeto obj
     * @return
     */

    public void doAdd(Veiculo obj){
        BalacoDiario.qtdeCarros += 1;
        total += obj.doTotal();
    }

    public String doGerarRelatorio(){
        return "Relatório diário" +
                "\n------------------" +
                "\nQuantidade de veiculos: " + qtdeCarros +
                "\nValor total: R$ " + total;
    }
}
