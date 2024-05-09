import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> List;
        ArrayList<Integer> priceList;
        ArrayList<Integer> code;
        int productCode;
        cart c = new cart();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our market");
        System.out.println("-Please select a department");
        System.out.println("1.Food    2.Grocery    3.Health\n-Enter department number");
        int dep = in.nextInt();
        if (dep == 1) {
            System.out.println("Welcome to food department\n Select your desired items");
            List = new ArrayList<>(Arrays.asList("Grilled chicken", "Rice", "Pizza", "Spaghetti", "Soup", "Grilled meat"));
            priceList = new ArrayList<>(Arrays.asList(50, 20, 100, 30, 10, 200));
            code = new ArrayList<>(Arrays.asList(131561, 654315, 687684, 984265, 765165, 652663));
            c.setList(List);
            c.setPriceList(priceList);
            c.setCode(code);
            c.createNewProductList(c.getCode(), c.getList(), c.getPriceList());
            c.showProducts();
            for (; ; ) {
                int x;
                System.out.println("1.Add products          2.End          3.Show cart items              4.Remove from cart\n-Select one option");
                x = in.nextInt();
                if (x == 1) {
                    System.out.print("Enter product code : ");
                    productCode = in.nextInt();
                    boolean found = false; // Flag to indicate if the product is found

                    for (int i = 0; i < c.getList().size(); i++) {
                        if (productCode == code.get(i)) {
                            System.out.println(c.getProductCode(productCode));
                            c.addToCart(c.getProductCode(productCode), priceList.get(code.indexOf(productCode)));
                            System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                            found = true;
                            break; // Exit the loop once the product is found
                        }
                    }

                    if (!found) {
                        System.out.println("product doesn't exist");
                    }

                } else if (x == 2) {
                    System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                    break;
                } else if (x == 3) {
                    System.out.println("Your cart : ");
                    c.showCartItems();
                    System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                } else if (x == 4) {
                    System.out.println("Enter code of item to delete");
                    productCode = in.nextInt();
                    if (c.removeItem(c.getProductCode(productCode))){
                        System.out.println("Item deleted successfully");
                    }
                    else System.out.println("Item not found!");
                }
                else {
                    System.out.println("Error!");
                }
            }
        }
        else if (dep == 2) {
            System.out.println("Welcome to grocery department\n Select your desired items");
            List = new ArrayList<>(Arrays.asList("Tee", "Oil", "Vinegar", "Salt", "Milk", "Honey"));
            priceList = new ArrayList<>(Arrays.asList(50,25,30,5,40,70));
            code = new ArrayList<>(Arrays.asList(648219 , 954276 , 627158 , 604821 , 375109 , 763014));
            c.setList(List);
            c.setPriceList(priceList);
            c.setCode(code);
            c.createNewProductList(c.getCode() , c.getList() , c.getPriceList());
            c.showProducts();
            for (; ; ) {
                int x;
                System.out.println("1.Add products          2.End          3.Show cart items              4.Remove from cart\n-Select one option");
                x= in.nextInt();
                if (x==1){
                    System.out.print("Enter product code : ");
                    productCode = in.nextInt();
                    boolean found = false; // Flag to indicate if the product is found

                    for (int i = 0; i < c.getList().size(); i++) {
                        if (productCode == code.get(i)) {
                            System.out.println(c.getProductCode(productCode));
                            c.addToCart(c.getProductCode(productCode), priceList.get(code.indexOf(productCode)));
                            System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                            found = true;
                            break; // Exit the loop once the product is found
                        }
                    }

                    if (!found) {
                        System.out.println("product doesn't exist");
                    }
                }
                else if (x==2) {
                    System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                    break;
                }
                else if (x==3){
                    System.out.println("Your cart : ");
                    c.showCartItems();
                    System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                } else if (x==4) {
                    System.out.println("Enter code of item to delete");
                    productCode = in.nextInt();
                    if (c.removeItem(c.getProductCode(productCode))){
                        System.out.println("Item deleted successfully");
                    }
                    else System.out.println("Item not found!");
                }
                else {
                    System.out.println("Error!");
                }
            }
        } else if (dep == 3) {
            System.out.println("Welcome to health department\n Select your desired items");
            List = new ArrayList<>(Arrays.asList("Tissue", "plaster", "Toothbrushes", "Toothpaste", "Hand Wash", "Shampoo"));
            priceList = new ArrayList<>(Arrays.asList(150,10,30,80,100,140));
            code = new ArrayList<>(Arrays.asList(156734 , 943571 , 612849 , 617354 , 907634 , 420187));
            c.setList(List);
            c.setPriceList(priceList);
            c.setCode(code);
            c.createNewProductList(c.getCode() , c.getList() , c.getPriceList());
            c.showProducts();
            for (; ; ) {
                int x;
                System.out.println("1.Add products          2.End          3.Show cart items              4.Remove from cart\n-Select one option");
                x= in.nextInt();
                if (x==1){
                    System.out.print("Enter product code : ");
                    productCode = in.nextInt();
                    boolean found = false; // Flag to indicate if the product is found
                    for (int i = 0; i < c.getList().size(); i++) {
                        if (productCode == code.get(i)) {
                            System.out.println(c.getProductCode(productCode));
                            c.addToCart(c.getProductCode(productCode), priceList.get(code.indexOf(productCode)));
                            System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                            found = true;
                            break; // Exit the loop once the product is found
                        }
                    }

                    if (!found) {
                        System.out.println("product doesn't exist");
                    }

                }
                else if (x==2) {
                    System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                    break;
                }
                else if (x==3){
                    System.out.println("Your cart : ");
                    c.showCartItems();
                    System.out.println("your total cost : " + c.calcPrice(c.getPriceList()));
                } else if (x==4) {
                    System.out.println("Enter code of item to delete");
                    productCode = in.nextInt();
                    if (c.removeItem(c.getProductCode(productCode))){
                        System.out.println("Item deleted successfully");
                    }
                    else System.out.println("Item not found!");
                }
                else{
                    System.out.println("Error!");
                }
            }
        }
        else {
            System.out.println("Invalid department number!");
        }
    }

}