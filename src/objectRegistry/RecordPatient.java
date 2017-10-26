package objectRegistry;

public class RecordPatient {
   private Doctor doctor;
   private CardPatient patient;
   private String date;
   private String time;


   public RecordPatient(Doctor lDoctor, CardPatient lPatient, String lDate, String lTime){

       this.doctor = lDoctor;    /*new Doctor(_familyDoctor,_nameDoctor,_patronymicDoctor,
               _experience,_postName,_nomberRoom);*/

       this.patient = lPatient;  /*new CardPatient(_familyPatient,_namePatient,_patronymicPatient,
               _nomberOMS,_nomberSNILS,_namberPhone);*/

       this.date = lDate;
       this.time = lTime;
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
