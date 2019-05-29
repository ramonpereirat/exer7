public class ProfessorHorista extends Professores {
    private double salarioBase;
    private int numeroAulas;
    
    /**
     *
     * @param nome
     * @param idade
     * @param numeroMatricula
     * @param salarioBase
     * @param numeroAulas
     */
    public ProfessorHorista(String nome, int idade, String numeroMatricula, double salarioBase, int numeroAulas) {
        super(nome, idade, numeroMatricula);
        setSalarioBase(salarioBase);
        setNumeroAulas(numeroAulas);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }
    
    
}