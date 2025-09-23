public class CocoaPowderAdapter implements Powder {
    private final CocoaPowder powder;

    public CocoaPowderAdapter(CocoaPowder powder) {
        this.powder = powder;
    }

    @Override
    public void getPowder() {
        powder.getCacaoPowder();
    }
}