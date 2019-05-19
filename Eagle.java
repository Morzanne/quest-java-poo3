public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = true;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    public void takeOff(){
        if(!this.flying && this.altitude ==0){
            this.flying = true;
            System.out.printf("%s take off in the sky %n", this.getName());
        }  
    }
    public int ascend(int meters){
        if(this.flying){
            this.altitude = Math.min(this.altitude + meters, 3000);
            System.out.printf("%s flies upward, altitude:%d%n",this.getName(),this.altitude);
        }
        return this.altitude;
    }
    public int descend(int meters){
        if(this.flying){
            this.altitude=Math.max(this.altitude-meters,0);
            System.out.printf("%s flies downward, altitude:%d%n",this.getName(),this.altitude);
        }
        return this.altitude;
    }
    
    public void land(){
        System.out.println(this.altitude);
        if(this.flying && this.altitude == 1){
            this.flying = false;
            System.out.printf("%s lands on the ground %n", this.getName());
        }else{
            System.out.printf("%s is too high, it can't lands. %n", this.getName());
        }
    }


}
