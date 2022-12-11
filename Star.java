public class Star {
    public static void main(String[] args) {
        // 별찍기 1번
        for(int i=0; i<6; i++){
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}