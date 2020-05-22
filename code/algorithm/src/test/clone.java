package test;

public class clone {

    public static void main(String[] args){

        Location location = new Location("shenzhen");
        People people = new People("libai",12,location);

        System.out.println("people = " +  people.toString());


        People newPeople = (People)people.clone();
        System.out.println("newPeople - " + newPeople.toString());

        people.setName("zhangfei");
        location.setAddress("guangxi");

        System.out.println("修改location之后: newPeople" +  newPeople.toString());

    }
    
}


class People implements Cloneable{

    private int height;
    private String name;
    private Location location;


    public People(String name ,int height,  Location location){
        this.name = name;
        this.height = height;
        this.location = location;
    }

    public void setName(String name){
        this.name = name ;
    }

    @Override
    public  Object clone(){

        People people = null;

        try {
            //只克隆普通基本数据类型和 String
            people = (People) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //深克隆关键,引用也要进行克隆
        people.location = (Location)location.clone();
        return people;
    }

    @Override
    public String toString(){
        return new StringBuilder().append("People=[")
        .append(" name:" + this.name)
        .append(", height:" + this.height)
        .append(", location:" + this.location)
        .append("]")
        .toString();
    }

}

class Location implements Cloneable{

    private String address;

    public Location(String address){
        this.address = address;
    }

    public void setAddress(String address){
        this.address = address;
    }
    @Override
    public  Object clone(){

        Location location = null;

        try {
            location = (Location) super.clone();
        } catch (Exception e) {
            //TODO: handle exception
        }

        return location;
    }

    @Override
    public String toString(){
        return new StringBuilder().append("Location[")
        .append("location:" + this.address)
        .append("]")
        .toString();
    }

}