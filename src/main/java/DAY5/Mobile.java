package DAY5;

public class Mobile extends computer
{
    private String OperatingSystem;
    private boolean CanMakeCall;
    private String providerName; //Rogers, Bell, Telus

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public boolean isCanMakeCall() {
        return CanMakeCall;
    }

    public void setCanMakeCall(boolean canMakeCall) {
        CanMakeCall = canMakeCall;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
