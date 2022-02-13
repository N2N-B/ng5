package completejava;

public class CurrencyConverter {
	int rupee = 63; // India

	int dirham = 3; // UAE

	int real = 3; // Brazil

	int chilean_peso = 595;// Chile

	int mexican_peso = 18;// Mexico

	int _yen = 107;// Japan

	int $australian = 2; // Australian dollar

	int dollar; // US

	final int Rupee = 63; // Indonesia

	void printCurrencies() {
		System.out.println("US Dollar to Indian Rupee Exchange Rate: " + rupee);
		System.out.println("US Dollar to UAE Dirham Exchange Rate: " + dirham);
		System.out.println("US Dollar to Brazil Real Exchange Rate: " + real);
		System.out.println("US Dollar to Chile Peso Exchange Rate: " + chilean_peso);
		System.out.println("US Dollar to Mexico Peso Exchange Rate: " + mexican_peso);
		System.out.println("US Dollar to Japan Yen Exchange Rate: " + _yen);
		System.out.println("US Dollar to Australian Dollar Exchange Rate: " + $australian);
		System.out.println("America currency: " + dollar);
		System.out.println("US Dollar to Indonesia Rupee Exchange Rate: " + Rupee);
	}

	public static void main(String[] args) {
		CurrencyConverter currencyConverter = new CurrencyConverter();
		currencyConverter.printCurrencies();
	}
}
