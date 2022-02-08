//5. Metoda tworząca obiektu na podstawie szablonu Product.java.
//
//
//
//

public class MakeProduct {

    Product newProduct(String mPName, double mPNetPrice,String mPDescription){
    // 6. Pierwsze słowo w opisie metody tutaj "Product" informuje nas o tym jakiego typu zmienina będzie wynikiem
    // tej metody. Stworzyliśmy klasę Product.java, więc możemy używać zmiennych typu Product (będących obiektami
    // utworzonymi na podstawie szablonu z klasy Product.java).

    // DODATKOWO: Metoda może zaczynać się od takich słów jak int. double, void lub nazwa każdej klasy jaką utworzymy
    // Drugie wyrażenie w opisie metody tutaj "newProduct" to nazwa która sami nadajemy dla tej metody (powinna oddawać
    // działanie metody np. tworzenie produktu, metoda dodająca liczby np. addNumbers)

    // Wyrażenia w nawiasach są to typy zmiennych z nadanymi przez nas nazwami roboczymy dla tej tylko metody. Tutaj
    // np. String nPName, których wartość będzie musiał nam użytkownik tej metody w klasie main. Typy zmiennych muszą
    // być zgodne z typami zmiennych z szablonu na odstawie którego tworzymy metodę.Szablon ten określy jest w pierwszym
    // słowie czyli Product, jaki typ zmiennej i odnosi się do klasy Product.java

        Product product1 = new Product();
    //Aby w katalogu main za pomocą powyższej metody można było stworzyć obiekt typu "Product" trzeba tutaj wywołać
    // utworzenie tego obiektu. "product1" z małej litery jest to nazwa obiektu typu Product  utworzonego na podstawie
    // szablonu Product.java. Nazwa ta używana jest tylko w tej metodzie i nie można jej wywołać w katalogu main.
    // Nazwa może być dowolna.

        product1.name = mPName;
//    Dzięki użyciu nazwy "product1" możemy powiązać tworzony obiekt z używanym szablonem Product.java. Zmienne z
//    szablonu wywołujemy przez użycie kropki "." po nazwie "product1".
//    W tym wierszu wskazujemy, że nazwa(zmienna "String name" z szablonu) tworzonego przez nas za pomocą tej metody
//    obiektu przyjmie wartość wprowadzonej przez użytkownika metody nazwy (zmienna "String mPName" wskazana w okrągłym
//    nawiasie.

        product1.netPrice = mPNetPrice;
        product1.grossPrice = mPNetPrice * 1.23;
        product1.description = mPDescription;
        return product1;
//    Komenda "return" zwraca nam zmienną typu zgodnego z pierwszym złowem metody - tutaj Product o referencji "product1"
//    Ta referencja(nazwa) "product1" działa tylko w ramach tej metody.
//    Dzięki komendzie retun utworzył się obiekt o nazwie "product1" o zmiennych podanych w szablonie Product.java
//    zgodnych z wartościami wprowadzonymi przez użytkownika metody lub obliczonymi w trakcie działania metody (np.
//    tutaj "product1.grossPrice" jest pomnożone o 1.23 w stosunku do wartości netto.
    }


    void showProduct(Product showProduct){
        System.out.println("Nazwa to: " + showProduct.name);
        System.out.println("Cena netto to: " + showProduct.netPrice);
        System.out.println("Cena brutto to: " + showProduct.grossPrice);
        System.out.println("Opis to: " + showProduct.description);
    }

}
