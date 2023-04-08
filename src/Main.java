public class Main {

    public static void main(String[] args) {
        
     String nome1 = "Maria";
     String nome2 = "João";
     String nome3 = "Carlos";
    
    int idade1 = 25;
    int idade2 = 30;
    int idade3 = 35;
    
    String endereco1 = "Bahia";
    String endereco2 = "Rio de Janeiro";
    String endereco3 = "São Paulo";
    
    Pessoa pessoa1 = new Pessoa (nome1, idade1, endereco1);
    Pessoa pessoa2 = new Pessoa (nome2, idade2, endereco2);
    Pessoa pessoa3 = new Pessoa (nome3, idade3, endereco3);
    
    Funcionario func1 = Funcionario.builder()
                    .setNome(pessoa1.getNome())
                    .setIdade(pessoa1.getIdade())
                    .setEndereco(pessoa1.getEndereco())
                    .setCargo("Gerente")
                    .build();
    
    Funcionario func2 = Funcionario.builder()
                    .setNome(pessoa2.getNome())
                    .setIdade(pessoa2.getIdade())
                    .setEndereco(pessoa2.getEndereco())
                    .setCargo("Assistente")
                    .build();
    
    Funcionario func3 = Funcionario.builder()
                    .setNome(pessoa3.getNome())
                    .setIdade(pessoa3.getIdade())
                    .setEndereco(pessoa3.getEndereco())
                    .setCargo("Supervisor")
                    .build();
    
    
    System.out.println(func1.toString());
    System.out.println(func2.toString());
    System.out.println(func3.toString());
    }
    
    
    
    }