package models;

public class Veiculo {
    private double valorHora;
    private double valorAdicional;
    private double horas;

    //Metodos
    /**
     * O metodo de retornar o valor
     * Foi criado a variavel valor
     */
    double valor;
    public double doTotal(){
        valor = valorHora + valorAdicional * (horas - 1);
        System.out.println("O valor total a pagar é: " + valor);
        return valor;
    }

    public String doViewCupom(){
        return "Aqui está o cupom" +
                "\n------------------" +
                "\nHoras estacionado: " + this.horas +
                "\nValor total: " + this.doTotal();
    }

    //Getters e setters
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}
