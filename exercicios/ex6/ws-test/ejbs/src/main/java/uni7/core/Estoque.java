package uni7.core;

import java.util.List;
import java.util.UUID;

public interface Estoque {
	
	public Item createItem(String name, int qtde);
	public List<Item> findByName(String name);
	public Item findById(UUID id);
	public void updateItem(Item item);
	public List<Item> items();
}
