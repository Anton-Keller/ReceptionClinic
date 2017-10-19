package myDataBase;

import objectRegistry.*;
import java.util.ArrayList;

public class Data {

    private  ArrayList<CardPatient> myCardPatient = new ArrayList<CardPatient>();
    private  ArrayList<RecordPatient> myRecordPatient = new ArrayList<RecordPatient>();
    private  ArrayList<Doctor> myDoctor = new ArrayList<Doctor>();

    public CardPatient getMyCardPatient(Integer index){
        return myCardPatient.get(index);
    }
    public RecordPatient getMyRecordPatient(Integer index){
        return myRecordPatient.get(index);
    }
    public Doctor getMyDoctor(Integer index){
       return myDoctor.get(index);
    }


    public void addMyCardPatient(CardPatient objectCardPatient){
        this.myCardPatient.add(objectCardPatient);
    }
    public void addMyRecordPatient(RecordPatient objectRecordPatient){

        this.myRecordPatient.add(objectRecordPatient);
    }

    public void addMyDoctor(Doctor objectDoctor){
        this.myDoctor.add(objectDoctor);
    }

    public Integer sizeMyCardPatient(){
        return myCardPatient.size();
    }

    public Integer sizeMyRecordPatient(){
        return myRecordPatient.size();
    }

    public Integer sizeMyDoctor(){
        return myDoctor.size();
    }

    public void Data(){

    }


}
