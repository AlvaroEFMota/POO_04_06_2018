package entidade;

/**
 *
 * @author alvaro
 */
public class Pessoa {
    
    private String nome;
    private Long cpf;

    public Pessoa ()
    {
        
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pessoa foi destruido");
    }
    
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
