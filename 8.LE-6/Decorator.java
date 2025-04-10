public abstract class Decorator implements BaseDrink {
    protected BaseDrink base;
    
    public Decorator(BaseDrink base) {
        this.base = base;
    }
    
    public int getPrice() {
        return this.base.getPrice();
    }
    
    public String getIngridients() {
        return this.base.getIngridients();
    }
}