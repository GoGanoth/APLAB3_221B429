class SodaDecorator extends Decorator {
    public SodaDecorator(BaseDrink decoratedDrink) {
        super(decoratedDrink);
    }
    
    public String getIngridients() {
        return this.base.getIngridients() + " with Soda";
    }
    
    public int getPrice() {
        return this.base.getPrice() + 20;
    }
}