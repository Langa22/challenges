import java.io.Serializable;

public class userMenu implements Serializable {
public String name,surname,dob,email;

userMenu(String Name, String Surname,String DoB,String Email){
    this.name=Name;
    this.surname=Surname;
    this.dob=DoB;
    this.email=Email;
}


    public String getName(){
    return name;
}
    public String getSurname(){
        return surname;
    }
    public String getDob(){
        return dob;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
     return name+" "+surname+" "+email+" "+dob;
    }


}


