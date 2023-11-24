public class Lab02 {
	public static void main(String[] args) {
		// 4.
		AirPurifier a = new AirPurifier("Xiaomi Pro", "K69");
		a.turnOn();
		System.out.println(a.getPower()); // true
		System.out.println(a.getFanSpeed()); // 5
        System.out.println(a.getMode()); // Normal
		a.setFanSpeed(10);
		System.out.println(a.getFanSpeed()); // 10
		a.setMode("Sleep");
		System.out.println(a.getMode()); // Sleep
		
		// 5.
		System.out.println(AirPurifier.modelCount); // 1
		AirPurifier.mostPopularModel(); // K69 : 1

        AirPurifier b = new AirPurifier("Xiaomi Lite", "W420");
        System.out.println(b.getPower()); // false
        System.out.println(AirPurifier.modelCount); // 2
        AirPurifier.mostPopularModel(); // K69 : 1 W420 : 1
	}
}
