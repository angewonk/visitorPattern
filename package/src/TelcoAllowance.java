import java.util.*;
public class TelcoAllowance implements UsagePromo {

    private static Map<String, Double> usageMap = new HashMap<>();

    static{
        usageMap.put("Smart", 15.0);
        usageMap.put("Globe", 10.0);
        usageMap.put("Ditto", 8.0);
    }

    @Override
    public String showAllowance(String telcoName, double money){
        double allowance = usageMap.getOrDefault(telcoName,0.0);
        return telcoName + " offers an allowance of " + allowance +" GB for " + money + " per month";
    }
}
