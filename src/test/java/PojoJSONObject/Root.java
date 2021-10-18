package PojoJSONObject;

import java.util.ArrayList;

public class Root {
    public String intent;
    public ArrayList<purchase_units> purchase_units;
	public String getIntent() {
		return intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}
	public ArrayList<purchase_units> getPurchase_units() {
		return purchase_units;
	}
	public void setPurchase_units(ArrayList<purchase_units> purchase_units) {
		this.purchase_units = purchase_units;
	}
    
    public Root(String intent,ArrayList<purchase_units> purchase_units){
    	this.intent = intent;
    	this.purchase_units = purchase_units;
    }
}
