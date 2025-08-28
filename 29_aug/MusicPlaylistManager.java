mport java.util.*;
public class MusicPlaylistManager {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner (System.in);
        boolean exit=true;
        String[]arr={"Song 1","Song 2","Song 3","Song 3","Song 4","Song 5"};
        while(exit){
        System.out.println("1.Play all songs  2.Play a song by index  3. Search for a song by name   4. Exit");
        int ask=sc.nextInt();
      switch (ask) {
                case 1:
                    System.out.println("Playing all songs:");
                    for (String s : arr) {
                        System.out.println("Playing: " + s);
                    }
                    break;

                case 2:
                    System.out.print("Enter index (0-" + (arr.length - 1) + "): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < arr.length) {
                        System.out.println("Playing: " + arr[index]);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter song name: ");
                    String song = sc.nextLine();
                    boolean found = false;
                    for (String s : arr) {
                        if (s.equalsIgnoreCase(song)) {
                            System.out.println("Found and playing: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    exit = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
