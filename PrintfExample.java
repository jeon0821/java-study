public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.println("상품의 가격:%d원\n", value);
        System.out.println("상품의 가격:%6d원\n", value);
        System.out.println("상품의 가격:%-6d원\n", value);
        System.out.println("상품의 가격:%06d원\n", value);
    }
    
}
