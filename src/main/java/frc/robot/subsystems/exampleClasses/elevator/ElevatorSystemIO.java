package frc.robot.subsystems.exampleClasses.elevator;
import org.littletonrobotics.junction.AutoLog;

public interface ElevatorSystemIO {

    @AutoLog
    public static class ElevatorSystemIOInputs{
        public boolean[] connected = new boolean[] {};
        public double velocity = 0.0;
        public double appliedVoltage = 0.0;
        public double supplyCurrentAmps = 0.0;
        public double torqueCurrentAmps = 0.0;
        public double tempCelsius = 0.0;
        public double encoderPosition = 0.0;
        public double goal = 0.0;
    }

    default void updateInputs(ElevatorSystemIOInputs inputs) {}
    //run elevator system to goToGoal to a height
    default void setVoltage(double volts) {}


}
