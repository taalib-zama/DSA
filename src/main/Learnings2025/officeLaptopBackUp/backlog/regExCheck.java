package backlog;

import java.util.regex.Pattern;

public class regExCheck {
    private static final String REGEX = "^[\\p{Space}&'-_!@#$()*,)(:/]+$";




    public static void main(String[] args) {
        String[] sampleValues = {
                "poly (ether alcohols)",
                "POLYMERs OF ETHYLENE, IN PRIMARY FORMS - POLYETHYLENE HAVING A SPECIFIC GRAVITY OF LESS THAN 0.94 : OTHER",
                "poly (ether alcohols)",
                "NON-IONIc",
                "Bad|Pipe",
                "Other",
                "general description",
                "X.-ORGANO-INORGANIC COMPOUNDS, HETEROCYCLIC COMPOUNDS, NUCLEIC ACIDS AND THEIR SALTS, AND SULPHONAMIDES:ORGANO-SULPHUR COMPOUNDS - THIOCARBAMATES AND DITHIOCARBAMATES :Other",
                "CARBOn (CARBON BLACKS AND OTHER FORMS OF CARBON NOT ELSEWHERE SPECIFIED OR INCLUDED) - CARBON (CARBON BLACKS AND OTHER FORMS OF CARBON NOT ELSEWHERE SPECIFIED OR INCLUDED) : OTHER"
        };

        for (String value : sampleValues) {
            if (Pattern.matches(REGEX, value)) {
                System.out.println("HsnOrSacDesc is not valid: " + value);
            } else {
                System.out.println("Valid: " + value);
            }
        }
    }
}
