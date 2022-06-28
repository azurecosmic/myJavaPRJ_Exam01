package School;

public class Car {
    private int speed = 0;

    public int getSpeed(){
        return speed;
    }

    public void upSpeed(int value){
        if (speed + value > 200){
            speed = 20;
        } else{
            speed += value;
        }
        System.out.println("현재 속도 : " + getSpeed());
    }

    public void downSpeed(int value) {
        if (speed - value < 0) {
            speed = 0;
        }else {
            speed -= value;
        }

        System.out.println("현재속도 : " + getSpeed());

    }

    public int getSpeed(){
        return speed;
    }
}

public class Ex11_05{
    public static void main(String[] args) {
        Car myCar1 = new Car();

        myCar1.upspeed(100);
        myCar1.upspeed(150);
        myCar1.downspeed(50);
        myCar1.downspeed(100);


    }
}

