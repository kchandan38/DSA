package DataStructure.java8practice;
public record Employee(String id,  String name, String cityName){
    public static Employee of(String id,  String name, String cityName){

        return new Employee(id, name, cityName);
    }
}

