package observer1;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		UpdateSMS updateSMS = new UpdateSMS();
		
		cryptoCurrencyPrice.addObserver(updateSMS);
		
		cryptoCurrencyPrice.setBitcoinPrice(75000);
		cryptoCurrencyPrice.setEtherPrice(20000);

	}

}
