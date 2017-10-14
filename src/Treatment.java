
public class Treatment {
    private String medicament;
    private String therapy;

    public Treatment(String _medicament, String _therapy){
        this.medicament = _medicament;
        this.therapy = _therapy;
    }
    public String getMedicament(){
        return medicament;
    }
    public String getTherapy(){
        return therapy;
    }
}
