public class Singelton{
    private static Singelton uniqueInstance;
    private Singelton(){}
    
    public static Singelton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singelton();
        }
        
        return uniqueInstance;
    } 
}
