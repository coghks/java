package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    //생랼된 생성자 메서드가 있다.>기본생성자(default Constructor)
    public PersonVO(){
        this.name="홍길동";
        this.age=50;
        this.phone="010-1234-1234";
    }
    public PersonVO(String name,int age,String phone){
        //객체를 생성하는 코드는 내부에서 만들어진다.
        this.name=name;
        this.age=age;
        this.phone=phone;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    //getter method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPhone(){
        return phone;
    }
    public String toString(){
        return name+"\t"+age+"\t"+phone;
    }

}
