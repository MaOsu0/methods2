//Celem projektu jest utworzenie sklepu w którym można tworzyć produkty oraz dawać promocje na dane produkty.
//Chcemy aby tworzenie produktu odbywało się poprzez metodę tworzącą produkt zgodny z szablonem.
//1. Najpierw tworzymy szablon Product.java. Przechodzimy do szablonu Ptoduct.java
//

public class Shop {
    public static void main(String[] args) {
        MakeProduct makeProduct = new MakeProduct();
       Product headset = makeProduct.newProduct("Słuchawki",500,"Super słuchawki");
        Product mouse = makeProduct.newProduct("Trust",10.99,"Myszka bezprzewodowa");

        makeProduct.showProduct(mouse);
        makeProduct.showProduct(headset);

        Sale sale = new Sale();
        sale.showSalePrice(headset,0.1);


    }
}
