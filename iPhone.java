public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
    @Override
    public String ring() {
		return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone X from " + this.getCarrier());
        System.out.println("iPhone X from "+this.getRingTone());
    }
}