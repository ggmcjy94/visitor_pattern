public class Snack implements Element{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("과자가 준비되았습니다.");
        visitor.visit(this);
    }
}
