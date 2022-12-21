import java.lang.Math;

class Cpu {
    public String brandName;
    public int baseClockSpeed = 3200;
    public int maxClockSpeed = 4200;
    public int currentClockSpeed;
    private boolean onState;

    private void CpuIsOff() {
        System.out.println("Cannot overclock or turn off overclocking, CPU is turned off.");
    }

    // Start the CPU with 1000 - 3200 base clock speed
    public void startCpu(String cpuState) {
        onState = true;
        int minSpeed = 1000;
        int maxSpeed = 3200;
        int currentClockSpeed = (int) Math.floor(Math.random() * (maxSpeed - minSpeed + 1) + minSpeed);

        if (cpuState == "Started") {
            System.out.println(brandName + " CPU resumes to base clock speed of " + currentClockSpeed);
        } else if (cpuState == "InitialStart") {
            System.out.println(brandName + " CPU started with clock speed of " + currentClockSpeed);
        }
    }

    // Overclock the CPU to reach at the maximum speed
    public void overClock() {
        if (!onState) {
            CpuIsOff();
            return;
        }

        currentClockSpeed = 4200;
        System.out.println(brandName + " CPU is now overclocked with the maximum speed of " + currentClockSpeed);
    }

    // Turn off overclocking on the CPU
    public void offOverClock() {
        if (!onState) {
            CpuIsOff();
            return;
        }
        startCpu("Started");
    }

    // Turns off the cpu
    public void turnOffCpu() {
        onState = false;
    }
}

public class Intel extends Cpu {
    public static void main(String[] args) throws Exception {
        Cpu intelCpu = new Cpu();
        intelCpu.brandName = "Intel";
        intelCpu.startCpu("InitialStart");
        intelCpu.overClock();
    }
}
