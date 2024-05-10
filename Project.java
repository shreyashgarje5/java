import java.util.regex.Pattern;

public class Project {
    public int countValidRegistrationNumbers(String[] registrationNumbers) {
        Pattern registrationNumberPattern = Pattern.compile("\\d{4}[A-Z]{3}\\d{3}");
        int count = 0;

        for (String registrationNumber : registrationNumbers) {
            if (registrationNumberPattern.matcher(registrationNumber).matches()) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] registrationNumbers = {
                "2022IT009",
                "2021CSE001",
                "2021IT003",
                "2021ME005",
                "2022CSE005",
                "2022CH006",
                "2022IT007",
                "2022ME008",
                "2023CSE009",
                "2023CSE010",
                "2023IT011",
                "2022IT001",
                "InvalidRegistrationNumber"
        };

        RegistrationNumberCounter counter = new RegistrationNumberCounter();
        int validCount = counter.countValidRegistrationNumbers(registrationNumbers);
        System.out.println("Valid Registration Numbers Count: " + validCount);
    }
}

