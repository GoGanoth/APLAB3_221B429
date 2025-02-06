public class Test {
    public static void main(String[] args) {
       
        Pandav arjun = new Pandav();
        Pandav bheem = new Pandav();
        
        
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();
        
        
        System.out.println("Arjun:");
        arjun.fight();
        arjun.showKindness();
        arjun.obey();
        
        System.out.println("\nBheem:");
        bheem.fight();
        bheem.showKindness();
        bheem.obey();
        
        
        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.showCruelty();
        duryodhan.disobey();
        
        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.showKindness();
        vikarn.obey();
    }
}
