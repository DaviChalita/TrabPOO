package projetopoo.obj;


public class Funcionario {
    public Funcionario(String nome, String cpf, String cep) {
        setNome(nome);
        setCpf(cpf);
        setCep(cep);
        this.alocar = false;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
 
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCep() {
        return cep;
    }
    
    public void alocado(){
        this.alocar = true;
    }

    private String nome;
    private String cpf;
    private String cep;
    private boolean alocar;
}
