public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.nameOfDish = "ChickFilA meal #1";
        dish.costInCents = 6.45;
        dish.wouldRecommend = true;

        System.out.println(dish.nameOfDish);
        System.out.println("$" + dish.costInCents);
        System.out.println("Would you recommend?: " + dish.wouldRecommend);
        System.out.println(dish.eat());

    }
}
