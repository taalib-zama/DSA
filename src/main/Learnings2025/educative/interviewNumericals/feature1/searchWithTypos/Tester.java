package educative.interviewNumericals.feature1.searchWithTypos;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        // Driver code
        String titles[] = {"duel","dule","speed","spede","deul","cars"};

        List<List<String>> gt = Solution.groupTitles(titles);
        String query = "spede";

        // Searching for all titles
        for (List<String> g : gt){
            if (g.contains(query))
                System.out.println(g);
        }
    }
}
