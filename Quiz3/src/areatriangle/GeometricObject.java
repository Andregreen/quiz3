package areatriangle;



public class GeometricObject {
	public static double trianglearea(double sidea, double sideb, double sidec){
		double p=(sidea+sideb+sidec)/2;
		double Area=Math.pow((p*(p-sidea)*(p-sideb)*(p-sidec)),(1/2));
		return Area;
	}
	public static double triangleperimeter(double sidea, double sideb, double sidec){
		double triangleperimeter=sidea+sideb+sidec;
		return triangleperimeter;
	}
}
