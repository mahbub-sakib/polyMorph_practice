public class Milk extends Liquid{
    @Override
    public void swirl(boolean clockwise){
        System.out.println("Swirling milk");       
    }
    @Override
    public void drip(int ml){
        System.out.println("Dripping milk " + ml + "ml");
    }
}
