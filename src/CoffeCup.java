public class CoffeCup {
    private Liquid innerLiquid;

    void addLiquid(Liquid liq) {
        innerLiquid = liq;
        innerLiquid.swirl(false);

        String typename = innerLiquid.getClass().getName();
        System.out.println(typename);

        String superClassType = innerLiquid.getClass().getSuperclass().getTypeName();
        System.out.println(superClassType);
    }
}
