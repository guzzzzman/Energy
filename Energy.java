// Jose Guzman
// October 29, 2023
/*Wrote a method that returns the Mechanical Energy of an object.
The method takes as parameters the mass(m), height(h) and velocity(v) of the object.
The method returns the Mechanical Energy.
*/
// File name: Energy.java
// To Compile in terminal type: javac Energy.java
// To Run in terminal type: java Energy
public class Energy{
	public static double energy(double mass, double height, double velocity)
	{
		double g = 9.8;
		return (mass * g * height + 0.5 * mass * velocity * velocity);
	}

	public static double kineticEnergy(double mass, double velocity)
	{
		return (mass * velocity * velocity)/2;
	}

	public static void main (String[] agrs)
	{
		double w = 0, l = 5, h = 10, d = 0, t = 0, m = 0, v = 30, r = 0;
		/*
		Mass   Height   Velocity   Energy   K.Energy
        185    50    30.0     173,900     83,250
        185    55    40.0     247,715     148,000
        185    60    50.0     340,030     231,250
        185    65    60.0     450,845     333,000
        185    70    70.0     580,160     453,250
        185    75    80.0     727,975     592,000
        185    80    90.0     894,290     749,250
        185    85   100.0   1,079,105     925,000
        184    90   110.0   1,275,488     1,113,200
        183    95   120.0   1,487,973     1,317,600
        182   100   130.0   1,716,260     1,537,900
        181   105   140.0   1,960,049     1,773,800
        180   110   150.0   2,219,040     2,025,000
        179   115   160.0   2,492,933     2,291,200
*/

		h = 50;
		System.out.println("\nMass   Height   Velocity   Energy   K.Energy");
		for (m = 185.0; m > 178; m-- )
		{
			System.out.printf("%3.0f   %3.0f   %5.1f   %,9.0f     %-,9.0f \n"
		                         ,m   ,h      ,v      ,energy(m,h,v) ,kineticEnergy(m,v) );

			h+=5;
			v+=10;

			if (v <= 100)
				m++;
		}
	}
}