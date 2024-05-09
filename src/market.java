import java.util.ArrayList;
import java.util.Random;

public class market {
    private int price;
    private ArrayList <Integer> priceList = new ArrayList<>();
    private final String[] department = {"Food" , "Grocery" , "HealthCare"};
    private ArrayList <String> list = new ArrayList<>();
    private ArrayList <Integer> code = new ArrayList<>();
    public int getPrice() {
        return price;
    }
    public String[] getDepartment() {
        return department;
    }
    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList <String> list) {
        this.list = list;
    }

    public void setCode(ArrayList<Integer> code) {
        this.code = code;
    }

    public ArrayList<Integer> getCode() {
        return code;
    }
    public String getProductCode(int productCode) {
        for (int i = 0; i < code.size(); i++) {
            if (productCode == code.get(i)) return list.get(i);
        }
        return "Product doesn't exist";
    }
//    private void setCode(ArrayList <String> list) {
//        Random r = new Random();
//        for (int i = 0; i < list.size(); i++) {
//            int x = r.nextInt(100000,999999);
//            code.add(i , x);
//        }
//        this.list = list;
//    }
//    private void setCode(String item) {
//        Random r = new Random();
//            int x = r.nextInt(100000,999999);
//            code.add(list.indexOf(item) , x);
//    }
    public ArrayList<Integer> getPriceList() {
        return priceList;
    }

    public void setPriceList(ArrayList<Integer> priceList) {
        this.priceList = priceList;
    }
    public void createNewProduct(int productCode , String name , int price){
        code.add(productCode);
        list.add(name);
        priceList.add(price);
//        setCode(name);
    }
    public void createNewProductList(ArrayList <Integer> code , ArrayList <String> list , ArrayList <Integer> priceList){
        this.list = list;
        this.code = code;
        this.priceList = priceList;
    }
    public void showProducts(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "    " + priceList.get(i) + "$" + "    Code : "+ code.get(i));
        }
    }
}
