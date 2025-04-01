
import java.util.Scanner;

public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private Double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, Double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;

    }

    public ContaBancaria(int numeroConta, String nomeTitular) {
    }

    public void exibirInfo(){
        System.out.println("Número da conta:" + numeroConta);
        System.out.println("Nome do titular:" + nomeTitular);
        System.out.println("Saldo:" + saldo);
    }
    public void deposito(double valor){
        if(valor>0){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        }else{
            System.out.println("Valor inválido - Necessário ser positivo!");
        }

        }
    public void saque(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    }
