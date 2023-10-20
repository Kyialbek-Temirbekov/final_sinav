package Models;

import Views.View;
import Views.ViewImpl;

import java.util.HashMap;
import java.util.List;

public class DoActionModelRepository {
    private final ReadModelRepository readModelRepository;
    private final View myWindow;

    private HashMap<String, Integer> ageCount;
    public DoActionModelRepository(View view) {
        readModelRepository = ReadModelRepository.getInstance(view);
        myWindow = view;
    }
    public void doAction() {
        ageCount = new HashMap<>();
        List<String> people = readModelRepository.getPeople();
        people.forEach(p -> {
            setAgeCount(Integer.parseInt(p.replaceAll("\\D", "")));
        });
        StringBuilder sb = new StringBuilder();
        this.ageCount.forEach((k,v) -> {
            sb.append(k).append(" ").append(v).append("\n");
        });
        myWindow.setText(sb.toString());
    }

    private void setAgeCount(int age) {
        String b = "Бөбөктөр";
        String o = "Өспүрүмдөр";
        String u = "Улуу кишилер";
        String k = "Улгайгандар";

        if(age < 10) {
            if(ageCount.containsKey(b))
                ageCount.put(b, ageCount.get(b) + 1);
            else
                ageCount.put(b, 1);
        }
        else if(age < 19) {
            if(ageCount.containsKey(o))
                ageCount.put(o, ageCount.get(o) + 1);
            else
                ageCount.put(o, 1);
        }
        else if(age < 60) {
            if(ageCount.containsKey(u))
                ageCount.put(u, ageCount.get(u) + 1);
            else
                ageCount.put(u, 1);
        }
        else {
            if(ageCount.containsKey(k))
                ageCount.put(k, ageCount.get(k) + 1);
            else
                ageCount.put(k, 1);
        }
    }
}
