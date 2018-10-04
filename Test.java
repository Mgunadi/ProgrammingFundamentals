
public class Test {

	public static void main(String[] args) {
		  PlayStore store = new PlayStore();
          
          // Adding new readings
          String[] authors1 = {"L. Tolstoy"};
          Book b1 = new Book ("r1", "War and Peace", 12, "The Russian Messenger", "Novel", 1225, authors1);
          
          System.out.println("Genre is" + b1.getGenre());
          store.add(b1.getID(),b1);
          store.showContent();
          
          OS androidV4 = new OS("Android", 4);
          User u1 = new User("u1", "John Doe", "0412000", 2000, androidV4);
          User u2 = new User("u2", "Jane Doe", "0412001", 120, androidV4);
          Game g1 = new Game("g1", "Pokemon", 5, false, androidV4);
          Comment comment1 = new Comment(u1, "This is a fantastic game!");
          System.out.println(g1.getName());
          System.out.println(comment1.getThread());
        
          //g1.addReview(comment1);
          Comment reply1 = new Comment(u2, "I never liked this game!");
          comment1.addReply(reply1);
          
          System.out.println(comment1.getThread());
          g1.showReviews();
	}

}
