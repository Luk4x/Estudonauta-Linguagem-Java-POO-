package com.mycompany.aula5;
public class Aula05 {
    public static void main(String[] args) {
        // Para criar uma conta, digite em ordem: o número da conta, o tipo da conta (CC ou CP), o nome do dono da conta, e o deposito inicial");
        ContaBanco conta1 = new ContaBanco();
        conta1.abrirConta(1111,"CP","Lucas",100f);
        conta1.statusGeral();
        
        ContaBanco conta2 = new ContaBanco();
        conta2.abrirConta(2222,"CC","Ana",120f);
        conta2.statusGeral();
        
        conta1.depositar(200f);
        conta1.statusGeral();
        
        conta2.depositar(180f);
        conta2.statusGeral();
        
        conta2.sacar(130f);
        conta2.statusGeral();
        
        conta1.sacar(1000f);
        conta1.statusGeral();
        conta1.fecharConta();
        conta1.sacar(450f);
        conta1.fecharConta();
        conta1.statusGeral();
    }
}
