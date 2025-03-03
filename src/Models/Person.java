package Models;

// ali,ahmet gibi kişilerin sşablonu, Kişi şablonu
public class Person {

    // kisi şablonuna ait özelliklere field ismi veriyoruz
    // private sınıf dışından erişime kapalı
    private String name;
    private  String surname;
    private int age;
    private String gender;

    // getter, setter -> field değer aktarmak ve field değerlerini dışırayı kontrollü bir şekilde getter setter methodlar üzerinden aktarıyoruz.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        // kontrol yapmış olduk
        if(age < 0)
            age = 0;

        this.age = age;
    }
    // getter
    public String getGender() {
        return gender;
    }
    // setter
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void eet(){
        System.out.println("Her kişi beslenir");
    }


}
