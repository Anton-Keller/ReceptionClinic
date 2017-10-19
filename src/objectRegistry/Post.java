package objectRegistry;

public class Post {
   private  String name;
   private  String namberRoom;

   public Post(String _name, String _namberRoom){
     this.name = _name;
     this.namberRoom = _namberRoom;
   }

    public String getName(){
       return name;
    }
    public String getNamberRoom(){
        return namberRoom;
    }
}
