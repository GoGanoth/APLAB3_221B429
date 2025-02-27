public class Singelton{
    private static Singelton uniqueInstance = new Singelton();
    private Singelton(){}
    
    public static Singelton getUniqueInstance(){
        return uniqueInstance;
    } 
}
