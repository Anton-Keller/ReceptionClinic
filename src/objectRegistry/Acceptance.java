package objectRegistry;

public class  Acceptance extends RecordPatient{
    private Treatment treatment;
    private String diagnosis;

    public Acceptance(String _familyDoctor, String _nameDoctor, String _patronymicDoctor, Integer _experience,
                       String _postName, String _nomberRoom,
                       String _familyPatient, String _namePatient, String _patronymicPatient,
                        String _nomberOMS, String _nomberSNILS, String _namberPhone,
                        String _date, String _time,
                         String _diagnosis, String _medicament, String _therapy){

        super(_familyDoctor,_nameDoctor,_patronymicDoctor,_experience, _postName,_nomberRoom,
               _familyPatient,_namePatient,_patronymicPatient,_nomberOMS,_nomberSNILS,_namberPhone,
               _date, _time);

        this.diagnosis = _diagnosis;
        Treatment treatment = new Treatment(_medicament,_therapy);

    }

    public Treatment getTreatment(){
        return treatment;
    }
    public String getDiagnosis(){
        return diagnosis;
    }
}
