class Kaurav extends Bharatvanshi {
    private boolean isCruel;
    private boolean isObedient;

    public Kaurav() {
        isCruel = true;
        isObedient = false;
    }

    @Override
    public void fight() {
        System.out.println("Kaurav fights with aggression!");
    }

    
    public void disobey() {
        System.out.println("Kaurav disobeys commands!");
    }

    
    public void showCruelty() {
        System.out.println("Kaurav shows cruelty.");
    }
}
