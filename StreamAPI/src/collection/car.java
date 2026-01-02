package collection;

public class car {
	private String carName;
	private String carType;
	public String getCarName() {
		return carName;
	} 
	public String getCarType() {
		return carType;
	} 
	private car(carBuilder cb) {
		this.carName = cb.carName;
		this.carType = cb.carType;
	}
	
	public static carBuilder getBuild() {
		return new carBuilder();
	}
	
	public static class carBuilder{
		private String carName;
		private String carType;
		
		public carBuilder setCarName(String carName) {
			this.carName = carName;
			return this;
		}
		public carBuilder setCarType(String carType) {
			this.carType = carType;
			return this;
		}
		public car build() {
			return new car(this);
		}
		  
	}
	 
}
