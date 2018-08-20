package lambdas_primer_acercamiento.utils;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;

import lambdas_primer_acercamiento.DetalleFactura;
import lambdas_primer_acercamiento.Factura;

public class FacturaUtils {
	
	
	private static Double MIN_LIMIT = 0.0;
	private static Double MAX_LIMIT = 10.0;
	private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final int RANDOM_STRING_LENGTH = 10;
	
	
	
	public static void getElapsedTime(LocalTime localTime1) {
		Duration duration = Duration.between(localTime1, LocalTime.now());
		System.out.println(" >>>>>>>>>> Tiempo transcurrido =" +  duration.toMillis() + " Milisegundos.<<<<<<<<<<<");
	}
	
	
	public static Factura initFacturaWithRandomValues(int maxItems) {
		Factura f = new Factura();
		for (int i=0; i<maxItems;i++){
			DetalleFactura df = new DetalleFactura();
			df.setPvp(MIN_LIMIT + new Random().nextDouble() * ( MAX_LIMIT - MIN_LIMIT) );
			df.setConcepto(generateRandomString());
			df.setModelo(generateRandomString());
			f.addDetalle(df);
		}
		return f;
	}
	
	/**
     * This method generates random string
     * @return
     */
    private static String generateRandomString(){
         
        StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }
    
    /**
     * This method generates random numbers
     * @return int
     */
    private static int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }


}
