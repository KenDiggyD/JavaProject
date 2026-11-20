package model.model;
public enum State {
    SPARE_PARTS("Spare Parts",false),
    HOT_SPARE("Hot Spare",false),
    COLD_SPARE("Cold Spare",false),
    RUNNING("Running",true),
    STANDBY("Standby",true),
    DOWN("Down",true),
    SPARE("Spare/New",false),
    RACKED("Racked",false),
    RESERVE("Reserve",false),
    REPAIRS("Under Repairs/Maintenance", false);

    State(String status, boolean service) {
        this.status = status;
        this.service = service;
    }

    private String status;
    private boolean service;

    public String getState() {
        return status;
    }

    public boolean getInService() {
        return service;
    }

    @Override public String toString() {
        if (service) {
            return status + " (In Service)";
        } else {
            return status + " (Not in Service)";
        }
    }


}
