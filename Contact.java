public class Contact {
    private String name;
    private String number;
    private String email;
    private String address;
    public Contact(String name,String number, String email,String address){
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
public void setAddress(String address){
        this.address = address;
}
public String getAddress(){
        return address;
}



}
