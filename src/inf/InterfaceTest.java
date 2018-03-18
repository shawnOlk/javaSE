package inf;

public interface InterfaceTest{
    public static final int a=1;
    static void staticFunction(){

        System.out.println("staticFunction");
    }
    default void defaultFunction(){
        System.out.println("defaultFunction");


    }



}