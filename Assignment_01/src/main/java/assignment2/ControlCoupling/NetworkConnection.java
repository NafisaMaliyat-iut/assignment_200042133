package assignment2.ControlCoupling;

public class NetworkConnection {
    String networkStatus;

    //here the ping passed as parameter influences internal attributes
    //ping controls the networkStatus
    public String networkConnectionStatus(int ping){
        if(ping>0 && ping <=20)
            this.networkStatus = "Great";
        else if(ping>20 && ping<=50)
            this.networkStatus = "Good";
        else if(ping>50 && ping<=100)
            this.networkStatus = "Fair";
        else
            this.networkStatus = "Poor";

        return this.networkStatus;
    }
}
