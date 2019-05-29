public class Fornecedor extends Pessoa {    
    private double valorCredito;
    private double valorDivida;
    
    
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){    
        super(nome, endereco, telefone);         
        setValorCredito(valorCredito);
        setValorDivida(valorDivida);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public void mostrar (){
        super.mostrar();
        System.out.println(getValorCredito());
        System.out.println(getValorDivida());
    }
    
    public double obterSaldo(){
    
        return getValorCredito() - getValorDivida();
    }

    void mostrar() {
        throw new UnsupportedOperationException(".");
    }
}