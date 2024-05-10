package test;

import models.BalacoDiario;
import models.Segurado;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Segurado veicSeg = new Segurado(10);

        veicSeg.setValorHora(5);
        veicSeg.setValorAdicional(2);
        veicSeg.setHoras(0);
        veicSeg.doViewCupom();

        BalacoDiario bd = new BalacoDiario();
        //adicionando o objeto na lista
        bd.doAdd(veicSeg);
        System.out.printf(bd.doGerarRelatorio());
    }
}
