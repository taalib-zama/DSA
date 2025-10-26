package backlog.Java8;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String natureOfDifference = "Item existing in tax books only";
        List<String> ndList = Arrays.asList("NA", "", "Other items having tax bases but zero book base", "PPE",
                "Provision", "Provisions", "Investment", "Accounts Payable", "Debt Other", "Inventory",
                "Item existing in tax books only", "Curr.A/c Payables", "Curr.Provisions", "PPE & Intangible-Others",
                "PPE & Intangible - Tax Dep.", "Non-Curr.Debts", "Curr.A/c Receivables", "Non-Curr.Other Assets",
                "Non-Curr.Provisions");
        //log.info("Condition status : " + ndList.contains(natureOfDifference) + "Value is present");
        System.out.println(!ndList.contains(natureOfDifference));
    }
}
