public class ContaBanco {
     public int numConta;
     protected String tipoConta;
     // cc ou cp
     private String dono;
     private float saldo;
     private boolean status;


    public void abrirConta (){
        this.setStatus(true);
        if(this.tipoConta == "cc") {
            this.setSaldo(100);
        }else { this.setSaldo(150);}
    };
    public void fecharConta() {
        if(this.saldo == 00) {
            this.setStatus(false);
            System.out.println("Sua conta foi encerrada!");
        } else {
            System.out.println("Não é possível encerrar a conta, pois há saldo!");
        }
    };
    public void depositar (float valorDeposito) {
        this.setSaldo(getSaldo() + valorDeposito);
    }
    public void sacar(float Saque) {
        if (this.saldo >= Saque) {
           this.setSaldo(getSaldo()-Saque);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void pagarMensal() {
        if(this.tipoConta == "cc"){
            this.setSaldo(getSaldo() - 12);
        } else { this.setSaldo(getSaldo() - 20); }
    }

    public ContaBanco(int numConta, String tipoConta, String dono) {
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.dono = dono;
        this.saldo = 00;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}