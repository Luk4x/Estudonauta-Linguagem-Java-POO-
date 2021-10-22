package com.mycompany.aula5;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    void ContaBanco(int num, String tipo, String nome, float depositoInicial) {
        this.abrirConta(num, tipo, nome, depositoInicial);
}
    public void statusGeral() {
        System.out.println("AVISO: mostrando informações da conta.\nNúmero: " + this.numConta);
        System.out.println("Tipo: " + this.tipo + "\nDono: " + this.dono +  "\nSaldo: " + this.saldo + "\nStatus: " + this.status + "\n");
    }
    
    public void abrirConta(int num, String tipo, String nome, float saldoInicial) {
        this.numConta = num;
        this.tipo = tipo;
        if ("CC".equals(tipo)) {
            this.saldo += 50f;
        } else if ("CP".equals(tipo)) {
            this.saldo += 150f;
        }
        this.dono = nome;
        this.saldo += saldoInicial;
        this.status = true;
    }
    
    public void fecharConta() {
        if (this.status==true) {
            if (this.saldo!=0) {
                System.out.print("AVISO: Você não pode fechar sua conta, pois ela possui saldo ");
                if (this.saldo<0) {
                    System.out.println("negativo. Você precisa quitar suas dívidas antes.\n");
                } else {
                    System.out.println("positivo. Você deve sacar todo o seu dinheiro antes.\n");
                }
            } else {
                this.status = false;
                System.out.println("AVISO: Conta fechada com sucesso.\n");
            }
        } else {
            erro();
        }
    }
    
    public void depositar(float valor) {
        if (this.status==true) {
            this.saldo += valor;
            System.out.println("Depósito feito com sucesso.\n");
        } else {
            erro();
        }
    }
    
    public void sacar(float valor) {
        if (this.status==true) {
            System.out.print("AVISO: ");
            if (valor>this.saldo) {
                System.out.println("Vocẽ não pode realizar um saque maior do que a quantia de valor existente na conta.\n");
            } else {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso.\n");
            }
        } else {
            erro();
        }
    }
    
    public void pagarMensal() {
        if (this.status==true) {
            System.out.print("AVISO: R$");
            if ("CC".equals(this.tipo)) {
                System.out.print("12");
                this.saldo -= 12;
            } else if ("CP".equals(this.tipo)) {
                System.out.print("20");
                this.saldo -= 20;
            }
            System.out.println(" da mensalidade foram descontados com sucesso.\n");
        } else {
            erro();
        }
    }
    
    public int getNumconta() {
        return this.numConta;
    }
    
    public void setNumConta(int newNum) {
        this.numConta = newNum;
        System.out.println("AVISO: número alterado para " + this.numConta + " com sucesso.\n");
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String newTipo) {
        if ("CC".equals(newTipo) || "CP".equals(newTipo)) {
            this.tipo = newTipo;
            System.out.println("AVISO: Tipo alterado para " + this.tipo + " com sucesso.\n");
        } else {
            System.out.println("AVISO: Tipo inválido.\n");
        }
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String newDono) {
        this.dono = newDono;
        System.out.println("AVISO: Dono alterado para " + this.dono + " com sucesso.\n");
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float newSaldo) {
        this.saldo = newSaldo;
        System.out.println("Saldo alterado para " + this.saldo + " com sucesso.\n");
    }
    
    public void getStatus() {
        System.out.print("AVISO: Conta ");
        if (this.status==true) {
            System.out.println("existe.\n");
        } else {
            System.out.println("não existe.\n");
        }
    }
    
    public void setStatus(boolean newStatus) {
        this.status = newStatus;
        System.out.println("AVISO: Status redefinido para " + this.status + " com sucesso.\n");
    }

    private void erro() {
        System.out.println("AVISO: Você precisa criar uma conta para fazer isso.\n");
    }
    
}
