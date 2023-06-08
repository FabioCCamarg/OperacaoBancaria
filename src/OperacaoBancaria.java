import java.util.Scanner;

public class OperacaoBancaria {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        double saldoInicial = 0;
        double totalSaldoDep = 0;
        double valorDep = 0;
        double totalSaldoRet = 0;
        double valorRet = 0;
        String[] option = { "[1] Deposito", "[2] Retirada", "[3] Fim" };
        String resp;

        System.out.println("Digite o Saldo inicial da sua conta:");
        saldoInicial = sc.nextDouble();
       
        while (opt != 3){
            System.out.println("Escolha umas da opções:");
            for (int i = 0; i < option.length; i++) {
                System.out.println(option[i]);
            }
            opt = sc.nextInt();
            
            switch (opt) {
                case 1:
                    System.out.println("Digite o Valor do Deposito:");
                    valorDep = sc.nextDouble();
                    totalSaldoDep = valorDep + saldoInicial;
                    
                    System.out.printf("Saldo Total: R$ %.2f %n ", totalSaldoDep);
                    saldoInicial = totalSaldoDep;
                    break;
                case 2:
                    System.out.println("Digite o Valor da Retirada:");
                    valorRet = sc.nextDouble();
                    totalSaldoRet = saldoInicial - valorRet;
                    System.out.printf("Saldo Total: R$ %.2f%n ", totalSaldoRet);
                    saldoInicial = totalSaldoRet;
                    break;
                case 3:
                    System.out.printf("Saldo Final: R$ %.2f %n", saldoInicial);
                    break;
                default:
                    System.out.println("Opção Errada");
                    break;
            }
            
        }
        if (saldoInicial > 0) {
            System.out.println("Conta Preferencial");
        } else if (saldoInicial < 0) {
            System.out.println("Conta estourada");
        } else {
            System.out.println("conta zerada");
        }

        System.out.println("Fim!");
    }
}
