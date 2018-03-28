package pattern;

/**
 * Created by sunlei on 2018/3/27.
 */
public class ToyBuilder {
    private String head;
    private String foot;
    private String hand;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public static class Builder {
        private ToyBuilder toyBuilder;

        public Builder() {
            toyBuilder = new ToyBuilder();
        }

        public Builder builHead(String head) {
            toyBuilder.setHead(head);
            return this;
        }

        public Builder builFoot(String foot) {
            toyBuilder.setFoot(foot);
            return this;
        }

        public Builder builHand(String hand) {
            toyBuilder.setHand(hand);
            return this;
        }

        public ToyBuilder build() {
            return toyBuilder;
        }

    }

    @Override
    public String toString() {
        return "ToyBuilder{" +
                "head='" + head + '\'' +
                ", foot='" + foot + '\'' +
                ", hand='" + hand + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ToyBuilder toyBuilder = new ToyBuilder.Builder().builFoot("foot").builHand("hand").build();

        System.out.println(toyBuilder);
    }
}
