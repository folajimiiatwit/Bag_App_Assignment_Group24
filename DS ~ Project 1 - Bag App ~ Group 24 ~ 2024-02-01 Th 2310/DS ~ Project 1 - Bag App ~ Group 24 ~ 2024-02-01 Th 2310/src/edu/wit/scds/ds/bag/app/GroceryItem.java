/**
 * 
 */
package edu.wit.scds.ds.bag.app;

/**
 * @Thomas Do
 * 
 */
public class GroceryItem {
	/*
	 * Attributes of the grocery item
	 */
	private final String itemName;
	private final int size;
	private final int weight;
	private final String firmness;
	private final boolean isRigid;
	private final boolean isBreakable;
	private final boolean isPerishable;

	/*
	 * constructors
	 */
	/*
	 *
	 */
	public GroceryItem() {
		this.itemName = "N/A";
		this.size = 0;
		this.weight = 0;
		this.firmness = "N/A";
		this.isRigid = false;
		this.isBreakable = false;
		this.isPerishable = false;
	}
	/*
	 *
	 */

	public GroceryItem(String name, int[] itemSizeANDWeight, String firmness, Boolean[] booleanValues) {
		this.itemName = name;
		this.size = itemSizeANDWeight[0];
		this.weight = itemSizeANDWeight[1];
		this.firmness = firmness;
		this.isRigid = booleanValues[0];
		this.isBreakable = booleanValues[1];
		this.isPerishable = booleanValues[2];
	}

	/*
	 * API methods
	 */

	/*
	 *
	 */
	public int getSize() {
		return size;
	}

	/*
	 *
	 */
	public int getWeight() {
		return weight;
	}

	/*
	 *
	 */
	public String getFirmness() {
		return firmness;
	}

	/*
	 *
	 */
	public boolean isRigid() {
		return isRigid;
	}

	/*
	 *
	 */
	public boolean isBreakable() {
		return isBreakable;
	}

	/*
	 *
	 */
	public boolean isPerishable() {
		return isPerishable;
	}

	public String getItemName() {
		return itemName;

	}

	@Override
	public String toString() {
		return "Item Name: " + this.itemName + "/n" + "Size: " + this.size + "/n" + "Weight: " + this.weight + "/n"
				+ "Firmness: " + this.weight + "/n" + "Is Rigid?: " + "Is Breakable?: " + this.isBreakable + "/n"
				+ "Is Perishable?: " + this.isPerishable + "/n";
	}

	public boolean equals(GroceryItem item) {
		return this.itemName.equals(item.getItemName());
	}

}
