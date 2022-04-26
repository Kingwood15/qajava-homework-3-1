public class BonusMilesService {
    public int calculate(int cost) {
        int bonusPerMile = 20;
        int bonusMiles = cost / bonusPerMile;

        return bonusMiles;
    }
}
