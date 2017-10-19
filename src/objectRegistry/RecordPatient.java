package objectRegistry;

public class RecordPatient {
   private Doctor doctor;
   private CardPatient patient;
   private String date;
   private String time;


   public RecordPatient(String _familyDoctor, String _nameDoctor, String _patronymicDoctor, Integer _experience,
                             String _postName, String _nomberRoom,
                             String _familyPatient, String _namePatient, String _patronymicPatient,
                             String _nomberOMS, String _nomberSNILS, String _namberPhone,
                             String _date, String _time){

       this.doctor = new Doctor(_familyDoctor,_nameDoctor,_patronymicDoctor,
               _experience,_postName,_nomberRoom);

       this.patient = new CardPatient(_familyPatient,_namePatient,_patronymicPatient,
               _nomberOMS,_nomberSNILS,_namberPhone);

       this.date = _date;
       this.time = _time;
   }
   public Doctor getDoctor(){
       return doctor;
   }
   public CardPatient getPatient(){
       return this.patient;
   }
   public String getDate(){
       return date;
   }
   public String getTime(){
       return time;
   }
}
