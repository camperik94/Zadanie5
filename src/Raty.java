
public class Raty {
	private int price;
	private int raty;
	
	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setRaty(int raty) {
		this.raty = raty;
	}

	public int getRaty() {
		return raty;
	}
	
	public Raty(int price, int raty) {
		this.price = price;
		this.raty = raty;
	}
	
	public double obliczRaty() {
		double odsetki;
		double kwota = 0;
		if(raty >= 6 && raty <= 12) {
			odsetki = 0.025;
			kwota = (price + (price * odsetki)) / raty;
		} else if(raty >=13 && raty <= 24) {
			odsetki = 0.05;
			kwota = (price + (price * odsetki)) / raty;
		}else if(raty >=25 && raty <= 48) {
			odsetki = 0.10;
			kwota = (price + (price * odsetki)) / raty;
		}
		
		return kwota;
	}
}
