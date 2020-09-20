package eban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * 3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
 *
 * Создать массив объектов. Вывести:
 *
 * a) список пациентов, имеющих данный диагноз;
 *
 * b) список пациентов, номер медицинской карты которых находится в заданном интервале.
 *
 *  Определить конструкторы и методы setТип(), getТип(), toString().
 *  Определить дополнительно методы в классе, создающем массив объектов.
 *  Задать критерий выбора данных и вывести эти данные на консоль.
 *  В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<Patient> patientList = new ArrayList<>();
        patientList.add(new Patient("Вишнёв", "Андрей", "Алексеевич",
                11, "Тверь", "79562341134",
                4563, new HashSet<>(Collections.singleton("Бронхит"))));

        patientList.add(new Patient("Толкачев", "Артем", "Николаевич",
                14, "Москва", "79302421694",
                4752, new HashSet<>(Collections.singleton("Амилоидоз печени"))));

        patientList.add(new Patient("Никулин", "Анатолий", "Сергеевич",
                34, "Тверь", "79045429431",
                3442, new HashSet<>(Collections.singleton("Ангина"))));

        ArrayPatient arrayPatient = new ArrayPatient(patientList);
        System.out.println("Список пациентов: \n");
        arrayPatient.showPatients();


        System.out.println("Список пациентов с номером мед.карты в промежутке 3000-4600: \n");
        new ArrayPatient(arrayPatient.getPatientsWithMedCardInRange(3000, 4600)).showPatients();


        System.out.println("Список пациентов с Ангиной: \n");
        new ArrayPatient(arrayPatient.getPatientsWithThisDiagnosis("Ангина")).showPatients();



    }
}
