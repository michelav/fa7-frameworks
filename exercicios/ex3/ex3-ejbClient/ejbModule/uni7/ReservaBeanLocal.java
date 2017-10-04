package uni7;

import javax.ejb.Local;

@Local
public interface ReservaBeanLocal {

    public void incluir(String merc, int qtde);
    
    public void reservar();
    
    public Estoque obterEstoque();	
}
