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

// **************** Planet1  ***************

        Planet1 planet =new Planet1();
        planet.name="apaco";
        planet.size="46236439k";
        planet.radius="8576387596km";

    }
}
