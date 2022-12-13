/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Filipe Zulian
 */
public abstract class Veiculo implements Multa {
   protected String placa; //nao fiz set get
   protected String marca;
   protected String modelo;
   protected int km;
   protected boolean alugado;
   protected float precoDia;
   protected int id;
   protected static int geradorID = 0;

    public Veiculo(String placa, String marca, String modelo, int km, boolean alugado, float precoDia) {
        this.id = gerarID();
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.alugado = alugado;
        this.precoDia = precoDia;
    }

     private static int gerarID() {
        return ++geradorID;
    }
    
    public int getID() {
        return Veiculo.geradorID;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public float getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(float precoDia) {
        this.precoDia = precoDia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.placa);
        hash = 61 * hash + Objects.hashCode(this.modelo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    

    @Override
    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Kilometragem: " + km + ", Alugado: " + alugado + ", Preço por dia: " + precoDia + '.';
    }

   
    
    
}
