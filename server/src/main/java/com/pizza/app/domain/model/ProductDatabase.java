package com.pizza.app.domain.model;

import com.pizza.app.domain.dto.ProductDto;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Optional;

@Component
public class ProductDatabase {
    private ArrayList<ProductDto> productList = new ArrayList<>();

    @PostConstruct
    public void init() {
        ProductDto margherita = new ProductDto("pizza",0,"Margherita", 30,3100,"/files/0.png","Sos pomidorowy, ser, oregano");
        ProductDto salami = new ProductDto("pizza",1,"Pizza Salami", 25,2600,"/files/1.png","Salami, cebula, sos pomidorowy");
        ProductDto capriciosa = new ProductDto("pizza",2,"Capriciosa", 25,2600,"/files/2.png","Sos pomidorowy, ser, szynka, pieczarki, oregano");
        ProductDto basilia = new ProductDto("pizza",3,"Basilia", 30,2900,"/files/3.png","Sos pomidorowy, ser mozzarella, pomidory koktajlowe, bazylia, oregano");
        ProductDto marinara = new ProductDto("pizza",4,"Marinara", 25,2500,"/files/4.png","Sos pomidorowy, czosnek, bazylia");
        ProductDto neapolitana = new ProductDto("pizza",5,"Neapolitana",30,2800,"/files/5.png","Sos pomidorowy, ser, salami, oliwki zielone, papryczki jalapenos, oregano");
        ProductDto parma = new ProductDto("pizza",6,"Parma",25,2700,"/files/6.png","Sos pomidorowy, ser mozzarella, szynka, bazylia, oregano");
        ProductDto quattroFromaggi = new ProductDto("pizza",7,"Quattro Fromaggi", 30,2800,"/files/7.png","Sos pomidorowy, ser, ser mozzarella, ser sałatkowy, ser plesniowy, oregano");
        ProductDto prosciuttoRucola = new ProductDto("pizza",8, "Prosciutto e rucola", 25 ,2800,"/files/8.png","Sos pomidorowy, szynka, ser, pomidory koktajlowe, rukola, mozzarella");
        ProductDto pizzaKebab = new ProductDto("pizza",9,"Pizza Kebab", 30,3000,"/files/9.png","Kurczak gyros, cebula, sos Gyros");
        ProductDto pepsi = new ProductDto("drink",10,"Pepsi", 330,500,"/files/10.png","Oryginalna, lime, cherry, max, light");
        ProductDto nestea = new ProductDto("drink",11,"Nestea",500,550,"/files/11.png","Brzoskwiniowe, cytrynowe, zielona herbata, mango");
        ProductDto sprite = new ProductDto("drink",12,"Sprite",330,500,"/files/12.png","Lime, Cranberry, ogórkowy, cherry");
        ProductDto cappy = new ProductDto("drink",13,"Cappy",250,450,"/files/13.png","Jabłkowy, pomarańczowy, truskawkowy");
        ProductDto burn = new ProductDto("drink",14,"Burn",250,540,"/files/14.png","Napój energetyczny");
        ProductDto salaQuat = new ProductDto("50/50",15,"Salami / Quatro Fromaggi", 30, 2800,"/files/15.png","Połowa pizzy salami, druga połowa quatro Fromaggi");
        ProductDto margBasi = new ProductDto("50/50",16,"Margherita / Basilia", 30, 2900,"/files/16.png","Połowa pizzy Margherita, druga połowa Basilia");
        ProductDto caprMari = new ProductDto("50/50",17,"Capriciosa / Marinara", 30, 2900,"/files/17.png","Połowa pizzy Capriciosa, druga połowa Marinara");
        ProductDto prosSala = new ProductDto("50/50",18,"Prosciutto e rucola / Salami", 30, 3000,"/files/18.png","Połowa pizzy Prosciutto e rucola, druga połowa Salami");
        ProductDto basiNeap = new ProductDto("50/50",19,"Basilia / Neapolitana", 30, 3100,"/files/19.png","Połowa pizzy Basilia, druga połowa Neapolitana");
        ProductDto prosQuat = new ProductDto("50/50",20,"Prosciutto e rucola / Quattro Fromaggi", 30, 3100,"/files/20.png","Połowa pizzy Prosciutto e rucola, druga połowa quatro Fromaggi");
        ProductDto bundleMariSala = new ProductDto("set", 21, "Marinara + Pizza Salami", 25,4900,"/files/two_pizzas.jpg","Zestaw pizz, Marinara i Pizza Salami");
        ProductDto bundleMargCapr = new ProductDto("set", 22, "Margherita + Capriciosa", 30,5200,"/files/two_pizzas.jpg","Zestaw pizz, Margherita i Capriciosa");
        ProductDto bundleParmNeap = new ProductDto("set", 23, "Parma + Neapolitana", 30,5000,"/files/two_pizzas.jpg","Zestaw pizz, Parma i Neapolitana");
        ProductDto bundleBasiKeba = new ProductDto("set", 24, "Basilia + Pizza Kebab", 30,5500,"/files/two_pizzas.jpg","Zestaw pizz, Basilia i Pizza Kebab");
        ProductDto bundleMariSalaPeps = new ProductDto("set", 25, "Marinara + Pizza Salami + Pepsi", 25,5100,"/files/two_pizzas_pepsi.jpg","Zestaw pizz, Marinara i Pizza Salami z napojem Pepsi");
        ProductDto bundleMargCaprPeps = new ProductDto("set", 26, "Margherita + Capriciosa + Pepsi", 30,5400,"/files/two_pizzas_pepsi.jpg","Zestaw pizz, Margherita i Capriciosa z napojem Pepsi");
        ProductDto bundleParmNeapPeps = new ProductDto("set", 27, "Parma + Neapolitana + Pepsi", 30,5200,"/files/two_pizzas_pepsi.jpg","Zestaw pizz, Parma i Neapolitana z napojem Pepsi");
        ProductDto bundleBasiKebaPeps = new ProductDto("set", 28, "Basilia + Pizza Kebab + Pepsi", 30,5700,"/files/two_pizzas_pepsi.jpg","Zestaw pizz, Basilia i Pizza Kebab z napojem Pepsi");

        productList.add(margherita);
        productList.add(salami);
        productList.add(capriciosa);
        productList.add(marinara);
        productList.add(basilia);
        productList.add(neapolitana);
        productList.add(parma);
        productList.add(quattroFromaggi);
        productList.add(prosciuttoRucola);
        productList.add(pizzaKebab);
        productList.add(pepsi);
        productList.add(nestea);
        productList.add(sprite);
        productList.add(cappy);
        productList.add(burn);
        productList.add(salaQuat);
        productList.add(margBasi);
        productList.add(caprMari);
        productList.add(prosSala);
        productList.add(basiNeap);
        productList.add(prosQuat);
        productList.add(bundleMariSala);
        productList.add(bundleMargCapr);
        productList.add(bundleParmNeap);
        productList.add(bundleBasiKeba);
        productList.add(bundleMariSalaPeps);
        productList.add(bundleMargCaprPeps);
        productList.add(bundleParmNeapPeps);
        productList.add(bundleBasiKebaPeps);
    }

    public ArrayList<ProductDto> getAllProducts() {
        return productList;
    }

    public ProductDto findProductById(Integer id) {
        return  getAllProducts().get(id);
    }

    public ArrayList<ProductDto> getHalfPizza() {
        ArrayList<ProductDto> listOfHalfPizzas = new ArrayList<>();

        for (int i = 15; i < 21; i++) {
            listOfHalfPizzas.add(productList.get(i));
        }

        return listOfHalfPizzas;
    }

    public ArrayList<ProductDto> getSets() {
        ArrayList<ProductDto> listOfSets = new ArrayList<>();

        for (int i = 21; i < 29; i++) {
            listOfSets.add(productList.get(i));
        }

        return listOfSets;
    }

    public ArrayList<ProductDto> getNewProduct() {
        ArrayList<ProductDto> listOfNewProducts = new ArrayList<>();

        for (int i = 5; i < 9; i++) {
            listOfNewProducts.add(productList.get(i));
        }

        return listOfNewProducts;
    }
}
