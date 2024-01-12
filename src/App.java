public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        CoffeCup myCup = new CoffeCup();

        Liquid genericLiquid = new Liquid();
        Coffee coffee = new Coffee();
        Milk milk = new Milk();

        // myCup.addLiquid(genericLiquid);
        // myCup.addLiquid(coffee);
        // myCup.addLiquid(milk);

        Liquid mlk = new Milk();

        mlk.drip(2);
        
        Liquid cfe = new Coffee();
        
        if(cfe instanceof Coffee){
            ((Coffee) cfe).flow();
        }
        ((Coffee) cfe).flow();
    }
}
