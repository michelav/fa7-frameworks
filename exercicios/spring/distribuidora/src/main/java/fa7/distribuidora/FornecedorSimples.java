package fa7.distribuidora;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FornecedorSimples implements Fornecedor {
	
	private double taxa = 1;
	private Map<String, Double> mercadorias;
	
	@SuppressWarnings("serial")
	public FornecedorSimples() {
		mercadorias = Collections.unmodifiableMap(new HashMap<String, Double>() {
			{
                put("lapis", .75 );
                put("caneta", 2.75);
                put("papel", 10.00);
                put("tesoura", 2.25);
                put("caderno", 15.00);
            }
        });
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double getTaxa() {
		return taxa;
	}
	
	@Override
	public List<String> listarMercadorias() {
		return null;
	}

	@Override
	public double calcularReserva(String mercadoria, int quantidade) {
		double valor = mercadorias.get(mercadoria)*taxa*quantidade;
		return BigDecimal.valueOf(valor).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	@Override
	public boolean reservar(String mercadoria, int quantidade) {
		System.out.println("Fornecedor Simples reservando " + quantidade + " itens de " + mercadoria);
		return true;
	}
	
	@Override 
	public String toString() {
		return "Fornecedor Simples";
	}
}
