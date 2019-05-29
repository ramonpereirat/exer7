public class Empregado extends Pessoas{
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado(String nome, String endereco, String telefone,  int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        setCodigoSetor(codigoSetor);
        setSalarioBase(salarioBase);
        setImposto(imposto);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public void mostrar(){    
        super.mostrar();
        System.out.println(getCodigoSetor());
        System.out.println(getSalarioBase());
        System.out.println(getImposto());
    }
    
    public double calcularSalario(){
    
        return getSalarioBase() - (getSalarioBase() * getImposto());
    }
}