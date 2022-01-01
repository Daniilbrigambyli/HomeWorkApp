package HomeWorkLevel2Lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook implements BookPhone {

    private final Map<String, Set<String>> phoneSurname = new TreeMap<>();


    @Override
    public void add(String surname, String phoneNumbers) {
        Set<String> phone = phoneSurname.get(surname);
        if (phone == null) {
            Set<String> phoneSet = new HashSet<>();
            phoneSet.add(phoneNumbers);
            phoneSurname.put(surname, phoneSet);
        } else {
            phone.add(phoneNumbers);
            phoneSurname.put(surname, phone);
        }
        
    }

    @Override
    public Set<String> get(String name) {
        return this.phoneSurname.get(name);
    }
}
