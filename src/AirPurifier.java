import java.util.ArrayList;
import java.util.Collections;

public class AirPurifier {
    String model;
	String serialNo;
	boolean power;
	int fanSpeed;
	boolean isFilterEmpty;
	int filterLevel;
	String mode;
	int pm;

    static int modelCount;
    static ArrayList<String> modelList = new ArrayList<String>();
	
	AirPurifier (String serialNo, String model) {
		this.serialNo = serialNo;
		this.model = model;
		this.mode = "Off";
		this.pm = 0;
		this.isFilterEmpty = false;
		this.filterLevel = 100;
        modelCount++;
        modelList.add(model);
	}
	
	void turnOn () { power = true; mode = "Normal"; fanSpeed = 5;}
	void turnOff () { power = false; mode = "Off"; fanSpeed = 0;}
	void setFanSpeed (int speed) { this.fanSpeed = speed; }
	void setMode (String mode) { this.mode = mode; }
    void changeFilter () {filterLevel = 100; }
	
	boolean getPower () { return power; }
	String getModel () { return model; }
	String getSerialNo () { return serialNo; }
	int getFanSpeed () { return fanSpeed; }
	String getMode () { return mode; }
	int getPMLevel () { return pm; }
	int getfilterLevel () { return filterLevel; }
	
	static void mostPopularModel () {
        for(String x : modelList) {
            System.out.println(x + " : " + Collections.frequency(modelList,x));
        }
    }
}
