import java.util.*;

class CandidateData {
    int candidateId;
    int aptitude;
    int technical;
    int communication;

    CandidateData(int candidateId, int aptitude, int technical, int communication) {
        this.candidateId = candidateId;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getOverallScore() {
        return aptitude + technical + communication;
    }
}

public class Candidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();

        CandidateData[] candidates = new CandidateData[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Candidate " + (i + 1) + ":");

            System.out.print("Candidate ID: ");
            int id = sc.nextInt();

            System.out.print("Aptitude score: ");
            int aptitude = sc.nextInt();

            System.out.print("Technical score: ");
            int technical = sc.nextInt();

            System.out.print("Communication score: ");
            int communication = sc.nextInt();

            candidates[i] = new CandidateData(id, aptitude, technical, communication);
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Arrays.sort(candidates, new Comparator<CandidateData>() {
            public int compare(CandidateData c1, CandidateData c2) {
                if (c1.getOverallScore() != c2.getOverallScore()) {
                    return Integer.compare(c2.getOverallScore(), c1.getOverallScore());
                }
                return Integer.compare(c1.candidateId, c2.candidateId);
            }
        });

        k = Math.min(k, n);

        System.out.println("\nTop " + k + " Candidates:");

        for (int i = 0; i < k; i++) {
            System.out.println("Candidate ID: " + candidates[i].candidateId
                    + ", Overall Score: " + candidates[i].getOverallScore());
        }

        sc.close();
    }
}