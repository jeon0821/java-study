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

        int x=1;
        for(int i=0; i<6; i++){
            for(int n=5; n>i; n--){
                System.out.println(" ");
            }
            for(int m=0; m<x; m++){
                System.out.println("*");
            }

            x=x+2; // 별을 홀수로 출력함
            System.out.println();
        }
        }
    }