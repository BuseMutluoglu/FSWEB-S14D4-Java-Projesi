import com.workintech.S14D4.Enum.ChocolateType;
import com.workintech.S14D4.MonsterForRPGGame.Monster;
import com.workintech.S14D4.MonsterForRPGGame.Poisonable;
import com.workintech.S14D4.MonsterForRPGGame.Troll;
import com.workintech.S14D4.MonsterForRPGGame.Werewolf;
import com.workintech.S14D4.ProductForSale.Chocolate;
import com.workintech.S14D4.ProductForSale.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] product=new ProductForSale[5];
        product[0]=new Chocolate("silindir",4,"Siyah çikolata", 4,ChocolateType.GUM);
        System.out.println("******************************");
        listProducts(product);
     /*   ProductForSale productForSale=new Chocolate("Chocolate", 4,"chocolate sold",1,ChocolateType.GUM);
        System.out.println(productForSale);
        System.out.println("Description******************************");
        System.out.println(productForSale.getDescription());
        System.out.println("Details******************************");
        productForSale.showDetails();
        System.out.println("SalesPrice******************************");
        System.out.println(productForSale.getSalesPrice(3));
        Chocolate chocolate=new Chocolate("Chocolate", 4,"chocolate sold",1,ChocolateType.GUM);
        System.out.println("Details******************************");
        chocolate.showDetails();
*/

        Monster monster=new Werewolf("wolf",3,4);
        System.out.println(monster);
        System.out.println("attack " + monster.attack() +" Monster: " + monster.getClass().getSimpleName());
        System.out.println("bleed " + monster.bleed() +" Monster: " + monster.getClass().getSimpleName());
        System.out.println("poison " + monster.poison() +" Monster: " + monster.getClass().getSimpleName());
        Monster monster1=new Troll("Shake",4,4.4);
        System.out.println("attack " + monster1.attack()  + " Monster: " + monster1.getClass().getSimpleName());
        System.out.println("poison " + monster1.poison()  + " Monster: " + monster1.getClass().getSimpleName());
        System.out.println("bleed " + monster1.bleed()  + " Monster: " + monster1.getClass().getSimpleName());
    }

    public static void listProducts(ProductForSale[] products) {
        if(products != null){
            for (ProductForSale product: products ) {
                if(product != null) {
                    product.showDetails();
                }
            }
        }

    }
}