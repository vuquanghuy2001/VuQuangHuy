package ExceptionHanding;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerFromFileWithCatch {
    public static void main(String[] args) {
       try{
           Scanner in=new Scanner(new File("test.in"));
       }catch (FileNotFoundException ex){
           ex.printStackTrace();
       }
    }
}
