package bai8;

public class CodeLeanA {
    public void methodPublic(){
        methodPrivate();
    }
    protected void methodProtected(){
        methodPrivate();
    }
    void methodDefault(){
        methodPrivate();
    }
    private void methodPrivate(){}
}
