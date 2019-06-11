package examples;

public class City implements Comparable<City> {

	int code;
	String name;
	long population;
	
	
	@Override
	public int compareTo(City city) {
		if(city.code == this.code)
			return 0;
		else if(city.code > this.code )
			return 1;
		else
			return -1;
		
	}
	
	public City(int code,String name, long population){
		this.code=code;
		this.name=name;
		this.population=population;
	}

}
