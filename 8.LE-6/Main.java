class Main {
    public static void main(String args[]) {
        BaseDrink tea = new Tea();
        System.out.println(tea.getIngridients());
        System.out.println(tea.getPrice());
        tea = new RumDecorator(tea);
        System.out.println(tea.getIngridients());
        System.out.println(tea.getPrice());
        tea = new GinDecorator(tea);
        System.out.println(tea.getIngridients());
        System.out.println(tea.getPrice());
        
        BaseDrink coffee = new Coffee();
        System.out.println(coffee.getIngridients());
        System.out.println(coffee.getPrice());
        coffee = new RumDecorator(coffee);
        System.out.println(coffee.getIngridients());
        System.out.println(coffee.getPrice());
        coffee = new SodaDecorator(coffee);
        System.out.println(coffee.getIngridients());
        System.out.println(coffee.getPrice());
    }
}