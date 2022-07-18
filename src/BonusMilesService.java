public class BonusMilesService {
    public int calculate (int cost) {
        int miles = cost > 1000 ? cost / 100 : 0;
        return miles;
    }
}
