public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, int idade, String endereco, String cargo) {
        super (nome, idade, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo (String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + this.cargo;
    }

    public static class FuncionarioBuilder {
        private String nome;
        private int idade;
        private String endereco;
        private String cargo;
    
        public FuncionarioBuilder() {
        }
    
        public FuncionarioBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }
    
        public FuncionarioBuilder setIdade(int idade) {
            this.idade = idade;
            return this;
        }
    
        public FuncionarioBuilder setEndereco(String endereco) {
            this.endereco = endereco;
            return this;
        }
    
        public FuncionarioBuilder setCargo(String cargo) {
            this.cargo = cargo;
            return this;
        }
    
        public Funcionario build() {
            return new Funcionario(nome, idade, endereco, cargo);
        }
    }

    public static FuncionarioBuilder builder() {
        return new FuncionarioBuilder();
}


}
