import java.util.regex.*;

public class SY2022bit009 {
    public static void main(String[] args) {
        String[] registrationNumbers = {
                "2022IT009",
                "2015CSE001",
                "2021IT003",
                "2019ME005",
                "2022TTE005",
                "2022CH006",
                "2018IT007",
                "2022CE008",
                "2026CSE009",
                "2023CSE010",
                "2040IT011",
                "2022IT001",
                "InvalidRegistrationNumber"
        };

        Reg project = new Reg();
        int validCount = project.getValidRegistrationsCount(registrationNumbers);
        System.out.println("Valid Registration Numbers Count: " + validCount);
    }

    public int getValidRegistrationsCount(String[] registrations) {
        int count = 0;

        // Loop through each registration number
        for (String registrationNumber : registrations) {
            // Check if the registration number matches the criteria (2020-2023 and IT, ME, or CSE)
            if (isValidRegistrationNumber(registrationNumber)) {
                count++;
            }
        }

        return count;
    }

    private boolean isValidRegistrationNumber(String registrationNumber) {
        // Updated regex to match valid registration numbers for 2020-2023 and departments IT, ME, CSE (case-insensitive)
        String pattern = "20[20-23]*(IT|ME|CSE)\\d{3}$";
        return registrationNumber.toUpperCase().matches(pattern);
    }
}

