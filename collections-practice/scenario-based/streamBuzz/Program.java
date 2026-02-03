package streamBuzz;

import java.util.*;

public class Program {

    // Register creator
    public void registerCreator(CreatorStats record) {
        CreatorStats.engagementBoard.add(record);
    }

    // Get top post counts
    public Map<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold) {
        Map<String, Integer> result = new LinkedHashMap<>();

        for (CreatorStats cs : records) {
            int count = 0;
            for (double likes : cs.getWeeklyLikes()) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(cs.getCreatorName(), count);
            }
        }
        return result;
    }

    // Calculate average likes
    public double calculateAverageLikes() {
        double total = 0;
        int count = 0;

        for (CreatorStats cs : CreatorStats.engagementBoard) {
            for (double likes : cs.getWeeklyLikes()) {
                total += likes;
                count++;
            }
        }

        return count == 0 ? 0 : total / count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program program = new Program();
        int choice;

        do {
            System.out.println("\n1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("Enter Creator Name:");
                    String name = sc.nextLine();

                    double[] likes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");
                    for (int i = 0; i < 4; i++) {
                        likes[i] = sc.nextDouble();
                    }

                    CreatorStats cs = new CreatorStats(name, likes);
                    program.registerCreator(cs);
                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    double threshold = sc.nextDouble();

                    Map<String, Integer> topPosts =
                            program.getTopPostCounts(CreatorStats.engagementBoard, threshold);

                    if (topPosts.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for (Map.Entry<String, Integer> entry : topPosts.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    double avg = program.calculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + (int) avg);
                    break;

                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

