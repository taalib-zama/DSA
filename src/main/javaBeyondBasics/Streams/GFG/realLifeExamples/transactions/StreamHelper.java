package javaBeyondBasics.Streams.GFG.realLifeExamples.transactions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamHelper {
    public static void main(String[] args) {
        //add transactions
        List<Transaction> transactions = new ArrayList<>();
        //add values to transaction list
        transactions.add(new Transaction(1L, 100L, "General"));
        transactions.add(new Transaction(3L, 80L,"Grocery"));
        transactions.add(new Transaction(6L, 120L,"Grocery"));
        transactions.add(new Transaction(7L, 40L,"General"));
        transactions.add(new Transaction(10L, 50L,"Grocery"));
        //using streams to filter items of grocery type.
        List<Long> filteredTransactions = transactions.stream().filter(transaction -> transaction.getType().equals(TransactionConstants.GROCERY))
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getId).toList();


    }
}
