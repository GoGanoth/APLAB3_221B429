class IceTea implements BaseDrink {
    String name;
    IceTea() {
        this.name = "Ice Tea";
    }
    
    public int getPrice() {
        return 15;
    }
    
    public String getIngridients() {
        return this.name;
    }
}