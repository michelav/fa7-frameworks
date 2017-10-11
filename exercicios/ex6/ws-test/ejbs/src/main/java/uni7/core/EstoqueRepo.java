package uni7.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstoqueRepo implements Estoque {

//	private Set<Item> data = Stream.of(
//			new Item(1, "tesoura", 10),
//			new Item(2, "papel", 20),
//			new Item(3, "caneta", 50),
//			new Item(4, "borracha", 40)).collect(Collectors.toSet();

//	private Map<Integer, Item> data = Stream.of(
//			new SimpleEntry<Integer, Item>(1, new Item(1, "tesoura", 10)),
//			new SimpleEntry<Integer, Item>(2, new Item(2, "papel", 20)),
//			new SimpleEntry<Integer, Item>(3, new Item(3, "caneta", 50)),
//			new SimpleEntry<Integer, Item>(4, new Item(4, "borracha", 40))).collect(
//					Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

	private Map<UUID, Item> data;

	public EstoqueRepo() {		
		data = new HashMap<UUID, Item>();
		List<Item> lista = Stream.of(new Item(UUID.randomUUID(), "tesoura", 10), 
				new Item(UUID.randomUUID(), "papel", 20), new Item(UUID.randomUUID(), "caneta", 50),
				new Item(UUID.randomUUID(), "borracha", 40)).collect(
				Collectors.toList());
		lista.forEach(l -> data.put(l.getId(), l));
	}
	
	public Item createItem(String name, int qtde) {
		Item created = null;
		if(findByName(name).isEmpty()) {
			created = new Item(UUID.randomUUID(), name, qtde);
			data.put(created.getId(), created);
		} else {
			// Item exists. Do something.
		}
		return created;
	};
	
	public List<Item> findByName(String name) {
		return data.values().stream().filter(i -> i.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}

	public Item findById(UUID id) {
		return data.getOrDefault(id, null);
	}

	
	
	@Override
	public void updateItem(Item item) {
		if (item != null) {
			data.put(item.getId(), item);
		} else {
			// Do something
		}
	}

	@Override
	public List<Item> items() {
		return new ArrayList<Item>(data.values());
	}
}
