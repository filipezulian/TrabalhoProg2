
package model;

public abstract class Aluguel {
    
    protected float preco;
    protected int id;
    protected boolean finalizado;
    protected Veiculo veiculo;
    protected Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }    
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    abstract public float calcularValorAluguel(int qtdTempo);
    
    @Override
    public String toString() {
        return "Preço: " + preco;
    }
    
    
    
}
