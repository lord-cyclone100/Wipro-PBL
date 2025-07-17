import java.util.Scanner;

class Video{
  String videoName;
  boolean checkOut;
  int rating;

  public Video(String name){
    this.videoName = name;
    this.checkOut = false;
    this.rating = 0;
  }

  String getName(){
    return videoName;
  }

  void doCheckout(){
    checkOut = true;
  }

  void doReturn(){
    checkOut = false;
  }

  void receiveRating(int rating){
    this.rating = rating;
  }

  int getRating(){
    return rating;
  }

  boolean getCheckout(){
    return checkOut;
  }
}

class VideoStore {
  private Video[] store;
  private int count;

  public VideoStore() {
    store = new Video[100];
    count = 0;
  }

  public void addVideo(String name) {
    if (count < store.length) {
      store[count] = new Video(name);
      count++;
      System.out.println("Video " + name + " added successfully.");
    } else {
      System.out.println("Inventory is full. Cannot add more videos.");
    }
  }

  public void doCheckout(String name) {
    for (int i = 0; i < count; i++) {
      if (store[i].getName().equalsIgnoreCase(name)) {
        store[i].doCheckout();
        System.out.println("Video " + name + " checked out successfully.");
        return;
      }
    }
    System.out.println("Video " + name + " not found.");
  }

  public void doReturn(String name) {
    for (int i = 0; i < count; i++) {
      if (store[i].getName().equalsIgnoreCase(name)) {
        store[i].doReturn();
        System.out.println("Video " + name + " returned successfully.");
        return;
      }
    }
    System.out.println("Video " + name + " not found.");
  }

  public void receiveRating(String name, int rating) {
    for (int i = 0; i < count; i++) {
      if (store[i].getName().equalsIgnoreCase(name)) {
        store[i].receiveRating(rating);
        System.out.println("Rating " + rating + " has been mapped to the Video " + name);
        return;
      }
    }
    System.out.println("Video " + name + " not found.");
  }

  public void listInventory() {
    System.out.println("Video Name | Checkout Status | Rating");
    for (int i = 0; i < count; i++) {
      System.out.println(store[i].getName() + " | " + store[i].getCheckout() + " | " + store[i].getRating());
    }
  }
}

public class VideoLauncher {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    VideoStore store = new VideoStore();
    int choice;

    do {
      System.out.println("MAIN MENU");
      System.out.println("=========");
      System.out.println("1. Add Videos:");
      System.out.println("2. Check Out Video:");
      System.out.println("3. Return Video:");
      System.out.println("4. Receive Rating:");
      System.out.println("5. List Inventory:");
      System.out.println("6. Exit:");
      System.out.print("Enter your choice (1..6): ");
      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Enter the name of the video you want to add: ");
          String name = sc.nextLine();
          store.addVideo(name);
          break;
        case 2:
          System.out.print("Enter the name of the video you want to check out: ");
          name = sc.nextLine();
          store.doCheckout(name);
          break;
        case 3:
          System.out.print("Enter the name of the video you want to return: ");
          name = sc.nextLine();
          store.doReturn(name);
          break;
        case 4:
          System.out.print("Enter the name of the video you want to rate: ");
          name = sc.nextLine();
          System.out.print("Enter the rating for this video: ");
          int rating = sc.nextInt();
          sc.nextLine();
          store.receiveRating(name, rating);
          break;
        case 5:
          store.listInventory();
          break;
        case 6:
          System.out.println("Exiting...!! Thanks for using the application.");
          break;
        default:
          System.out.println("Invalid choice. Please choose between 1 and 6.");
          break;
      }

    } while (choice != 6);
    sc.close();
  }
}
