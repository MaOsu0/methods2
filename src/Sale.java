public class Sale {
    double salePrice(Product saleName, double promo){
        double promoprice = saleName.grossPrice * (1-promo);
        return promoprice;
    }

    void showSalePrice(Product product, double promo1){
        double showTime = salePrice(product,promo1);
        System.out.println("Nowa cena po promocji to :" + showTime);

    }
}
