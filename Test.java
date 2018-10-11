
public class Test {

	public static void main(String[] args) {
		  PlayStore store = new PlayStore();
          
          // Create Book
          String[] authors1 = {"L. Tolstoy"};
          Book b1 = new Book ("r1", "War and Peace", 12, "The Russian Messenger", "Novel", 1225, authors1);
          
          // Create Magazine
          Magazine m1 = new Magazine("r3", "Forbes", 8, "Forbes Media", "Business", 50, "World's richest under 30");
          
          // Get genre of book
          System.out.println("Genre is" + b1.getGenre());
          
        
          // create OS
          OS androidV4 = new OS("Android", 4);
          
 
          //create Users
          User u1 = new User("u1", "John Doe", "0412000", 2000, androidV4);
          User u2 = new User("u2", "Jane Doe", "0412001", 120, androidV4);
          User u3 = new User("u3", "Verity", "0412002", 50000, androidV4);
          
          //Create Game
          Game g1 = new Game("g1", "Pokemon", 5, false, androidV4);
          //print name of game
          System.out.println(g1.getName());
          
          
          //Create comment
          Comment comment1 = new Comment(u1, "This is a fantastic game!");
          //print comment
          //comment1.getThread();
        
          //Create 2nd comment and add it as a reply to comment1
          Comment reply1 = new Comment(u2, "I never liked this game!");
          comment1.addReply(reply1);
          //reply1.getThread();
          Comment reply2 = new Comment(u3, "Why not?");
          comment1.addReply(reply2);
          System.out.println("before get thread");
          comment1.getThread();
          
          //Print size and thread of comment1
          //reply1.getThread();
          //System.out.println(comment1.replies.values());
          //comment1.getThread();
          
          //Add comment to game.
          g1.addReview(comment1);
          b1.addReview(comment1);
          g1.showReviews();
          b1.showReviews();
          
          //Show content of store
          store.add(b1.getID(),b1);
          store.add(g1.getID(), g1);
          store.showContent();
          
          
          //Test showReadingOfGenre()
          store.showReadingOfGenre("Novel");
          store.showReadingOfGenre("Business");
	}

}
