package Models;

// Not: içerisinde static void main barındıran bir sınıf runnable bir class demek

import java.text.MessageFormat;

public class PersonSample {
   public static void main(String[] args) {

       // object nesne newleme işlemine instance alma diyoruz.
       Person person = new Person(); // person object demek , Person object oluşturmak için kullanılan program tipi kalıp.
       person.setAge(17);
       person.setName("Mikhil");
       person.setGender("Male");
       person.setSurname("Can");

       person.eet();

       // |Ad | Soyad | Yas | Cinsiyet
       // Murat | Tan | 27 | Erkek


       // Veritabanından okunan bilgileri ise getter özellikleri ile ekrana yazdırılır

       System.out.println(MessageFormat.format("Ad: {0}, Soyad {1}:, Yas:{2}, Cinsiyet:{3}",person.getName(),person.getSurname(),person.getAge(),person.getGender()));

       Person person2 = new Person();
       person.setAge(25);
       person.setName("Harun");
       person.setGender("Erkek");
       person.setSurname("Tan");


    }
}
