public class Star {
    public static void main(String[] args) {
        // 별찍기 1번
        for(int i=0; i<6; i++){
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<6; i++){
            for(int n=5; n>i; n--){
                System.out.println(" ");
            }
            for(int j=0; j<i+1; j++){
            System.out.println("*");
            }
            System.out.println();
        }
        }
    }