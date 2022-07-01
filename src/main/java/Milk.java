public class Milk implements Element{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("우유가 준비되았습니다.");
        visitor.visit(this);
    }
}
