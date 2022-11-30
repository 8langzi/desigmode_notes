package src.behavioral.state;

public class PackageContext {

    private PackageState currentState;

    private String packageId;

    PackageContext(PackageState packageState,String packageId){
        this.currentState = packageState;
        this.packageId = packageId;
        if(currentState == null){
            this.currentState = Acknowledged.instance();
        }
    }

    public PackageState getCurrentState(){
        return currentState;
    }

    public void setCurrentState(PackageState currentState){
        this.currentState = currentState;
    }

    public String getPackageId(){
        return packageId;
    }

    public void update(){
        currentState.updateState(this);
    }



}
