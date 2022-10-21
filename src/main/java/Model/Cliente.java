    package model;

import dao.ClienteDAO;
import exceptions.CPFException;
import exceptions.CampoVazioException;



public class Cliente implements Comparable<Cliente> {
   private String nome;
   private String telefone;
   private String cpf;
   private int idade;
   private int id;
   private Cnh cnh;

    public Cliente(String nome, String telefone, String cpf, int idade) throws CPFException{
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        setCpf(cpf);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
        return  nome  + idade;
    }

    
    @Override
    public int compareTo(Cliente cliente) {
        if(this.idade < cliente.getIdade()) {
            return -1;
        } else if(this.idade > cliente.getIdade()) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
}
