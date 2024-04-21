public interface TelcoSubscription {

    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
    public String getTelcoName();
    public int getDataAllowance();
    public boolean getUnliCallText();
    public double getPromoPrice();



}
