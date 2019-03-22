public class Items {
    protected String item;
    protected int code;
    private double price;
    protected String type;
    public int quanity;
    private boolean tax;
public Items(String product,int aCode, double money, String section, int amount, boolean taxable){
    item = product;
    code = aCode;
    price = money;
    type = section;
    quanity = amount;
    tax = taxable;

}


}
