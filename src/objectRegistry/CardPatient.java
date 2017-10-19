package objectRegistry;

public class CardPatient extends Person{

    private String nomberOMS;
    private String nomberSNILS;
    private String namberPhone;

    public CardPatient(String _familyPatient, String _namePatient, String _patronymicPatient,
                       String _nomberOMS, String _nomberSNILS, String _namberPhone){

        super(_familyPatient, _namePatient,_patronymicPatient);

        this.nomberOMS = _nomberOMS;
        this.nomberSNILS = _nomberSNILS;
        this.namberPhone = _namberPhone;
    }

    public String getNomberOMS(){
       return nomberOMS;
    }
    public String getNomberSNILS(){
        return nomberSNILS;
    }
    public String getNamberPhone(){
        return namberPhone;
    }

}
