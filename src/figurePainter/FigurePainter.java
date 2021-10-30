package figurePainter;

public class FigurePainter {
    void figureOne(int count,char c) {
        for (int i = 0; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(" kuk");
            }
            for (int b = 1; b <= i; b++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    void figureTwo() {
        for (int i = 4 - 1; i >= 0; i--) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 4 - i - 1; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void figureThree() {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for(int k=4;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void figureFour(){
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k=i;k<5;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




