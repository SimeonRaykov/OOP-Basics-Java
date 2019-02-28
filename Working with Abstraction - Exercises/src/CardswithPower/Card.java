package CardswithPower;

public class Card {

    private RankPowers rankPower;
    private SuitPowers suitPower;

    public Card(RankPowers rankPower, SuitPowers suitPower) {
        this.rankPower = rankPower;
        this.suitPower = suitPower;
    }

    public int getFinalValue() {
        return getRankPower().getValue() + getSuitPower().getValue();
    }

    public RankPowers getRankPower() {
        return rankPower;
    }

    public void setRankPower(RankPowers rankPower) {
        this.rankPower = rankPower;
    }

    public SuitPowers getSuitPower() {
        return suitPower;
    }

    public void setSuitPower(SuitPowers suitPower) {
        this.suitPower = suitPower;
    }
}
