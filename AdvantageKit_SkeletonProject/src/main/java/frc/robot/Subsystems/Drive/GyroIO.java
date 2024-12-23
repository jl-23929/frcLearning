public interface GyroIO { }

    public static class GyroIOInputs implements LoggableInputs {

        public double gyroYawPosition;

        public void toLog(LogTable table) {
            table.put("GyroYawPosition", gyroYawPosition);
        }

        public void fromLog(LogTable table) {
            gyroYawPosition = table.getDouble("GyroYawPosition", gyroYawPosition);
        }

    }

    public default void updateInputs(GyroIOInputs inputs) {}

}