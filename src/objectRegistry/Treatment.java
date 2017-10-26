package objectRegistry;

public class Treatment {
    private String medicament;
    private String therapy;

    public Treatment(String lMedicament, String lTherapy){
        this.medicament = lMedicament;
        this.therapy = lTherapy;
    }
    public String getMedicament(){
        return medicament;
    }
    public String getTherapy(){
        return therapy;
    }
}
