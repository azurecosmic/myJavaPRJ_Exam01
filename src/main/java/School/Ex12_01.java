package School;

class car{
    String color2;
    int speed;

    void upSpeed(int value){
        speed = speed + value;
    }

    void downSpeed(int value){
        speed = speed - value;
    }
}

class Sedan extends Car{
    int seatNum;

    int getSeatNum(){
        return seatNum;
    }
}

class Truck extends Car{
    int capacity;

    int getCapacity(){
        return capacity;
    }
}



public class Ex12_01 {
    public static void main(String[] args) {

        Sedan sedan = new Sedan();
        Truck truck1 = new Truck();

        sedan1.upspeed(300);
        truck1.upspeed(100);

        sedan1.seatNum = 5;
        truck.capacity = 50;

        System.out.println("승용차의 속도는 " + sedan1.speed + "km, 좌석수는 " +sedan1.getSeatNum() + "개 입니다");
        System.out.println("트럭의 속도는 " + truck1.speed + "km, 적재량은 " +truck1.getCapacity() + "톤 입니다"); //부모꺼 쓰면 언제든 가져다가 쓸 수 이삳,
    }
}



