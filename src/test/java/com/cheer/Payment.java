package com.cheer;

public class Payment {
    public void pay(double money){
        System.out.println("支付"+money+"元！");
    }
}
class AliPay extends Payment{
    public void pay(double money){
        System.out.println("阿里支付"+money+"元！");
    }
}
class ApplePay extends Payment{
    public void pay(double money){
        System.out.println("苹果支付"+money+"元！");
    }
}
class WeixinPay extends Payment{
    public void pay(double money){
        System.out.println("微信支付"+money+"元！");
    }
}