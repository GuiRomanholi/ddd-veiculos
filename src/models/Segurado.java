package models;

public class Segurado extends Veiculo implements ISeguroServico {
    private double seguro;

    //metodos
    public Segurado(double seguro){

    }

    public double doTotal(){
        return super.doTotal() - doDesconto();
    }

    public String doViewCupom(){
        System.out.println("Esse é o seu desconto no total: " + doTotal());
        System.out.println("Esse é o seu seguro: " + seguro);
        return "Aqui está o cupom";
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
        return super.doTotal()* seguro/100;
    }
}
