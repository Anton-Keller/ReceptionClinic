package objectRegistry;

public class CardPatient extends Person{

    private String nomberOMS;
    private String nomberSNILS;
    private String namberPhone;

    public CardPatient(String lFamilyPatient, String lNamePatient, String lPatronymicPatient,
                       String lNomberOMS, String lNomberSNILS, String lNamberPhone){

        super(lFamilyPatient, lNamePatient, lPatronymicPatient);
        this.nomberOMS = lNomberOMS;
        this.nomberSNILS = lNomberSNILS;
        this.namberPhone = lNamberPhone;
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
