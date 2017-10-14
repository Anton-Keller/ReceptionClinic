public class Person {
   private String family;
   private String name;
   private String patronymic;

public Person(String _family, String _name, String _patronymic){
        this.family = _family;
        this.name = _name;
        this.patronymic = _patronymic;
        }
   protected String getFamily(){
        return this.family;
   }
   protected String getName(){
        return this.name;
   }
   protected String getPatronymic(){
        return this.patronymic;
   }

}
