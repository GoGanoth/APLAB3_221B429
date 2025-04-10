class GinDecorator extends Decorator {
    public GinDecorator(BaseDrink decoratedDrink) {
        super(decoratedDrink);
    }
    
    public String getIngridients() {
        return this.base.getIngridients() + " with Gin";
    }
    
    public int getPrice() {
        return this.base.getPrice() + 140;
    }
}