package objectRegistry;

public class Doctor extends Person{

    private Integer experience;
    private Post doctorPost;

    public Doctor(String lFamilyDoctor, String lNameDoctor, String lPatronymicDoctor, Integer lExperience,
                  Post ldoctorPost) {

        super(lFamilyDoctor, lNameDoctor, lPatronymicDoctor);
        this.experience = lExperience;
        this.doctorPost = ldoctorPost;  /*new Post(_postName,_nomberRoom);*/
    }

    public Integer getExperience(){
        return experience;
    }
    public Post getPost(){
        return doctorPost;
    }
}
