public enum HealthState {
    HEALTHY,
    UNHEALTHY;

    @Override
    public String toString() {
        if (this == HEALTHY) {
            return "Здоров";
        } else {
            return "Болен";
        }
    }
}
