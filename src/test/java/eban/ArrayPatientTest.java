package eban;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ArrayPatientTest{
    private final List<Patient> patients = Arrays.asList(
            new Patient("Вишнёв", "Андрей", "Алексеевич",
                    11, "Тверь", "79562341134",
                    4563, new HashSet<>(Collections.singleton("Бронхит"))),
            new Patient("Толкачев", "Артем", "Николаевич",
                    14, "Москва", "79302421694",
                    4752, new HashSet<>(Collections.singleton("Амилоидоз печени"))),
            new Patient("Никулин", "Анатолий", "Сергеевич",
                    34, "Тверь", "79045429431",
                    3442, new HashSet<>(Collections.singleton("Ангина")))

    );

    private final ArrayPatient arrayPatients = new ArrayPatient(patients);

    private final ArrayPatient arrayPatientWithBronchitis = new ArrayPatient(Collections.singletonList(new Patient("Вишнёв", "Андрей", "Алексеевич",
            11, "Тверь", "79562341134",
            4563, new HashSet<>(Collections.singleton("Бронхит")))));
    private final ArrayPatient arrayPatientsWithMedCardInRange = new ArrayPatient(
            Arrays.asList(new Patient("Вишнёв", "Андрей", "Алексеевич",
            11, "Тверь", "79562341134",
            4563, new HashSet<>(Collections.singleton("Бронхит"))),

            new Patient("Никулин", "Анатолий", "Сергеевич",
                    34, "Тверь", "79045429431",
                    3442, new HashSet<>(Collections.singleton("Ангина"))
            )));

    @Test
    public void testGetPatientsWithBronchitis(){
        ArrayPatient patientsWithBronchitis = new ArrayPatient(arrayPatients.getPatientsWithThisDiagnosis("Бронхит"));

        Assert.assertEquals(arrayPatientWithBronchitis, patientsWithBronchitis);
    }

    @Test
    public void testGetPatientsWithMedCardInRange(){
        ArrayPatient patientsWithMedCardInRange = new ArrayPatient(arrayPatients.getPatientsWithMedCardInRange(3000,4600));

        Assert.assertEquals(patientsWithMedCardInRange, this.arrayPatientsWithMedCardInRange);
    }

}
