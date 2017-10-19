package objectRegistry;

public class Person {
   private String family;
   private String name;
   private String patronymic;

public Person(String _family, String _name, String _patronymic){
        this.family = _family;
        this.name = _name;
        this.patronymic = _patronymic;
        }
   public String getFamily(){
        return this.family;
   }
   public String getName(){
        return this.name;
   }
   public String getPatronymic(){
        return this.patronymic;
   }

}
