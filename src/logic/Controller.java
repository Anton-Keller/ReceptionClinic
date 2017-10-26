package logic;

import objectRegistry.*;
import service.Data;
import java.util.Scanner;


public class Controller {

   private Data myData = new Data();
   private Scanner read = new Scanner(System.in);

    public void showMenu(){
        System.out.println("\nДобро пожаловать в регитратуру!");
        System.out.println("0 - Выход из программы.\n1 - Записать пациента на прием.\n2 - Завести карту пациента.");
        System.out.println("3 - Вывести список карт пациентов.\n4 - Вывести список записей на прием.\n5 - Вывести список докторов.");
    }

    public boolean commandFunction(Integer index) {

        boolean flagExit = false;

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
                   String namePost = read.next();
                   System.out.print("Введите номер кабинета: ");
                   String nRoom = read.next();

                   Post doctorPost = new Post(namePost,nRoom);

                   Doctor doctor = new Doctor(docFamily, docName, docPatronymic,
                           experience, doctorPost);

                   myData.addMyDoctor(doctor); // myDoctor.add();

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

                   CardPatient cardPatient = new CardPatient(patFamily,patName,patPatronymic,oms,snils,nPhone);

                   System.out.print("Введите дату: ");
                   String date = read.next();
                   System.out.print("Введите время : ");
                   String time = read.next();

                   RecordPatient recordPatient = new RecordPatient(doctor,cardPatient, date, time);

                  myData.addMyRecordPatient(recordPatient); // myRecordPatient.add(recordPatient);
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

                   myData.addMyCardPatient(cardPatient); // myCardPatient.add(cardPatient);

                   cardPatient = null;
                   System.out.println("Добавление карты пациента завершено!\n");
               }
               break;
               case 3: {

                   if (myData.sizeMyCardPatient() > 0) {
                       System.out.println("Карты пациентов");
                       System.out.println("Колличество: " + String.valueOf(myData.sizeMyCardPatient()));
                       System.out.println("Список:");
                       for (int i = 0; i < myData.sizeMyCardPatient(); i++) {

                           CardPatient cardPatient;
                           cardPatient = myData.getMyCardPatient(i); // myCardPatient.get(i);

                           System.out.println("ID: " + String.valueOf(i + 1));
                           System.out.println("Фамилия: " + cardPatient.getFamily());
                           System.out.println("Имя: " + cardPatient.getName());
                           System.out.println("Отчество: " + cardPatient.getPatronymic());
                           System.out.println("ОМС: " + cardPatient.getNomberOMS());
                           System.out.println("СНИЛС: " + cardPatient.getNomberSNILS());
                           System.out.println("Телефон: " + cardPatient.getNamberPhone() + '\n');
                       }
                   } else System.out.println("Список карт пациентов пуст!\n");
               }

               break;
               case 4: {

                   if (myData.sizeMyRecordPatient() > 0) {
                       System.out.println("\nЗаписи на прием");
                       System.out.println("Колличество записей: " + String.valueOf(myData.sizeMyRecordPatient()));
                       System.out.println("Список:");
                       for (int i = 0; i < myData.sizeMyRecordPatient(); i++) {

                           RecordPatient recordPatient;
                           recordPatient = myData.getMyRecordPatient(i); // myRecordPatient.get(i);

                           Doctor doctor;
                           doctor = recordPatient.getDoctor();

                           Post post;
                           post = doctor.getPost();

                           CardPatient cardPatient;
                           cardPatient = recordPatient.getPatient();

                           System.out.println("ID: " + String.valueOf(i + 1));
                           System.out.println("Фамилия доктора: " + doctor.getFamily());
                           System.out.println("Имя доктора: " + doctor.getName());
                           System.out.println("Отчество: " + doctor.getPatronymic());
                           System.out.println("Стаж работы: " + doctor.getExperience());
                           System.out.println("Должность: " + post.getName());
                           System.out.println("Кабинет: " + post.getNamberRoom());
                           System.out.println("\nФамилия пациента: " + cardPatient.getFamily());
                           System.out.println("Имя пациента: " + cardPatient.getName());
                           System.out.println("Отчество пациента: " + cardPatient.getPatronymic());
                           System.out.println("ОМС пациента: " + cardPatient.getNomberOMS());
                           System.out.println("СНИЛС пациента: " + cardPatient.getNomberSNILS());
                           System.out.println("Номер телефона пациента: " + cardPatient.getNamberPhone());
                           System.out.println("Дата: " + recordPatient.getDate());
                           System.out.println("Время: " + recordPatient.getTime() + '\n');
                       }
                   } else System.out.println("Список записей на прием пуст!\n");
               }

               break;
               case 5: {
                   if (myData.sizeMyDoctor() > 0) {
                       System.out.println("Доктора");
                       System.out.println("Колличество: " + String.valueOf(myData.sizeMyDoctor()));
                       System.out.println("Список:");
                       for (int i = 0; i < myData.sizeMyDoctor(); i++) {

                           Doctor doctor;
                           doctor = myData.getMyDoctor(i); // myDoctor.get(i);

                           Post post;
                           post = doctor.getPost();

                           System.out.println("ID: " + String.valueOf(i + 1));
                           System.out.println("Фамилия доктора: " + doctor.getFamily());
                           System.out.println("Имя доктора: " + doctor.getName());
                           System.out.println("Отчество: " + doctor.getPatronymic());
                           System.out.println("Стаж работы: " + doctor.getExperience());
                           System.out.println("Должность: " + post.getName());
                           System.out.println("Кабинет: " + post.getNamberRoom() + '\n');
                       }
                   }
               }

               break;
               default:
           }
          return flagExit;
   }
}
