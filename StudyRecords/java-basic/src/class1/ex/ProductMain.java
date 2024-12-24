package class1.ex;

public class ProductMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        for (int i = 0; i < orders.length; i++)
            orders[i] = new ProductOrder();

        orders[0].productName = "두부";
        orders[0].price = 2000;
        orders[0].quantity = 2;

        orders[1].productName = "김치";
        orders[1].price = 5000;
        orders[1].quantity = 1;

        orders[2].productName = "콜라";
        orders[2].price = 1500;
        orders[2].quantity = 2;

        int totalAmount = 0;
        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + "가격: " + o.price + "수량: " + o.quantity);
            totalAmount += o.price * o.quantity;
        }

        System.out.println("총 결제 금액: " + totalAmount);
    }
}
