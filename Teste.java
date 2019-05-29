public class Teste {
    public static void main(String[] args) {
        Pessoas p = new Pessoas ("RAMON", "Rua xxx", "69696969");        
        p.mostrar();
        
        Fornecedor f = new Fornecedores ("EU", "Rua 10", "1234567899002", 100, 500);
        f.mostrar();
        
        Empregado e = new Empregado ("Labestia", "Rua 69", "666", 10, 500, 0.75);
        e.mostrar();
        
        System.out.println(f.obterSaldo());
        System.out.println(e.calcularSalario());
        
    }
}