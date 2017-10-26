package objectRegistry;

public class  Acceptance extends RecordPatient{
    private Treatment treatment;
    private String diagnosis;

    public Acceptance(Doctor lDoctor, CardPatient lPatient, String lDate, String lTime,
                      String _diagnosis, Treatment lTreatment){


        super(lDoctor, lPatient, lDate, lTime);

        this.diagnosis = _diagnosis;
        Treatment treatment = lTreatment; /* new Treatment(_medicament,_therapy);*/

    }

    public Treatment getTreatment(){
        return treatment;
    }
    public String getDiagnosis(){
        return diagnosis;
    }
}
