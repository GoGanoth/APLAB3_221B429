class Pandav extends Bharatvanshi {
    private boolean isKind;
    private boolean isObedient;

    public Pandav() {
        isKind = true;
        isObedient = true;
    }

    @Override
    public void fight() {
        System.out.println("Pandav fights bravely!");
    }

   
    public void obey() {
        System.out.println("Pandav obeys without question.");
    }

 
    public void showKindness() {
        System.out.println("Pandav shows kindness.");
    }
}
