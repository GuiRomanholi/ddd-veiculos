package models;

public class Segurado extends Veiculo implements ISeguroServico {
    private double seguro;

    //metodos
    public Segurado(double seguro){
    }


    @Override
    public double doTotal(){
        return super.doTotal() - doDesconto();
    }

    public String doViewCupom(){
        return "Aqui está o cupom" +
                "\n------------------" +
                "\nHoras estacionado: " + this.getHoras() +
                "\nValor total com desconto: " + this.doTotal();
    }


    //getters e setters
    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
    //metodo
    @Override
    public double doDesconto() {
        return super.doTotal()* seguro/100;}
}
