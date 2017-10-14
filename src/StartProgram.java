import java.util.ArrayList;
import java.util.Scanner;

public class StartProgram {

    public static void main(String[] args) {

        ArrayList<CardPatient> myCardPatient = new ArrayList<CardPatient>();
        ArrayList<RecordPatient> myRecordPatient = new ArrayList<RecordPatient>();
        ArrayList<Doctor> myDoctor = new ArrayList<Doctor>();

        Scanner read = new Scanner(System.in);
        boolean flagExit = false;
        do {
           System.out.println("Добро пожаловать в регитратуру!");
           System.out.println("0 - Выход из программы.\n1 - Записать пациента на прием.\n2 - Завести карту пациента.");
           System.out.println("3 - Вывести список карт пациентов.\n4 - Вывести список записей на прием.\n5 - Вывести список докторов.");
            int index = read.nextInt();
           switch (index) {
               case 0:
                   flagExit = true;
               break;
               case 1: {
                   System.out.println("Запись пациента на прием");

                   System.out.print("Введите фамилию доктора: ");
                   String docFamily = read.next();
                   System.out.print("Введите имя доктора: ");
                   String docName = read.next();
                   System.out.print("Введите отчество доктора: ");
                   String docPatronymic = read.next();
                   System.out.print("Введите стаж доктора: ");
                   Integer experience = read.nextInt();
                   System.out.print("Введите должность доктора: ");
                   String post = read.next();
                   System.out.print("Введите номер кабинета: ");
                   String nRoom = read.next();

                   Doctor doctor = new Doctor(docFamily,docName,docPatronymic,
                           experience,post,nRoom);
                   myDoctor.add(doctor);

                   System.out.print("Введите фамилию пациента: ");
                   String patFamily = read.next();
                   System.out.print("Введите имя пациента: ");
                   String patName = read.next();
                   System.out.print("Введите отчество пациента: ");
                   String patPatronymic = read.next();
                   System.out.print("Введите номер ОМС: ");
                   String oms = read.next();
                   System.out.print("Введите номер СНИЛС: ");
                   String snils = read.next();
                   System.out.print("Введите номер телефона : ");
                   String nPhone = read.next();

                   System.out.print("Введите дату: ");
                   String date = read.next();
                   System.out.print("Введите время : ");
                   String time = read.next();

                   RecordPatient recordPatient = new RecordPatient(docFamily,docName,docPatronymic,experience,post,nRoom,
                           patFamily,patName,patPatronymic,oms,snils,nPhone,date,time);

                   myRecordPatient.add(recordPatient);
           }

               break;
               case 2: {
                   System.out.println("Добавление карты пациента");

                   System.out.print("Введите имя: ");
                   String name = read.next();
                   System.out.print("Введите фамилию: ");
                   String family = read.next();
                   System.out.print("Введите отчество: ");
                   String patronymic = read.next();
                   System.out.print("Введите номер ОМС: ");
                   String oms = read.next();
                   System.out.print("Введите номер СНИЛС: ");
                   String snils = read.next();
                   System.out.print("Введите номер телефона: ");
                   String nPhone = read.next();

                   CardPatient cardPatient = new CardPatient(name, family, patronymic, oms, snils, nPhone);
                   myCardPatient.add(cardPatient);
                   cardPatient = null;
                   System.out.println("Добавление карты пациента завершено!\n");
               }
               break;
               case 3: {

                   if(myCardPatient.size()>0) {
                       System.out.println("Карты пациентов");
                       System.out.println("Колличество: "+String.valueOf(myCardPatient.size()) );
                       System.out.println("Список:");
                       for (int i = 0; i < myCardPatient.size(); i++) {
                           CardPatient cardPatient = new CardPatient("", "", "",
                       "", "", "");
                           cardPatient =  myCardPatient.get(i);
                           System.out.println("ID: " + String.valueOf(i + 1));
                           System.out.println("Фамилия: "+cardPatient.getFamily());
                           System.out.println("Имя: "+cardPatient.getName());
                           System.out.println("Отчество: "+cardPatient.getPatronymic());
                           System.out.println("ОМС: "+cardPatient.getNomberOMS());
                           System.out.println("СНИЛС: "+cardPatient.getNomberSNILS());
                           System.out.println("Телефон: " +cardPatient.getNamberPhone() +'\n');
                       }
                   } else System.out.println("Список карт пациентов пуст!\n");
               }

               break;
               case 4: {

                   if(myRecordPatient.size()>0) {
                       System.out.println("Записи на прием");
                       System.out.println("Колличество: "+String.valueOf(myRecordPatient.size()) );
                       System.out.println("Список:");
                       for (int i = 0; i < myRecordPatient.size(); i++) {

                           RecordPatient recordPatient = new RecordPatient("","",
                                   "",0,
                                   "","","","","",
                                   "","","","","");
                           recordPatient = myRecordPatient.get(i);

                           Doctor doctor = new Doctor("","","",
                                   0,"","");
                           doctor = recordPatient.getDoctor();

                           Post post = new Post("","");
                           post = doctor.getPost();

                           CardPatient cardPatient = new CardPatient("","","",
                                   "","","");
                           cardPatient = recordPatient.getPatient();

                           System.out.println("ID: " + String.valueOf(i + 1));
                           System.out.println("Фамилия доктора: "+doctor.getFamily());
                           System.out.println("Имя доктора: "+doctor.getName());
                           System.out.println("Отчество: "+doctor.getPatronymic());
                           System.out.println("Стаж работы: " +doctor.getExperience());
                           System.out.println("Должность: "+post.getName());
                           System.out.println("Кабинет: "+post.getNamberRoom());
                           System.out.println("Фамилия пациента: "+cardPatient.getFamily());
                           System.out.println("Имя пациента: "+cardPatient.getName());
                           System.out.println("Отчество пациента: " +cardPatient.getPatronymic());
                           System.out.println("ОМС пациента: "+cardPatient.getNomberOMS());
                           System.out.println("СНИЛС пациента: "+cardPatient.getNomberSNILS());
                           System.out.println("Номер телефона пациента: "+cardPatient.getNamberPhone());
                           System.out.println("Дата: "+recordPatient.getDate());
                           System.out.println("Время: " +recordPatient.getTime() +'\n');
                       }
                   }else System.out.println("Список записей на прием пуст!\n");
               }

               break;
               case 5: {
                   if(myDoctor.size()>0) {
                       System.out.println("Доктора");
                       System.out.println("Колличество: "+String.valueOf(myDoctor.size()) );
                       System.out.println("Список:");
                       for (int i = 0; i < myDoctor.size(); i++) {
                           Doctor doctor = new Doctor("","","",
                                   0,"","");
                           doctor = myDoctor.get(i);
                           Post post = new Post("","");
                           post = doctor.getPost();
                           System.out.println("ID: " + String.valueOf(i + 1));
                           System.out.println("Фамилия доктора: "+doctor.getFamily());
                           System.out.println("Имя доктора: "+doctor.getName());
                           System.out.println("Отчество: "+doctor.getPatronymic());
                           System.out.println("Стаж работы: " +doctor.getExperience());
                           System.out.println("Должность: "+post.getName());
                           System.out.println("Кабинет: "+post.getNamberRoom()+'\n');
                       }
                   }
               }

               break;
               default:
           }
        }while(!flagExit);

    }

}
