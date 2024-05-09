import java.util.ArrayList;
import java.util.Objects;

public class cart extends market{
    private ArrayList <String> cartItems = new ArrayList<>();
    private ArrayList <Integer> cartItemsPriceList = new ArrayList<>();
    public ArrayList<String> getCartItems() {
        return cartItems;
    }
    private int totalPrice = 0;
    public void setCartItems(ArrayList<String> cartItems) {
        this.cartItems = cartItems;
    }
    public void addToCart(String item , int price){
        cartItems.add(item);
        cartItemsPriceList.add(price);
    }
    public boolean removeItem(String item){
        for (int i = 0; i < cartItems.size(); i++) {
            if (Objects.equals(item, getCartItems().get(i))){
                getCartItems().remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean removeItem(int code){
        for (int i = 0; i < cartItems.size(); i++) {
            if (code == getCode().get(i)){
                getCartItems().remove(i);
                return true;
            }
        }
        return false;
    }
    public int calcPrice(ArrayList<Integer> priceList) {
        totalPrice = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            totalPrice += cartItemsPriceList.get(i);
        }
        return totalPrice;
    }

    public void showCartItems(){
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i));
        }
    }
}
