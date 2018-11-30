public class Converter {
	
	private double convert;
	
	public Converter(double aConversionFactor) {
		convert = aConversionFactor;
	}
	
	public double convertTo(double fromMeasurement) {
		return convert * fromMeasurement;
	}
	
	public double ConvertFrom(double toMeasurement) {
		return toMeasurement / convert;
	}
}