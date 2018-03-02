public class BurgerTester {
    public static void main(String[] args) {
        System.out.println(
        "The most common topping is: "+ BurgerTools.mostPopularTopping+
                "\nThe average days before exp is: " + BurgerTools.averageDaysBeforeExpiration+
                "\nThe average temp when cooked is: " + (BurgerTools.temerpatureWhenCooked-20)
        );
        BurgerTools.grill();
    }
}
