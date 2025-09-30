package OOPs;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k ");
    }
}

interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}
class MySmartPhone2 extends MyCellPhone implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Taking Snap");
    }
    //    public void record4kVideo(){
//        System.out.println("Taking Snap and recording in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Aadi", "Bunty", "Akash"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // this is a smartphone but, use it as camera
//        cam1.getNetworks(); --> Not allowed
//        cam1.sampleMeth(); --> Not allowed

        cam1.record4kVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(545548);
    }
}

