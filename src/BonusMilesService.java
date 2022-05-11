public class BonusMilesService {
    public int calculate(int cost) {
        int rubForBonusMile = 20;
        int totalMiles = cost / rubForBonusMile;
        return totalMiles;
    }
}
