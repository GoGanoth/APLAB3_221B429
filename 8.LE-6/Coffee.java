class Coffee implements BaseDrink {
    String name;
    Coffee() {
        this.name = "Coffee";
    }
    public int getPrice() {
        return 20;
    }
    
    public String getIngridients() {
        return this.name;
    }
}