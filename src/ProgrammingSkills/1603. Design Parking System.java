class ParkingSystem {
    private int big,medium,small;
    private int nowB = 0,nowM = 0,nowS=0;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        addOne(carType);
        int slot = getSlot(carType);
        System.out.println(carType+"\t"+slot);
        switch(carType){
            case 1:
                return slot<=big;
            case 2:
                return slot<=medium;
            default:
                return slot<=small;
        }
    }
    private void addOne(int carType){
        switch(carType){
            case 1:
                this.nowB++;
                break;
            case 2:
                this.nowM++;
                break;
            case 3:
                this.nowS++;
                break;
        }
    }
    private int getSlot(int carType){
        switch(carType){
            case 1:
                return this.nowB;
            case 2:
                return this.nowM;
            default:
                return this.nowS;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
