package distance;


/*
_ID, TimeSt,Country,Province,City,Latitude,Longitude
5605392,2017-06-21 03:21:55.770,CA,AB,Calgary,51.00750,-114.00400
5605468,2017-06-21 05:21:55.873,CA,AB,Calgary,51.09295,-114.14324

POIID, Latitude,Longitude
POI1, 53.546167, -113.485734
POI2, 54.546167, -113.485734
POI3,45.521629, -73.566024
POI4,45.224830, -63.232729
 */


public class FlatEarthDist {
	// returns distance in meters
	public static double distance(double lat1, double lng1, double lat2,double lng2) {
		double a = (lat1 - lat2) * FlatEarthDist.distPerLat(lat1);
		double b = (lng1 - lng2) * FlatEarthDist.distPerLng(lat1);
		return Math.sqrt(a * a + b * b);
	}

	private static double distPerLng(double lat) {
		return 0.0003121092 * Math.pow(lat, 4) + 0.0101182384
				* Math.pow(lat, 3) - 17.2385140059 * lat * lat + 5.5485277537
				* lat + 111301.967182595;
	}

	private static double distPerLat(double lat) {
		return -0.000000487305676 * Math.pow(lat, 4) - 0.0033668574
				* Math.pow(lat, 3) + 0.4601181791 * lat * lat - 1.4558127346
				* lat + 110579.25662316;
	}
	
	public static void main(String[] args) {
		double lt1,lt2,lg1,lg2;
		lt1=51.00750;
		lg1=-114.00400;
		
		double po1lt=53.546167,po1lg=-113.485734;
		double po2lt=54.546167,po2lg=-113.485734;
		double po3lt=45.521629,po3lg=-73.566024;
		double po4lt=45.224830,po4lg=-63.232729;
		
		
		
		double POI1 = distance(51.00750,-114.00400,po1lt,po1lg);
		double POI2 = distance(51.00750,-114.00400,po2lt,po2lg);
		double POI3 = distance(51.00750,-114.00400,po3lt,po3lg);
		double POI4 = distance(51.00750,-114.00400,po4lt,po4lg);
		
		System.out.println("dddd"+POI1);
		
		System.out.println(POI1);
		System.out.println(POI2);
		System.out.println(POI3);
		System.out.println(POI4);
		
		double[] numbers = new double[4];
		numbers[0]=POI1;
		numbers[1]=POI2;
		numbers[2]=POI3;
		numbers[3]=POI4;
		
	//nearest distance
		double myNumber = numbers[0];
		double distance = Math.abs(numbers[0] - myNumber);
		int idx = 0;
		for(int c = 1; c < numbers.length; c++){
		    double cdistance = Math.abs(numbers[c] - myNumber);
		    if(cdistance < distance){
		        idx = c;
		        distance = cdistance;
		    }
		}
		double theNumber = numbers[idx];
		System.out.println(theNumber);
			}
}
