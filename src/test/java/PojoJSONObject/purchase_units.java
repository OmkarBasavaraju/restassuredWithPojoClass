package PojoJSONObject;

public class purchase_units {
	
	 public Amount amount;

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}
public purchase_units(String currency_code,String value) {
	this.amount = new Amount(currency_code,value);
}
}
