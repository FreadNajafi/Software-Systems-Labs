package coe318.lab7;

public class VoltageSource extends Components {
    private static int numVol = 1;
    private int identity;
 
     /**
     * @param voltage
     * @param node1
     * @param node2
      */
    public VoltageSource(double voltage, int node1, int node2){
        if (voltage==0){
            throw new IllegalArgumentException("Voltage can't be zero");
        }
        else if (node1<0){
            throw new IllegalArgumentException("The first node can't be negative");
        }
        else if (node2<0){
            throw new IllegalArgumentException("The second node can't be negative");
        }
        else{
            this.a = node1;
            this.b = node2;
            this.value = voltage;
            this.identity = numVol;
            numVol ++;
        }
    }
    
    
    @Override
    public String toString() {
        String s = "V" + this.identity + " " + this.a + " " + this.b + " DC " + this.value;
        return s;
    }
}