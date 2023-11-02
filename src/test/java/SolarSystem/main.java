package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys =new solarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

//   ********** Feature Sun*************
FeatureSun sun =new FeatureSun();
sun.name="panther";
sun.color="black";
sun.temp="123124kelvin";

//  ********* Planet2 ****************

        Planet2 xaros=new Planet2();
        xaros.name="nehaio";
        xaros.color="blue";
        xaros.size="461364252356km";

        
    }
}
