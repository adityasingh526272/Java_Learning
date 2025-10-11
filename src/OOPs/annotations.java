package OOPs;

@FunctionalInterface
interface myFunctionInterface{
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 p.m.");
    }
    public int sum(int a, int b){
        return a+b;
    }
}
public class annotations {
    @SuppressWarnings( "Deprecation" )
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5,6);
    }
}
