class RumDecorator extends Decorator {
    public RumDecorator(BaseDrink decoratedDrink) {
        super(decoratedDrink);
    }
    
    @Override
    public String getIngridients() {
        return this.base.getIngridients() + " with Rum";
    }
    
    public int getPrice() {
        return this.base.getPrice() + 35;
    }
}