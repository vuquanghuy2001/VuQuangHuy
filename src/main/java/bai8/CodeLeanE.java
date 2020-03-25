package bai8;
import bai8.CodeleanB;
public class CodeLeanE extends CodeleanB {
    public static void main(String[] args) {
        new CodeleanB().methodPunlic();
        new CodeleanB().methoProtected();
        new CodeLeanE().methoProtected();
    }
}
