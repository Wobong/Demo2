package com.cheer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Order {
    Scanner sc=new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private Item[] items;

    public Date getCreatedate() {
        return createdate;
    }

    private Date createdate;


    public Item[] getItems() {
        return items;
    }





    public void setCreatedate(Date createdate) {

        this.createdate = createdate;
    }

    public void order(Item[] items,int id){
        this.id=id+1;
          this.items=items;
        for (int j = 0; j < items.length; j++){
            items[j]=new Item();
            System.out.println("************分割线************");
            System.out.println("\t1.海龙哥西瓜霜\t120块");
            System.out.println("\t2.海龙哥大宝剑\t250块");
            System.out.print("请输入商品序号:");
            int a=sc.nextInt();
            switch (a){
                case 1:
                    Goods g1=new Goods();
                    g1.Goods("海龙哥西瓜霜",120);

                    items[j].setGoods(g1);
                    System.out.print("买几瓶:");
                    items[j].setAmount(sc.nextInt());
                    break;
                case 2:
                    Goods g2=new Goods();
                    g2.Goods("海龙哥大宝剑",250);

                    items[j].setGoods(g2);
                    System.out.print("买几把:");
                    items[j].setAmount(sc.nextInt());
                    break;
            }


        }
    }
    public double getTotalMoney(Item[] items){
        double money=0.0;
        this.items=items;
        for(int i=0;i<getItems().length;i++)
        {
            money+= getItems()[i].getGoods().getPrice()*getItems()[i].getAmount();
        }
        return money;
    }
}
class Item{


    private Goods goods;
    private int amount;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
class Goods{
    private double price;
    private String name;
    public void Goods(String name,double price){
        this.name=name;
        this.price=price;
    }
    public double getPrice() {
        return price;
    }



    public String getName() {
        return name;
    }





}