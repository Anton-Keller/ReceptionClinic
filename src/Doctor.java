
public class Doctor extends Person{

    private Integer experience;
    private Post myPost;

    public Doctor(String _familyDoctor, String _nameDoctor, String _patronymicDoctor, Integer _experience,
                  String _postName, String _nomberRoom) {
        super(_familyDoctor, _nameDoctor, _patronymicDoctor);
        this.experience = _experience;
        this.myPost = new Post(_postName,_nomberRoom);
    }

    public Integer getExperience(){
        return experience;
    }
    public Post getPost(){
        return myPost;
    }
}
