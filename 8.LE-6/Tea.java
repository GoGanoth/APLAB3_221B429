class Tea implements BaseDrink {
    String name;
    Tea() {
        this.name = "Tea";
    }
    
    public int getPrice() {
        return 10;
    }
    
    public String getIngridients() {
        return this.name;
    }
}