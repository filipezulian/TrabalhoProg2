
package Model;

public abstract class Aluguel {
    
    protected float preco;
    protected int id;

    public Aluguel(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Preço: " + preco;
    }
    
    
}
