package calculojurossimples;
// Prestações, juros mensais. valoremprestado, juros periodo, valor total, valorjuros, valor parcelas.
public class CalculoJurosSimples {
    public static void main(String[] args) {
        int prestacoes = 6;
        double jurosMensais = 0.02;
        double valorEmprestado = 1000.0;
        double jurosPeriodo = jurosMensais + prestacoes;
        double valorTotal = valorEmprestado * ( 1 + jurosPeriodo);
        double valorJuros = valorTotal - valorEmprestado;
        double valorParcelas = valorTotal / prestacoes;
        System.out.println("O valor total a pagar: " + valorTotal);
        System.out.println("Valor dos juros: " + valorJuros);
        System.out.println("Valor da parcela: " + valorParcelas);
    }
    
}
