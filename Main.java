package fruits;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] myFruits = {"oranges", "Bananas", "Mangoes", "Pineaples", "Apples"};
        Integer[] myFruitsPrices ={50,30,100,150,100};
//        System.out.println(myFruits[1]);
//        System.out.println(myFruits[0]);
//        System.out.println(myFruits[4]);
for(String myFruitsItem : myFruits){
    System.out.println(myFruitsItem);

}
    Integer total = 0;
    for(Integer price : myFruitsPrices){
//        total = total + price;
        total += price;
    }
        System.out.println("Dear customer, your fruits will cost Kshs "+ total +"/=");
    }
}
