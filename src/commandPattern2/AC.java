package commandPattern2;

public class AC {
    private boolean isOn;

    private int temp = 24;

    private int fanSpeed = 3;

    public AC() {

    }

    public int getTemp() {
        return temp;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        System.out.println("Set Speed to " + fanSpeed);
    }

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.println("Set Temp to " + temp);
    }

    public void turnOn() {
        System.out.println("Turning On the ac");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Turning off the ac");
        isOn = false;
    }

    public void decTemp() {
        temp--;
        System.out.println("Decreasing The temperature to : " + temp);

    }

    public void incTemp() {
        temp++;
        System.out.println("Increasing the temperature to : " + temp);
    }

    public void incSpeed() {
        fanSpeed++;
        System.out.println("Increasing the Speed to : " + fanSpeed);
    }

    public void decSpeed() {
        fanSpeed--;
        System.out.println("Decreasing the Speed to : " + fanSpeed);
    }


}
