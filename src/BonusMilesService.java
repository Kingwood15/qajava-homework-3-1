public class BonusMilesService {
    public int calculate(int cost) {
        //int ticketPrice = 190;
        int bonusPerMile = 20;
        int bonusMiles = cost / bonusPerMile;

        return bonusMiles;
    }
}
