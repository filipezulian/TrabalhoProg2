package Model;

import dao.ClienteDAO;
import exceptions.CPFException;



public class Cliente {
   private String nome;
   private String telefone;
   private String cpf;
   private int id;
   private Cnh cnh;

    public Cliente(String nome, String telefone, String cpf) throws CPFException{
        this.nome = nome;
        this.telefone = telefone;
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cnh getCnh() {
        return cnh;
    }

    public void setCnh(Cnh cnh) {
        this.cnh = cnh;
    }
   
    
    
   public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws CPFException {
        for(Cliente c : ClienteDAO.recuperarTodosClientes()) {
            if(c.getCpf().equals(cpf)) {
                throw new CPFException();
            }
        }
        
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", cnh=" + cnh + '}';
    }
    
    
}
