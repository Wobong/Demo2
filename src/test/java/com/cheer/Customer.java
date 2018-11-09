package com.cheer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Order order=new Order();
        Customer c=new Customer();
        Payment p=new Payment();
        c.order(order,p);

    }
    public void order(Order order ,Payment payment ){
        System.out.print("请问要买几件商品:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println();
        Order or=new Order();
        Item[] it = new Item[a];
        int b=0;
        or.order(it,b);
        double ad=0.0;
        System.out.println("\n");
        System.out.println("******************小票"+or.getId()+"***************");
        for (int i=0;i<it.length;i++)
        {
            System.out.println("商品名:"+it[i].getGoods().getName()+"\t$"+it[i].getGoods().getPrice()+"\t数量:"+it[i].getAmount());
            ad+=it[i].getGoods().getPrice()*it[i].getAmount();
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        or.setCreatedate(new Date());
        System.out.println("时间:"+ df.format(or.getCreatedate()));
        System.out.println("总价:"+ad);
        System.out.println("****************************************\t");
        System.out.println("***********请选择支付方式**************");
        System.out.println("\t1.阿里支付\t2.苹果支付\t3.微信支付");

        switch(sc.nextInt()){
            case 1:
                payment=new AliPay();
                payment.pay(or.getTotalMoney(it));
                break;
            case 2:
                payment=new ApplePay();
                payment.pay(or.getTotalMoney(it));
                break;
            case 3:
                payment=new WeixinPay();
                payment.pay(or.getTotalMoney(it));
                break;
        }

    }
}
