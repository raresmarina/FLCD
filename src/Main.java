import model.MyScanner;
import model.SymbolTable;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Program 1");
        MyScanner scanner1 = new MyScanner("src/assets/test1/program1.txt",
                "src/assets/test1/pif1.txt",
                "src/assets/test1/st1.txt");
        scanner1.scan();

        System.out.println();
        System.out.println("Program 2");
        MyScanner scanner2 = new MyScanner("src/assets/test2/program2.txt",
                "src/assets/test2/pif2.txt",
                "src/assets/test2/st2.txt");
        scanner2.scan();

        System.out.println();
        System.out.println("Program 3");
        MyScanner scanner3 = new MyScanner("src/assets/test3/program3.txt",
                "src/assets/test3/pif3.txt",
                "src/assets/test3/st3.txt");
        scanner3.scan();

        System.out.println();
        System.out.println("Program Err");
        MyScanner scannerErr = new MyScanner("src/assets/testErr/programErr.txt",
                "src/assets/testErr/pifErr.txt",
                "src/assets/testErr/stErr.txt");
        scannerErr.scan();

    }
}