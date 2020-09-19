package q1;

public class Invoice implements Payable{
	
	private String partNum;
    private String partDescription;
	private int quantity;
    private	double pricePerItem;
    
    
    
	public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	public String getPartNum() {
		return partNum;
	}
	
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [partNum=");
		builder.append(partNum);
		builder.append(", partDescription=");
		builder.append(partDescription);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", pricePerItem=");
		builder.append(pricePerItem);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public double getPayment() {
		System.out.println(this);
		return pricePerItem * quantity;
	}
    
    

}
