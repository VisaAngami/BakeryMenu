import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // cakes

        Cake c=new Cake();
        c.setname("Chocolate Cake");
        c.setprice(500);
        c.setFlavour("Chocolate");

        Cake c1=new Cake();
        c1.setname("Strawberry Cake");
        c1.setprice(600);
        c1.setFlavour("Strawberry");

        Cake c2=new Cake();
        c2.setname("Creamy Cake");
        c2.setprice(650);
        c2.setFlavour("Vanilla");

        Cake c3=new Cake();
        c3.setname("Lemon Cake");
        c3.setFlavour("Lemon ");

        //Pastry
        Pastry p=new Pastry();
        Pastry p1=new Pastry();
        Pastry p2=new Pastry();
        Pastry p3=new Pastry();

        p.setname("Puff Pastry");
        p.setprice(100);
        p.setFlavour("Creamy Milk");

        p1.setname("Flaky and Puff Pastry");
        p1.setprice(200);
        p1.setFlavour("Coconut and blackberry");

        p2.setname("Viennoiserie");
        p2.setprice(150);
        p2.setFlavour("Vanilla");

        p3.setname("Choux Pastry");
        p3.setprice(250);
        p3.setFlavour("Butter and Egg");

        //List for Cake

        List <Cake> cakeList=new ArrayList();
        cakeList.add(c);
        cakeList.add(c1);
        cakeList.add(c2);
        cakeList.add(c3);

        System.out.println("Special Cake's Menu");
        System.out.println("_______________________________________");

        for(Cake cake:cakeList){
            cake.display();
        }

        System.out.println("_______________________________________");
        System.out.println();

        //List for Pastry

        List <Pastry> pastryList=new ArrayList();
        pastryList.add(p);
        pastryList.add(p1);
        pastryList.add(p2);
        pastryList.add(p3);

        System.out.println("Special Pastry's");
        System.out.println("_________________________________________");
        System.out.println();

        for(Pastry pastry: pastryList){
            pastry.display();
        }

    }
}
