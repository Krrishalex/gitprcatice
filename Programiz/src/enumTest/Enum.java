package enumTest;

enum Size {

	SMALL, MEDIUM, LARGE, EXTRALARGE;

	public String getSize() {
		
		switch(this) {
		case SMALL:
			return "Small";
		
		case MEDIUM:
			
			return "Medium";
		case LARGE:
			return"Large";
		case EXTRALARGE:
			return"ExtraLarge";
		default:
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Size.SMALL.getSize());
	}

}
