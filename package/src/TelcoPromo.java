public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart", 500, 15, false);
        TelcoSubscription globe = new Telco("Globe", 450, 10, true);
        TelcoSubscription ditto = new Telco("Ditto", 400, 8, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("\nSmart's Promo Package: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe's Promo Package: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto's Promo Package: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}