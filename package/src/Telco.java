public class Telco implements TelcoSubscription{

    public String telcoName;
    double promoPrice;
    int dataAllowance;
    boolean unliCallText;

    public Telco(String telcoName, double promoPrice, int dataAllowance, boolean unliCallText){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public String accept(UsagePromo promo, double price){

        return promo.showAllowance(telcoName, promoPrice);
    }
    public String accept(UnliCallsTextOffer unli, boolean unliCallText){
        this.unliCallText = unliCallText;
        return unli.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public void setTelcoName(String telcoName){
        this.telcoName= telcoName;
    }

    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;

    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice(){
        return promoPrice;
    }

    public int getDataAllowance(){
        return dataAllowance;
    }

    public boolean isUnliCallText(){
        return unliCallText;
    }

    public void setDataAllowance(int dataAllowance){
        this.dataAllowance= dataAllowance;
    }

    public void setUnliCallText(boolean unliCallText){
        this.unliCallText=unliCallText;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }





}
