package BusReserve;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;

    Bus(int no,boolean ac,int cap){
        this.busno=no=no;
        this.ac=ac;
        this.capacity=cap;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
            capacity=cap;
    }

    public boolean isAc(){
        return ac;
    }
    public void getAc(boolean val){
        ac=val;
    }


    public int getBusno(){
        return busno;
    }


    public void displayBusInfo(){
        System.out.println("Bus No : "+busno+" Ac : "+ ac+" Total Capacity: "+capacity);
    }

}


