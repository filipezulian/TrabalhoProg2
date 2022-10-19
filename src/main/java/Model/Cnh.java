
package model;

import dao.ClienteDAO;
import exceptions.CNHRegistroException;

public class Cnh {
   protected String registro;
   protected int anoExp;

    public Cnh(String registro, int anoExp) throws CNHRegistroException{
        setRegistro(registro);
        this.anoExp = anoExp;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) throws CNHRegistroException {
        for(Cliente c : ClienteDAO.recuperarTodosClientes()) {
            if(c.getCnh().getRegistro().equals(registro)) {
                throw new CNHRegistroException();
            }
        }
        
        this.registro = registro;
    }

    public int getAnoExp() {
        return anoExp;
    }

    public void setAnoExp(int anoExp)  {
        this.anoExp = anoExp;
    }

    @Override
    public String toString() {
        return "Cnh{" + "registro=" + registro + ", anoExp=" + anoExp + '}';
    }
   
    
   
}
