package jpmorgan.banking.newmodel;

import java.util.*;

public class MyClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Goods[] go = new Goods[4];
		for(int i = 0; i<4; i++) {
			int a = Integer.parseInt(sc.nextLine());
			String b = sc.nextLine();
			double c = Double.parseDouble(sc.nextLine());
			String d = sc.nextLine();
			go[i] = new Goods(a,b,c,d);
		}
		String e = sc.nextLine();
		int ans1 = countGoodsByBrand(go,e);
		if(ans1==0)
			System.out.println("No such goods for the required brand available");
		else
			System.out.println(ans1);
		Goods ans2 = getSecondHighestpriceGoods(go);
		if(ans2==null)
			System.out.println("No such goods available");
		else {
			System.out.println(ans2.getId());
			System.out.println(ans2.getName());
			System.out.println(ans2.getPrice());
			System.out.println(ans2.getBrand());
		}

	}
	public static int countGoodsByBrand(Goods[] goods, String value ){
		int count = 0;
		for(int i=0; i<goods.length; i++){
			if(goods[i].getBrand().equalsIgnoreCase(value)){
				count++;
			}
		}

		return count;
	}
	public static Goods getSecondHighestpriceGoods(Goods[] goods){
		double[] prices = new double[4];
		for(int i=0; i<goods.length; i++){
			prices[i] = goods[i].getPrice();
		}
		Arrays.sort(prices);
		double finalPrice = prices[prices.length-2];
		if(finalPrice > 500){
			for(int i=0; i<goods.length; i++){
				if(finalPrice == goods[i].getPrice()){
					return goods[i];
				}
			}
		}

		return null;
	}

}

class Goods{
	private int goodsId;
	private String goodsName;
	private double price;
	private String brand;

	public int getId(){
		return this.goodsId;
	}
	public void setId(int goodsId){
		this.goodsId =  goodsId;
	}

	public String getName(){
		return this.goodsName;
	}
	public void setName(String goodsName){
		this.goodsName =  goodsName;
	}

	public double getPrice(){
		return this.price;
	}
	public void setPrice(double price){
		this.price =  price;
	}

	public String getBrand(){
		return this.brand;
	}
	public void setBrand(String brand){
		this.brand =  brand;
	}

	public Goods(int goodsId, String goodsName, double price, String brand){
		this.goodsId =  goodsId;
		this.goodsName =  goodsName;
		this.price =  price;
		this.brand =  brand;
	}
}
