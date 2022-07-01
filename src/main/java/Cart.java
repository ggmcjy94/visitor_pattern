import java.util.ArrayList;
import java.util.Arrays;

public class Cart implements Element{

    ArrayList<Element> cart = new ArrayList<>();

    public Cart() {
        cart.add(new Milk());
        cart.add(new Snack());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("카트가 준비되았습니다.");
        visitor.visit(this);

        for (Element element : cart) {
            element.accept(visitor);
        }
    }
}
