public class OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        //byte byteValue3 = byteValue1 + byteValue2; <- 컴파일 에러
        int intValue = byteValue1 + byteValue2;
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2; <- 컴파일 에러
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드="+intValue2);
        System.out.println("출력문자="+(char)intValue2);    
    
    }
    
}
