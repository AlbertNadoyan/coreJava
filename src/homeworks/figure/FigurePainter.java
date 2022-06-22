package homeworks.figure;

public class FigurePainter {
    char symbol = '*';

    void figureOne(int line){
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        System.out.println();
    }

    void figureTwo(int line){
        for (int f = 0; f < line; f++) {
            for (int h = 5; h > f ; h--) {
                System.out.print(" ");
            }
            for (int l = 0; l <= f ; l++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    void figureThree(int line){
        for (int k = 0; k < line; k++) {
            for (int g = 4; g >= k ; g--) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    void figureFour(int line){
        for (int i = line; i > 0 ; i--) {
            for (int j = line; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    void figureFive(int line){
        for (int i = 0; i <= line; i++) {
            for (int j = i; j < line; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*i-1); j++) {
                System.out.print(symbol+ " ");
            }
            System.out.println("");
        }
        for (int i = line; i >= 0 ; i--) {
            for (int j = i; j <= line; j++) {
                System.out.print("  ");
            }
            for (int j = 2; j < (2*i-1); j++) {
                System.out.print(symbol+ " ");
            }
            System.out.println("");
        }
    }
}
